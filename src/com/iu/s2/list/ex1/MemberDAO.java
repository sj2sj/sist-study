package com.iu.s2.list.ex1;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

//data에 접근하는 것.
public class MemberDAO {

	private String info;
	private Scanner sc;
	
	public MemberDAO() {
		info = "iu,pw1,32,suji,pw2,27,choa,pw3,30";
	}
	
	/*
	 * memberLogin
	 * Scanner로 id, pw를 입력받아서 MemberDTO에 추가 
	 * 매개변수로 ArrayList를 받아서 입력받은 id, pw가 일치하는 것을 찾아서 DTO를 return
	 */
	public MemberDTO memberLogin(ArrayList<MemberDTO> ar) {
		sc = new Scanner(System.in);
		MemberDTO dto = new MemberDTO();
		
		System.out.println("id를 입력하세요:");
		dto.setId(sc.next());
		System.out.println("pw를 입력하세요:");
		dto.setPw(sc.next());
		
		boolean flag = false;
		for (int i = 0; i < ar.size(); i++) {
			if (ar.get(i).getId().equals(dto.getId()) && ar.get(i).getPw().equals(dto.getPw())) {
				flag = true;
				dto = ar.get(i);
			}
		}
		
		if (flag) {
			return dto;
		} else {
			return null;
		}
		
	}
	
	
	/*
	 * memberAdd
	 * scanner로 id, pw, age를 입력받아서 MemberDTO 멤버변수 넣기
	 * 매개변수로 ArrayList를 받아서 생성한 MemberDTO를 추가
	 */
	public void memberAdd(ArrayList<MemberDTO> ar) {
		sc = new Scanner(System.in);
		MemberDTO dto = new MemberDTO();
		
		System.out.println("id를 입력하세요:");
		dto.setId(sc.next());
		System.out.println("pw를 입력하세요:");
		dto.setPw(sc.next());
		System.out.println("age를 입력하세요:");
		dto.setAge(sc.nextInt());
		
		ar.add(dto);
	}
	
	
	/*
	 * memberDelete
	 * Scanner로 id, pw를 입력받아서 MemberDTO에 추가 
	 * 매개변수로 ArrayList를 받아서 입력받은 id, pw가 일치하는지 찾아서 삭제
	 */
	public boolean memberDelete(ArrayList<MemberDTO> ar) {
		sc = new Scanner(System.in);
		MemberDTO dto = new MemberDTO();
		
		System.out.println("id를 입력하세요:");
		dto.setId(sc.next());
		System.out.println("pw를 입력하세요:");
		dto.setPw(sc.next());
		
		boolean flag = false;
		for (int i = 0; i < ar.size(); i++) {
			if (ar.get(i).getId().equals(dto.getId()) && ar.get(i).getPw().equals(dto.getPw())) {
				flag = true;
				ar.remove(i);
			}
		}
		return flag;
	}
	
	
	/*
	 * memberInit
	 * info에 있는 정보를 파싱해서 MemberDTO 객체 생성해서 대입.
	 * ArrayList에 MemberDTO 추가 후 리턴!
	 * return Type: ArrayList<MemberDTO>
	 */
	public ArrayList<MemberDTO> memberInit() {
		ArrayList<MemberDTO> ar = new ArrayList<MemberDTO>();
		
		StringTokenizer st = new StringTokenizer(info, ",");
		
		while (st.hasMoreTokens()) {
			MemberDTO dto = new MemberDTO();
			
			dto.setId(st.nextToken());
			dto.setPw(st.nextToken());
			String age = st.nextToken();
			dto.setAge(Integer.parseInt(age));
			ar.add(dto);
		}


		return ar;
	}
}
