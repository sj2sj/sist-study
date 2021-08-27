package com.iu.s2.ex2;


public class StudentSort {
	
	/* 
	 * 평균순으로 학생들을 정렬한다. 
	 */
	public Student[] sortByAvg(Student[] stds) {
		Student sortStd = new Student(); //임시 Student 객체 
		for (int sortIdx = 0; sortIdx < stds.length-1; sortIdx++) {
			for (int i = sortIdx+1; i < stds.length; i++) {
				if (stds[sortIdx].total < stds[i].total) {
					sortStd = stds[i];
					stds[i] = stds[sortIdx];
					stds[sortIdx] = sortStd;
				}
			}
		}
		return stds;
	}
	
	
}
