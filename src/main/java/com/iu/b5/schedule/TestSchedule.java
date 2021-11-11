package com.iu.b5.schedule;

import java.util.Calendar;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import com.iu.b5.board.notice.NoticeMapper;
import com.iu.b5.board.notice.NoticeVO;

@Component
public class TestSchedule {
	@Autowired
	private NoticeMapper noticeMapper;

//	@Scheduled(cron = "*/30 * * * * *")
	public void cronScheduleTest() throws Exception {
		//notice 30초 간격으로 insert 진행..??
		Calendar ca = Calendar.getInstance();
		System.out.println("notice insert!!" + ca.getTime());
		
		NoticeVO noticeVO = new NoticeVO();
		noticeVO.setWriter("test");
		noticeVO.setTitle("scheduling test");
		noticeVO.setContents("scheduling test");
		noticeMapper.setInsert(noticeVO);
	}
	
//	@Scheduled(fixedRate = 2000, initialDelay = 2000)
	public void fixRateScheduleTest() throws Exception {
		Calendar calendar = Calendar.getInstance();
		Thread.sleep(3000);
		System.out.println("fixRate: "+calendar.getTime());
	}
	
//	@Scheduled(fixedRate = 3000, initialDelay = 3000)
	public void fixDelayScheduleTest() throws Exception {
		Calendar calendar = Calendar.getInstance();
		System.out.println("fixDealy: "+calendar.getTime());
	}
}
