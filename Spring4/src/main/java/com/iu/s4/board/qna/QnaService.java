package com.iu.s4.board.qna;

import java.io.File;
import java.util.List;

import javax.servlet.ServletContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.iu.s4.board.BoardDTO;
import com.iu.s4.board.BoardFileDTO;
import com.iu.s4.board.BoardService;
import com.iu.s4.board.util.FileManager;
import com.iu.s4.board.util.Pager;

@Service
public class QnaService implements BoardService {

	@Autowired
	private QnaDAO qnaDAO;
	
	@Autowired
	private ServletContext sContext;
	
	@Autowired
	private FileManager fileManager;
	
	@Override
	public List<BoardDTO> getList(Pager pager) throws Exception {
		long totalCount = qnaDAO.getCount(pager);
		pager.makeNum(totalCount);
		pager.makeRow();
		
		return qnaDAO.getList(pager);
	}

	@Override
	public BoardDTO getSelect(BoardDTO boardDTO) throws Exception {
		// TODO Auto-generated method stub
		return qnaDAO.getSelect(boardDTO);
	}
	
	public List<BoardFileDTO> getFile(BoardDTO boardDTO) throws Exception {
		return qnaDAO.getFile(boardDTO);
	}

	@Override
	public int setInsert(BoardDTO boardDTO, MultipartFile[] files) throws Exception {
		// TODO Auto-generated method stub
		int result = qnaDAO.setInsert(boardDTO);
		
		String realPath = sContext.getRealPath("/resources/upload/qna/");
		File file = new File(realPath);
		
		for (MultipartFile mf : files) {
			String fileName = fileManager.fileSave(mf, file);
			
			BoardFileDTO boardFileDTO = new BoardFileDTO();
			boardFileDTO.setFileName(fileName);
			boardFileDTO.setOriName(mf.getOriginalFilename());
			boardFileDTO.setNum(boardDTO.getNum());
			
			result = qnaDAO.setFile(boardFileDTO);
		}
		
		return result;
	}

	@Override
	public int setDelete(BoardDTO boardDTO) throws Exception {
		// TODO Auto-generated method stub
		String realPath = "/resources/upload/qna";
		
		List<BoardFileDTO> files = qnaDAO.getFile(boardDTO);
		
		for (BoardFileDTO dto : files) {
			File file = new File(realPath, dto.getFileName());
			file.delete();
		}
		
		
		return qnaDAO.setDelete(boardDTO);
	}

	@Override
	public int setUpdate(BoardDTO boardDTO) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	
	//	 답글
	public int setReply(QnaDTO qnaDTO) throws Exception {
		//1. 부모 정보 조회

		QnaDTO parent = (QnaDTO) qnaDAO.getSelect(qnaDTO);
		qnaDTO.setRef(parent.getRef());
		qnaDTO.setStep(parent.getStep()+1);
		qnaDTO.setDepth(parent.getDepth()+1);
		
		
		
		//2. update
		int result = qnaDAO.setReplyUpdate(parent);
		
		//3. insert
		result = qnaDAO.setReply(qnaDTO);

		return result;
	}
	
}
