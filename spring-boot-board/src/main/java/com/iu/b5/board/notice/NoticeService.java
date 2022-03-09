package com.iu.b5.board.notice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.iu.b5.board.BoardFileVO;
import com.iu.b5.board.BoardService;
import com.iu.b5.board.BoardVO;
import com.iu.b5.util.FileManager;
import com.iu.b5.util.Pager;


@Service
public class NoticeService implements BoardService {

	@Autowired
	private FileManager fileManager;
	
	@Autowired
	private NoticeMapper noticeMapper;
	
	@Override
	public int setInsert(BoardVO boardVO, MultipartFile[] files) throws Exception {
		// TODO Auto-generated method stub
		
		
		int result = noticeMapper.setInsert(boardVO);
		
		//파일 저장 반복
		if (files != null) {
	
			for (MultipartFile mf : files) {
				if (mf.isEmpty()) {
					continue;
				}
				
				BoardFileVO boardFileVO = new BoardFileVO();
				
				boardFileVO.setNum(boardVO.getNum());
				
				String fileName = fileManager.getUseServletContext("/upload/notice/", mf);
				boardFileVO.setFileName(fileName);
				boardFileVO.setOriName(mf.getOriginalFilename());
				
				result = noticeMapper.setFileInsert(boardFileVO);
			}
		}
		return result;
	}

	@Override
	public int setUpdate(BoardVO boardVO) throws Exception {
		// TODO Auto-generated method stub
		return noticeMapper.setUpdate(boardVO);
	}

	@Override
	public int setDelete(BoardVO boardVO) throws Exception {
		// TODO Auto-generated method stub
		return noticeMapper.setDelete(boardVO);
	}

	@Override
	public BoardVO getSelect(BoardVO boardVO) throws Exception {
		// TODO Auto-generated method stub
		int result = noticeMapper.setHitUpdate(boardVO);
		
		return noticeMapper.getSelect(boardVO);
	}

	@Override
	public List<BoardVO> getList(Pager pager) throws Exception {
		// TODO Auto-generated method stub
		pager.makeRow();

		Long totalCount = noticeMapper.getTotalCount(pager);
		pager.makeNum(totalCount);
		
		
		return noticeMapper.getList(pager);
	}

	
	
}
