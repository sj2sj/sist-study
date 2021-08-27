package com.iu.s1.department;

public class DepartmentController {

	private DepartmentDAO departmentDAO = null;
	private DepartmentView departmentView = null;
	
	public DepartmentController() {
		departmentDAO = new DepartmentDAO();
		departmentView = new DepartmentView();
	}
	
	public void start() {
//		Depart_EmpDTO depart_EmpDTO = departmentDAO.getJoin(90);
//		departmentView.view(depart_EmpDTO);
		
		DepartmentDTO departmentDTO = new DepartmentDTO();
		departmentDTO.setDepartment_id(300);
		departmentDTO.setDepartment_name("Test2");
		departmentDTO.setManager_id(205);
		departmentDTO.setLocation_id(1700);
		
		int result = departmentDAO.setInsert(departmentDTO);
		
		if (result > 0) {
			System.out.println("insert 성공" + result);
		} else {
			System.out.println("insert 실패");
		}
		
	}
	
}
