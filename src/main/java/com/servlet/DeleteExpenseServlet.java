package com.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.dao.ExpenseDao;
import com.db.HibernateUtil;
/* This annotation declares that this servlet will handle 
 * requests with the URL pattern "/deleteExpense".
 * */
@WebServlet("/deleteExpense")

/*This class extends HttpServlet, indicating that it's a servlet that handles HTTP requests.*/

public class DeleteExpenseServlet extends HttpServlet{

	@Override
	
	/*The doGet method is overridden to handle HTTP GET requests. 
	 * This is where the main logic for deleting an expense is implemented.*/
	
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		/*The Integer.parseInt method is used to convert the parameter value to an integer.*/
		
		int id= Integer.parseInt(req.getParameter("id"));
		
		ExpenseDao dao= new ExpenseDao(HibernateUtil.getSessionFactory());
		boolean f= dao.deleteExpense(id);
		
		/*A session is retrieved from the request. 
		 * Sessions are used to store information that persists across multiple requests.*/
		
		HttpSession session = req.getSession();
		
		if(f) {
			session.setAttribute("msg","Expense Deleted Sucessfully");
			resp.sendRedirect("user/view_expense.jsp");
		
			}
		else {
		 session.setAttribute("msg","Something Wrong on server");
		resp.sendRedirect("user/view_expense.jsp");
	}
		
		
		
	}

	
	
}
