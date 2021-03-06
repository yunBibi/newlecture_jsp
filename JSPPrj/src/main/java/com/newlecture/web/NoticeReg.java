package com.newlecture.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/notice-reg")
public class NoticeReg extends HttpServlet{
	@Override
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setCharacterEncoding("UTF-8");  // 사용자에게 보내는 방식 지정
		response.setContentType("text/html; charset=UTF-8");  // 해석하는 방식 지정
		// request.setCharacterEncoding("UTF-8");
		
		PrintWriter out = response.getWriter();
				
		String title = request.getParameter("title");
		String content = request.getParameter("content");
		
		out.print(title);
		out.println(content);
	}
	}
