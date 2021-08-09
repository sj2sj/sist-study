package com.iu.s1.employee;

import java.util.ArrayList;
import java.util.HashMap;

public class EmployeeController {
	
	private EmployeeDAO employeeDAO;
	private EmployeeView employeeView;
	
	public EmployeeController() {
		employeeDAO = new EmployeeDAO();
		employeeView = new EmployeeView();
	}

	//1. 전체사원 출력 getList O
	//2. 사원 번호를 입력해서 한 사원의 정보 출력 getOne O
	//3. LAST_NAME을 검색해서 정보 출력 O
	//4. FIRST_NAME을 검색해서 정보 출력 O
	//5. 전체 평균 급여의 정보를 출력 O
	//6. 부서별 평균 급여의 정보를 출력
	
	public void start() {
//		EmployeeDTO employeeDTO = employeeDAO.getOne(107);
//		employeeView.view(employeeDTO);
		
//		ArrayList<EmployeeDTO> employeeDTOs = employeeDAO.getList();
//		employeeView.view(employeeDTOs);
		
//		ArrayList<EmployeeDTO> employeeDTOs = employeeDAO.getSearch("FIRST_NAME", "ab");
//		employeeView.view(employeeDTOs);
		
//		ArrayList<EmployeeDTO> employeeDTOs = employeeDAO.getSearch("LAST_NAME", "ab");
//		employeeView.view(employeeDTOs);
		
//		double avgSalary = employeeDAO.getAvgSal();
//		employeeView.view(avgSalary);
		
		HashMap<Integer, Double> departmentSal = employeeDAO.getDepartmentAvgSal();
		employeeView.view(departmentSal);
	}
	
}
