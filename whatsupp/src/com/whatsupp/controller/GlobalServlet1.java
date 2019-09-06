package com.whatsupp.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.whatsupp.entity.WhatsuppEmployee;
import com.whatsupp.service.WhatsuppService;
import com.whatsupp.service.WhatsuppServiceInterface;



/**
 * Servlet implementation class GlobalServlet1
 */
public class GlobalServlet1 extends HttpServlet {
	
	protected void service(HttpServletRequest rqs, HttpServletResponse rsp) throws ServletException, IOException
	{
		rsp.setContentType("text/html");
		PrintWriter out=rsp.getWriter();
		out.println("<html><body>");
		String option=rqs.getParameter("ac");
		if(option.equals("register"))
		{
			String name=rqs.getParameter("name");
			String pass=rqs.getParameter("pass");
			String email=rqs.getParameter("email");
			String address=rqs.getParameter("address");
			WhatsuppEmployee wt=new WhatsuppEmployee();
			wt.setName("name");
			wt.setPass("pass");
			wt.setEmail("email");
			wt.setAddress("address");
			WhatsuppServiceInterface ws=WhatsuppService.createServiceObject();
			int i=ws.createProfile(wt);
			if(i>0) {
				out.println("profile is created");
				
			}
			else {
				out.println("profile is not created");
				
			}
			
		
			
		}
		
	
	if(option.equals("login"))
	{
		
	}
	if(option.equals("timeline")) {
		
	}
	out.println("</body></html>");
	}
			
			
			



	}


