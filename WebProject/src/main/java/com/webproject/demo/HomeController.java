package com.webproject.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;


@Controller
public class HomeController {
	@RequestMapping("home")
//	@ResponseBody
	public ModelAndView home(Alien alien) {
		
//		HttpSession session= req.getSession();
//		String name=req.getParameter("name");
		ModelAndView mv=new ModelAndView();
//		System.out.println("Home page "+ myName);
//		session.setAttribute("name", myName);
		mv.addObject("obj", alien);
		mv.setViewName("home");
		return mv;
		
	}
}
