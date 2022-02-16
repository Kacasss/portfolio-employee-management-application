package model;

import dao.EmployeeDAO;

public class DeleteEmpByIdLogic {
	
	public boolean execute(String inputId) {
		EmployeeDAO dao = new EmployeeDAO();
		return dao.deleteById(inputId);
	}
}
