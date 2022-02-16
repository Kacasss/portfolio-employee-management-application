package servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.Employee;
import model.GetEmployeeListLogic;


@WebServlet("/employee")
public class EmployeeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doGet(HttpServletRequest request,
			HttpServletResponse response)
					throws ServletException, IOException {
		HttpSession session = request.getSession();
		session.removeAttribute("msgList");
		session.removeAttribute("msg");
		
		GetEmployeeListLogic getEmployeeListLogic =
				new GetEmployeeListLogic();
		List<Employee> empList = getEmployeeListLogic.execute();
		
		
		session.setAttribute("empList", empList);
		
		String url = "/WEB-INF/jsp/employee.jsp";
		RequestDispatcher dispatcher = request.getRequestDispatcher(url);
		dispatcher.forward(request, response);
	}
}
