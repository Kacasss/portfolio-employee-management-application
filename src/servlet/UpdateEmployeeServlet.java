package servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Employee;
import model.UpdateEmployeeLogic;


@WebServlet("/update")
public class UpdateEmployeeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response)
					throws ServletException, IOException {
		
		String url = "/WEB-INF/jsp/updateInputId.jsp";
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
		UpdateEmployeeLogic updateEmployeeLogic =
				new UpdateEmployeeLogic();
		String msg = null;
		
		if(updateEmployeeLogic.execute(employee)) {
			msg = "更新しました";
		} else {
			msg = "更新に失敗しました";
		}
		
		request.setAttribute("msg", msg);
		
		String url = "/WEB-INF/jsp/updateResult.jsp";
		RequestDispatcher dispatcher = request.getRequestDispatcher(url);
		dispatcher.forward(request, response);
		
	}

}
