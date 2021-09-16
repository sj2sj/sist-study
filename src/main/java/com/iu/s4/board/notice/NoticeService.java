package com.iu.s4.board.notice;

import java.io.File;
import java.util.List;
import java.util.UUID;

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
public class NoticeService implements BoardService {

	@Autowired
	private NoticeDAO noticeDAO;
	
	@Autowired
	private ServletContext sContext;
	
	@Autowired
	private FileManager fileManager;
	
	@Override
	public List<BoardDTO> getList(Pager pager) throws Exception {
		long totalCount = noticeDAO.getCount(pager);
		
		System.out.println("kind: " + pager.getKind());
		System.out.println("search: " + pager.getSearch());
		
		pager.makeNum(totalCount);
		pager.makeRow();
		
		return noticeDAO.getList(pager);
	}

	@Override
	public BoardDTO getSelect(BoardDTO boardDTO) throws Exception {
		// TODO Auto-generated method stub
		
		
		return noticeDAO.getSelect(boardDTO);
	}
	
	//게시글 조회 시 file 리턴
	public List<BoardFileDTO> getFile(BoardDTO boardDTO) throws Exception {
		return noticeDAO.getFile(boardDTO);
	}

	@Override
	public int setInsert(BoardDTO boardDTO, MultipartFile[] files) throws Exception {
		// TODO Auto-generated method stub
				
		int result = noticeDAO.setInsert(boardDTO);
		
		
		//1. 어느폴더?
		String realPath = sContext.getRealPath("resources/upload/notice/");
		File file = new File(realPath);
		
		
		
		for (MultipartFile mf : files) {
			String fileName = fileManager.fileSave(mf, file);
			System.out.println(fileName);
		
			BoardFileDTO boardFileDTO = new BoardFileDTO();
			boardFileDTO.setFileName(fileName);
			boardFileDTO.setOriName(mf.getOriginalFilename());
			boardFileDTO.setNum(boardDTO.getNum());
			
			result = noticeDAO.setFile(boardFileDTO);
		}
		
		
		
		return result;
	}

	@Override
	public int setDelete(BoardDTO boardDTO) throws Exception {
		// TODO Auto-generated method stub
		
		String realPath = sContext.getRealPath("/resources/upload/notice");
		
		System.out.println("re: " + realPath);
		List<BoardFileDTO> files = noticeDAO.getFile(boardDTO);
		
		for (BoardFileDTO dto : files) {
			File file = new File(realPath, dto.getFileName());
			file.delete();
		}
		
		
		return noticeDAO.setDelete(boardDTO);
	}

	@Override
	public int setUpdate(BoardDTO boardDTO) throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	
	
}
