package servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Employee;
import model.FindEmpByIdLogic;


@WebServlet("/edit")
public class EditEmployeeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response)
					throws ServletException, IOException {
		
		String id = request.getParameter("id");
		FindEmpByIdLogic findEmpByIdLogic = new FindEmpByIdLogic();
		Employee employee = findEmpByIdLogic.execute(id);
		
		request.setAttribute("employee", employee);
		String url = "/WEB-INF/jsp/editEmployee.jsp";
		RequestDispatcher dispatcher = request.getRequestDispatcher(url);
		dispatcher.forward(request, response);
	}

}
