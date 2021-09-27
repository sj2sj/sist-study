package com.iu.s4.board.notice;

import java.io.File;
import java.util.HashMap;
import java.util.List;
import java.util.UUID;

import javax.servlet.ServletContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.iu.s4.board.BoardDTO;
import com.iu.s4.board.BoardFileDTO;
import com.iu.s4.board.BoardService;
import com.iu.s4.board.CommentsDTO;
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
	
	public int setCommentUpdate(CommentsDTO commentsDTO) throws Exception {
		return noticeDAO.setCommentUpdate(commentsDTO);
	}
	
	public int setCommentDelete(CommentsDTO commentsDTO) throws Exception {
		return noticeDAO.setCommentDelete(commentsDTO);
	}
	
	public List<CommentsDTO> getCommentList(CommentsDTO commentsDTO, Pager pager) throws Exception {
		long totalCount = noticeDAO.getCommentCount(commentsDTO);
		
		pager.setPerPage(5L);
		pager.makeRow();
		pager.makeNum(totalCount);
		
		System.out.println(totalCount);
		
		HashMap<String, Object> map = new HashMap<String, Object>();
		
		map.put("comments", commentsDTO);
		map.put("pager", pager);
		
		return noticeDAO.getCommentList(map);
	}
	
	public int setComment(CommentsDTO commentsDTO) throws Exception {
		return noticeDAO.setComment(commentsDTO);
	}
	
	
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
	
	
	public int setFileDelete(BoardFileDTO boardFileDTO) throws Exception {
		//폴더에서도 파일을 삭제해야 함!!
		String realPath = sContext.getRealPath("/resources/upload/notice/");
		File file = new File(realPath, boardFileDTO.getFileName());
		fileManager.fileDelete(file);
		
		return noticeDAO.setFileDelete(boardFileDTO);
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
