package com.Ocpremier.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

import com.sun.net.httpserver.Filter.Chain;

public class ClickCouterFilter implements Filter{

	@Override
	public void destroy() {
		
		
	}

	@Override
	public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain)
			throws IOException, ServletException {
		System.out.println("ClickCouterFilter - doFilter");
	
		ServletContext sc= req.getServletContext();
		
		int counter = (int) sc.getAttribute("counter");
		counter++;
		sc.setAttribute("counter",counter);
		
		
		System.out.println("counter:"  + sc.getAttribute("counter"));
		chain.doFilter(req,resp);
		
		
	}

	@Override
	public void init(FilterConfig arg0) throws ServletException {
		int counter = 0;
		ServletContext sc = arg0.getServletContext();
		sc .setAttribute("counter",counter);
		
	}


}
