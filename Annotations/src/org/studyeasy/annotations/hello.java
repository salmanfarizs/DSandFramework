package org.studyeasy.annotations;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;

import org.studyeasy.entity.User;
import org.studyeasy.model.UsersModel;

/**
 * Servlet implementation class hello
 */
@WebServlet("/hello")
public class hello extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
    
    @Resource(name="jdbc/project")   
    private DataSource dataSource;
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String page = request.getParameter("page");
    	page = page.toLowerCase();
    	
    	switch (page) {
		case "hello":
				request.getRequestDispatcher("index.jsp").forward(request, response);	
			break;
		case "demo":
			List<User> list = new ArrayList<>();
			list = new UsersModel().listusers(dataSource);
			request.setAttribute("demo", list);
			request.getRequestDispatcher("demo.jsp").forward(request, response);	
		break;

		default:
			break;
		}	
    	
    	
    	
    	
    	
    	
    	
    	
    	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
