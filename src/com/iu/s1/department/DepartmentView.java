package com.iu.s1.department;


public class DepartmentView {

	public void view(Depart_EmpDTO depart_EmpDTO) {
		
		final int SIZE = depart_EmpDTO.getAr().size();
		
		
		for (int i = 0; i < SIZE; i++) {
			System.out.print(depart_EmpDTO.getDepartment_name() +"\t");
			System.out.print(depart_EmpDTO.getAr().get(i).getFirst_name() +"\t");
			System.out.print(depart_EmpDTO.getAr().get(i).getSalary() +"\t");
			System.out.println(depart_EmpDTO.getAr().get(i).getHire_date());
		}
	}
	
}
