package com.iu.s1.employee;

import java.util.ArrayList;
import java.util.HashMap;

public class EmployeeView {

	
	/* 정보 하나 출력 */
	public void view(EmployeeDTO employeeDTO) {
		System.out.print(employeeDTO.getEmployee_id() + "\t");
		System.out.print(employeeDTO.getFirst_name() + "\t");
		System.out.print(employeeDTO.getLast_name() + "\t");
		System.out.print(employeeDTO.getEmail() + "\t");
		System.out.print(employeeDTO.getPhone_number() + "\t");
		System.out.print(employeeDTO.getHire_date() + "\t");
		System.out.print(employeeDTO.getJob_id() + "\t");
		System.out.print(employeeDTO.getSalary() + "\t");
		System.out.print(employeeDTO.getCommission_pct() + "\t");
		System.out.print(employeeDTO.getManager_id() + "\t");
		System.out.println(employeeDTO.getDepartment_id() + "\t");
		System.out.println("-------------------------------------------------------------------------------------------------------------");
	}
	
	
	public void view(Emp_DepartDTO empDepartDTO) {
		System.out.println(empDepartDTO.getLast_name());
		System.out.println(empDepartDTO.getSalary());
		System.out.println(empDepartDTO.getHire_date());
		System.out.println(empDepartDTO.getDepartmentDTO().getDepartment_name());
		System.out.println("------------------------------------------------------------------------");
	}
	
	/* 정보 여러개 출력 */
	public void view(ArrayList<EmployeeDTO> employeeDTOs) {
		final int SIZE = employeeDTOs.size();
		for (int i = 0; i < SIZE; i++) {
			this.view(employeeDTOs.get(i));
		}	
	}
	
	/* 평균 급여 */
	public void view(double avgSalary) {
		System.out.println("평균 급여: " + avgSalary);
	}
	
	
	/* 부서별 평균 급여 */
	public void view(HashMap<Integer, Double> departmentSal) {
		departmentSal.forEach((key, value) -> {
			System.out.println(key + ": " + value);
		});
	}
	
}
