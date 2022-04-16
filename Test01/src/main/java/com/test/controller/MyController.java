package com.test.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.test.join.Member;
import com.test.join.MemberService;

@Controller
public class MyController {

	@Autowired
	private MemberService memberService;
	
	@GetMapping("/input")
	public String login() {
		
		System.out.println("로그인 페이지");		
		return "input";
	}
	
	
	@GetMapping("/result")
	public String loginResult(@RequestParam String userid, @RequestParam String password, HttpServletRequest req) {
		HttpSession session = req.getSession();
		session.setAttribute("userid", userid); //userid에 "userid"대입
		session.setAttribute("password", password);
		System.out.println("로그인 결과");		
		return "result";
	}
	
	
	
		/*
	  @RequestMapping(value = "/result", method = RequestMethod.GET)
	    public String loginresult(HttpServletRequest httpServletRequest, Model model) {
	        
	        System.out.println("RequestMethod.GET");
	        
	        String id = httpServletRequest.getParameter("userid");
	        System.out.println("userid : " + id);
	        String pw = httpServletRequest.getParameter("password");
	        System.out.println("password : " + pw);
	        
	        model.addAttribute(id, pw);
	        
	        return "result";
	    }
*/


	
	
}
