package com.iu.s1;

public class ClassStudy_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 메인 메서드의 용도는 프로그램을 시작하는 용도.
		// 또는 메서드 테스트 용도.
		
		System.out.println("==== Study01 Start ====");
		
		//학생 1명 생성
		//클래스명 변수명 = new 클래스명 
		Student st = new Student();
		Student st2 = new Student();
		
		System.out.println(st == st2);
		
		//멤버의 접근 (사용)
		//참조변수명.
		
		st.name = "김야옹";
		st.num = 1;
		st.kor = 30;
		st.eng = 44;
		st.math = 58;
		//st의 총점,평균을 계산해서 입력하고 출력.
		st.total = st.kor + st.eng + st.math;
		st.avg = st.total/3.0;
		
		System.out.println(st.name);
		System.out.println("총점: " + st.total);
		System.out.println("평균: " + st.avg);
		
		
		
		st2.num = 1;
		System.out.println(st.num == st2.num);
		
		
		st2 = st;

		
		
		System.out.println("==== Study01 Finish ====");
	}

}
