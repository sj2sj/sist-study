package com.iu.s1.employee;

import com.iu.s1.department.DepartmentDTO;

//EmployeeDTO와 동일함
//새로 만든 이유: 실습 위해서
public class Emp_DepartDTO extends EmployeeDTO {

	//사원 한명은 부서 하나를 가지고 있다.
	
	private DepartmentDTO departmentDTO;
	
	public Emp_DepartDTO() {
		departmentDTO = new DepartmentDTO();
	}

	public DepartmentDTO getDepartmentDTO() {
		return departmentDTO;
	}

	public void setDepartmentDTO(DepartmentDTO departmentDTO) {
		this.departmentDTO = departmentDTO;
	}
	
	
}
