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


@WebServlet("/createConfirm")
public class CreateConfirmServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doPost(HttpServletRequest request,
			HttpServletResponse response)
					throws ServletException, IOException {

		String id = request.getParameter("id");
		String name = request.getParameter("name");
		String ageStr = request.getParameter("age");
		
		List<String> msgList = new ArrayList<>();
		
		if (id == null || id.length() == 0) {
			msgList.add("IDが入力されていません");
		}
		
		if (name == null || name.length() == 0) {
			msgList.add("名前が入力されていません");
		}
		
		if (ageStr == null || ageStr.length() == 0) {
			msgList.add("年齢が入力されていません");
		}

		if (msgList.size() != 0) {
			HttpSession session = request.getSession();
			session.setAttribute("msgList", msgList);
			response.sendRedirect("/practiceApplication/create");
			return;
		}
		

		
		int age = Integer.parseInt(ageStr);
		
		Employee emp = new Employee(id, name, age);
		
		
		HttpSession session = request.getSession();
		session.setAttribute("emp", emp);
		
		String url = "/WEB-INF/jsp/createConfirm.jsp";
		RequestDispatcher dispatcher = request.getRequestDispatcher(url);
		dispatcher.forward(request, response);
		
	}

}
