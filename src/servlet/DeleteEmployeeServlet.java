package servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.DeleteEmpByIdLogic;


@WebServlet("/delete")
public class DeleteEmployeeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doGet(HttpServletRequest request,
			HttpServletResponse response)
					throws ServletException, IOException {
		
		String url = "/WEB-INF/jsp/deleteEmp.jsp";
		RequestDispatcher dispatcher = request.getRequestDispatcher(url);
		dispatcher.forward(request, response);
	}


	protected void doPost(HttpServletRequest request,
			HttpServletResponse response)
					throws ServletException, IOException {
		
		String id = request.getParameter("id");
		
		DeleteEmpByIdLogic deleteEmpByIdLogic = 
				new DeleteEmpByIdLogic();
		boolean result = deleteEmpByIdLogic.execute(id);
		
		String msg = null;
		if (result) {
			msg = "削除しました。";
		} else {
			msg = "削除に失敗しました。";
		}
		request.setAttribute("msg", msg);
		
		String url = "/WEB-INF/jsp/deleteResult.jsp";
		RequestDispatcher dispatcher = request.getRequestDispatcher(url);
		dispatcher.forward(request, response);
		
	}

}
