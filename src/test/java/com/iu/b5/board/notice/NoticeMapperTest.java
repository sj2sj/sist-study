package com.iu.b5.board.notice;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.iu.b5.board.BoardVO;
import com.iu.b5.util.Pager;

@SpringBootTest
class NoticeMapperTest {

	@Autowired
	private NoticeMapper noticeMapper;
	
	//@Test
	void getSelect() throws Exception {
		NoticeVO noticeVO = new NoticeVO();
		noticeVO.setNum(2);
		
		noticeVO = (NoticeVO) noticeMapper.getSelect(noticeVO);
		
		System.out.println("ss:"+noticeVO.getContents());
		
		assertNotNull(noticeVO);
	}
	
	//@Test
	void getList() throws Exception {
		Pager pager = new Pager();
		
		List<BoardVO> ar = noticeMapper.getList(pager);
		
		assertNotEquals(0, ar.size());
	}
	
	//@Test
	void setDeleteTest() throws Exception {
		NoticeVO noticeVO = new NoticeVO();
		noticeVO.setNum(4);
		
		int result = noticeMapper.setDelete(noticeVO);
		
		assertEquals(1, result);
	}
	
	//@Test
	void setUpdateTest() throws Exception {
		NoticeVO noticeVO = new NoticeVO();
		
		noticeVO.setTitle("title update");
		noticeVO.setContents("test update");
		noticeVO.setNum(4);
		
		int result = noticeMapper.setUpdate(noticeVO);
		
		assertEquals(1, result);
	}
	
	@Test
	void setInsertTest() throws Exception {
		
		
		for (int i = 0; i < 100; i++) {
			NoticeVO noticeVO = new NoticeVO();
			noticeVO.setTitle("title"+i);
			noticeVO.setContents("test"+i);
			noticeVO.setWriter("writerTest"+i);
			
			int result = noticeMapper.setInsert(noticeVO);
			
			if (i%10 == 0) {
				Thread.sleep(500);
			}
		}
		
		
	}

}
