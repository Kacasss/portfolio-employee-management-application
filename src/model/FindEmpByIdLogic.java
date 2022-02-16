package model;

import dao.EmployeeDAO;

public class FindEmpByIdLogic {
	
	public Employee execute(String inputId) {
		
		EmployeeDAO dao = new EmployeeDAO();
		return dao.findById(inputId);
	}
}
