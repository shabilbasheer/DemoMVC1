/**
 * 
 */
package com.pillion.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.pillion.service.LoginService;

/**
 * @author Hektor
 *
 */
@Controller
public class LoginController {

	@Autowired
	LoginService ls;
	
	@RequestMapping("/login")
	public ModelAndView checkDetails(HttpServletRequest request, HttpServletResponse response) {
		ModelAndView mv = new ModelAndView();
		String name = request.getParameter("uname");
		String pwd = request.getParameter("pword");
		
		if(ls.authenticate(name, pwd)) {
			mv.setViewName("success.jsp");
		} else {
			mv.setViewName("index.jsp");
		}
		
		return mv;
	}
}
