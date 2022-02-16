package model;

import dao.EmployeeDAO;

public class UpdateEmployeeLogic {
	
	public boolean execute(Employee employee) {
		
		EmployeeDAO dao = new EmployeeDAO();
		return dao.update(employee);
	}
}
