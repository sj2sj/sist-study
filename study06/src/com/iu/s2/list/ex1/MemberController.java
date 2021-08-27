package com.iu.s2.list.ex1;

import java.util.ArrayList;
import java.util.Scanner;

public class MemberController {
	
	private MemberDAO dao;
	private MemberView view;
	
	ArrayList<MemberDTO> ar; //전역에서 쓰여야하기 때문에..
	Scanner sc;
	
	public MemberController() {
		dao = new MemberDAO();
		view = new MemberView();
		ar = dao.memberInit();
		sc = new Scanner(System.in);
	}
	
	public void start() {
		
		
		//1. 회원가입
		//2. 로그인 
		//3. 종료

		MemberDAO dao = new MemberDAO();

		boolean flag = true;
		while (flag) {
			
			if (MemberSession.SESSION.get("member") != null) {
				//로그인 성공한 후
				afterLogin();
			} else {
				//로그인 전, 또는 실패
				flag = beforeLogin();
			}
			
			
			
		}
		
		
	} //start end
	

	/*
	 * afterLogin()
	 * 로그인 후에 실행되는 메서드
	 * 
	 */
	private void afterLogin() {
		System.out.println("1. MyPage");
		System.out.println("2. Logout");
		
		int select = sc.nextInt();
		
		if (select == 1) {
			view.view();
		} else {
			System.out.println("로그아웃");
			
//			MemberSession.SESSION.put("member", null);
//			MemberSession.SESSION.clear();
			MemberSession.SESSION.remove("member");
		}
	}
	
	
	/*
	 * beforeLogin()
	 * 로그인 전일 때 실행되는 메서드
	 * return: boolean flag
	 */
	private boolean beforeLogin() {
		System.out.println("1. 회원가입 ");
		System.out.println("2. 로그인 ");
		System.out.println("3. 종료 ");
		
		
		int select = sc.nextInt();
		
		boolean flag = true;
		
		switch(select) {
		case 1: //--------------------------------------회원가입
			dao.memberAdd(ar);
			break;
			
		case 2: //--------------------------------------로그인
			MemberDTO dto = dao.memberLogin(ar);
			if (dto != null) {
				System.out.println("로그인 성공!");
				MemberSession.SESSION.put("member", dto);
			} else {
				System.out.println("로그인 실패");
			}
			break;
			
		default:
			flag = false;
			break;
		}
		return flag;
	}
	
	
}
