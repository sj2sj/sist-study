package com.iu.s1.department;

public class DepartmentController {

	private DepartmentDAO departmentDAO = null;
	private DepartmentView departmentView = null;
	
	public DepartmentController() {
		departmentDAO = new DepartmentDAO();
		departmentView = new DepartmentView();
	}
	
	public void start() {
		Depart_EmpDTO depart_EmpDTO = departmentDAO.getJoin(90);
		departmentView.view(depart_EmpDTO);
	}
	
}
