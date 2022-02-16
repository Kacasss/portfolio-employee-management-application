package servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.CreateEmployeeLogic;
import model.Employee;


@WebServlet("/create")
public class CreateEmployeeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doGet(HttpServletRequest request,
			HttpServletResponse response)
					throws ServletException, IOException {
		
		String url = "/WEB-INF/jsp/createEmp.jsp";
		RequestDispatcher dispatcher = request.getRequestDispatcher(url);
		dispatcher.forward(request, response);

	}


	protected void doPost(HttpServletRequest request,
			HttpServletResponse response)
					throws ServletException, IOException {
		
		String id = request.getParameter("id");
		String name = request.getParameter("name");
		String ageStr = request.getParameter("age");
		
		int age = Integer.parseInt(ageStr);
		
		Employee employee = new Employee(id, name, age);
		CreateEmployeeLogic createEmployeeLogic = 
				new CreateEmployeeLogic();
		boolean result = createEmployeeLogic.execute(employee);
		
		String msg = null;
		if (result) {
			msg = "成功しました";
		} else {
			msg = "失敗しました";
		}
		
		request.setAttribute("msg", msg);
		
		String url = "/WEB-INF/jsp/createResult.jsp";
		RequestDispatcher dispatcher = request.getRequestDispatcher(url);
		dispatcher.forward(request, response);
	}

}
