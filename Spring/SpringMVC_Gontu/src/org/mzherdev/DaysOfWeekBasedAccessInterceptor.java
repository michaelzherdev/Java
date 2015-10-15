package org.mzherdev;

import java.util.Calendar;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class DaysOfWeekBasedAccessInterceptor extends HandlerInterceptorAdapter {

	@Override
	public boolean preHandle(HttpServletRequest request,
			HttpServletResponse response, Object handler) throws Exception {
		// if true - app will futher handle the request, if false - not
		Calendar calendar = Calendar.getInstance();
		int dayOfWeek = calendar.get(calendar.DAY_OF_WEEK);
		if(dayOfWeek == 1) { //Sunday
			response.getWriter().write("The Website is close on Sunday!");
			return false;
		}
		return true;
	}

	
}
