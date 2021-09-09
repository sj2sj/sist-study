package com.iu.s4.qna;

import static org.junit.Assert.*;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.iu.s4.MyJunitTest;
import com.iu.s4.board.qna.QnaDAO;
import com.iu.s4.board.qna.QnaDTO;

public class QnaDAOTest extends MyJunitTest {

	@Autowired
	private QnaDAO qnaDAO;
	
	@Test
	public void setInsertTest() throws Exception {
		
		for (int i = 13; i < 73; i++) {
			QnaDTO qnaDTO = new QnaDTO();
			qnaDTO.setContents("contentTEST"+i);
			qnaDTO.setTitle("qt"+i);
			qnaDTO.setWriter("qw"+i);
			
			int rsult = qnaDAO.setInsert(qnaDTO);
			
			if (i % 10 == 0) {
				Thread.sleep(500);
			}
		}
		
		System.out.println("=========end==========");
		
	}

}
