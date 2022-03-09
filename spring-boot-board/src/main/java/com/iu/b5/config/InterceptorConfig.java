package com.iu.b5.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import com.iu.b5.interceptor.NoticeInterceptor;
import com.iu.b5.interceptor.TestInterceptor;
import com.iu.b5.interceptor.UpdateInterceptor;

@Configuration
public class InterceptorConfig implements WebMvcConfigurer {

	@Autowired
	private TestInterceptor testInterceptor;
	
	@Autowired
	private NoticeInterceptor noticeInterceptor;
	
	@Autowired
	private UpdateInterceptor updateInterceptor;
	
	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		
		//1. 적용할 Interceptor 등록... (메서드체이닝으로 2,3번도 같이)
		registry.addInterceptor(testInterceptor)
		//2. Interceptor를 사용할 URL
				.addPathPatterns("/notice/*")
		//3. Interceptor를 제외할 URL
				.excludePathPatterns("/qna/*")
				.excludePathPatterns("/notice/list")
				.excludePathPatterns("/notice/select");
		
		/*------------------------------------notice Interceptor ------------------------------------*/
		//1. 적용할 Interceptor 등록... (메서드체이닝으로 2,3번도 같이)
		/*
		registry.addInterceptor(noticeInterceptor)
		//2. Interceptor를 사용할 URL
				.addPathPatterns("/notice/*")
		//3. Interceptor를 제외할 URL
				.excludePathPatterns("/qna/*")
				.excludePathPatterns("/notice/list")
				.excludePathPatterns("/notice/select");
		*/
				
		
	
		/*------------------------------------update Interceptor ------------------------------------*/
		registry.addInterceptor(updateInterceptor)
				.addPathPatterns("/notice/update")
				.addPathPatterns("/qna/update");
		
	}
	
}
