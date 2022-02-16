package servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.Employee;
import model.FindEmpByIdLogic;


@WebServlet("/deleteConfirm")
public class DeleteConfirmServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doPost(HttpServletRequest request,
			HttpServletResponse response)
					throws ServletException, IOException {
		
		String id = request.getParameter("id");
		List<String> msgList = new ArrayList<>();
		
		if (id == null || id.length() == 0) {
			msgList.add("IDが入力されていません");
		}

		if (msgList.size() != 0) {
			HttpSession session = request.getSession();
			session.setAttribute("msgList", msgList);
			response.sendRedirect("/practiceApplication/delete");
			return;
		}
		
		FindEmpByIdLogic findEmpByIdLogic = new FindEmpByIdLogic();
		Employee employee = findEmpByIdLogic.execute(id);
		
		request.setAttribute("employee", employee);
		
		String url = "/WEB-INF/jsp/deleteConfirm.jsp";
		RequestDispatcher dispatcher = request.getRequestDispatcher(url);
		dispatcher.forward(request, response);

	}

}
