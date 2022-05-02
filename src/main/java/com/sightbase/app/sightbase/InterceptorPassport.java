package com.sightbase.app.sightbase;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;

@Component
public class InterceptorPassport implements HandlerInterceptor {
	
	public InterceptorPassport () {
		System.out.print("PPPPAPSPSSSPORT\n\n");
	}
	
	@Override
	public boolean preHandle(
		HttpServletRequest request, HttpServletResponse response, Object handler
	) throws Exception {
		request.setAttribute("smth", "hihihihihi");
		System.out.print("PPPPAPSPSSSPORT 1111\n\n");
		return true;
	}
}
