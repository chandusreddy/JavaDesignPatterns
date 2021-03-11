package com.chandu.design.patterns.interceptingfilter;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;

/* 
 * 
 * 	Intercepting Filters are filters that trigger actions before or after an incoming request is processed by a handler.
	Intercepting filters represents centralized components in a web application, common to all requests and extensible without affecting existing handlers.
	This class is using as the intercepting filter patterns, that filters the browser and accepts 
 * only the Chrome and re-directing to a different page for other web browsers.
 */

@WebFilter("/*")
public class BrowserFilter implements Filter {

	public void destroy() {
	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {

		// Using the HttpServletRequest as that contains the get Header method.

		String header = ((HttpServletRequest) request).getHeader("User-Agent");

		System.out.println(header);
		// Checking if it contains the Chrome Browser
		if (header.contains("Chrome")) {
			chain.doFilter(request, response);
		} else {
			// Re-directing to the different jsp page who doesnt met the filter validation

			RequestDispatcher dispatcher = request.getRequestDispatcher("invalidBrowser.jsp");
			dispatcher.forward(request, response);
		}

	}

	public void init(FilterConfig fConfig) throws ServletException {
	}

}
