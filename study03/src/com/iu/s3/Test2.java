package com.iu.s3;

/* 오버로딩 */
public class Test2 {
	
	public void t1(int n1, int n2) {
		System.out.println(n1+n2);
	}
	
	public void t1(int n1, double n2) {
		System.out.println(n1+n2);
	}
	
	public void t1(double n1, double n2) {
		System.out.println(n1+n2);
	}
}
