package com.pillion.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.pillion.service.AddService;

@Controller
public class AddController {
	
	@RequestMapping("/add")
	public ModelAndView add(@RequestParam("t1") int t1, @RequestParam("t2") int t2, HttpServletRequest request, HttpServletResponse response) {
		//int t1 = Integer.parseInt(request.getParameter("t1"));
		//int t2 = Integer.parseInt(request.getParameter("t2"));
		
		AddService addServ = new AddService();
		ModelAndView mv = new ModelAndView();
		mv.setViewName("display.jsp");
		mv.addObject("result", addServ.add(t1, t2));
		
		return mv;
	}
}
