package model;

import dao.EmployeeDAO;

public class CreateEmployeeLogic {

	public boolean execute(Employee employee) {
		
		EmployeeDAO dao = new EmployeeDAO();
		return dao.create(employee);
	}
}
