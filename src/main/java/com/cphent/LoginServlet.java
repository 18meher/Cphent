package com.cphent;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Servlet implementation class LoginServlet
 */
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String s=request.getParameter("name");
		 response.setContentType("text/html");
		 
		response.getWriter().println("<!DOCTYPE html>\r\n"
				+ "<html>\r\n"
				+ "<head>\r\n"
				+ "    <title>Congratulations</title>\r\n"
				+ "    <style>\r\n"
				+ "        body {\r\n"
				+ "            font-family: Arial, sans-serif;\r\n"
				+ "            background-color: #f4f4f4;\r\n"
				+ "            margin: 0;\r\n"
				+ "            padding: 0;\r\n"
				+ "            display: flex;\r\n"
				+ "            justify-content: center;\r\n"
				+ "            align-items: center;\r\n"
				+ "            height: 100vh;\r\n"
				+ "        }\r\n"
				+ "\r\n"
				+ "        .message-container {\r\n"
				+ "            background: #fff;\r\n"
				+ "            padding: 20px;\r\n"
				+ "            border-radius: 5px;\r\n"
				+ "            box-shadow: 0 2px 10px rgba(0, 0, 0, 0.1);\r\n"
				+ "        }\r\n"
				+ "\r\n"
				+ "        h2 {\r\n"
				+ "            text-align: center;\r\n"
				+ "        }\r\n"
				+ "\r\n"
				+ "        p {\r\n"
				+ "            text-align: center;\r\n"
				+ "        }\r\n"
				+ "    </style>\r\n"
				+ "</head>\r\n"
				+ "<body>\r\n"
				+ "    <div class=\"message-container\">\r\n"
				+         "<h1>"+s+"<h1>"
				+ "        <h2>Congratulations!</h2>\r\n"
				+ "        <p>Thanks for your submission.</p>\r\n"
				+ "    </div>\r\n"
				+ "</body>\r\n"
				+ "</html>\r\n"
				+"");
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
