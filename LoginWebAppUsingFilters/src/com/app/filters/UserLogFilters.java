package com.app.filters;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;

/**
 * Servlet Filter implementation class UserLogFilters
 */
@WebFilter("/LoginServlet.do")
public class UserLogFilters implements Filter {

    /**
     * Default constructor. 
     */
    public UserLogFilters() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		
		//get Form data
		  
		HttpServletRequest req =  (HttpServletRequest)request;
		
		String userid= req.getParameter("uname");
		
		java.util.Date date =  new java.util.Date();
		
		 FileWriter fw  =  new FileWriter(new File("E://userlog.txt"),true);
		 BufferedWriter bw  = new BufferedWriter(fw);
		 bw.append("Logged in by "+userid+" at "+date);
		 bw.newLine();
		 bw.close();
		 
		
		
		chain.doFilter(request, response);
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}
