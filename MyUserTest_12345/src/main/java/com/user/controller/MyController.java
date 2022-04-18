package com.user.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
public class MyController {
	
	@GetMapping("/input")
	public String loginpage() {
		System.out.println("로그인");
		return "input";
	}
	
	// id pw (data) 를 @RequestParam 받아와서 session에 넣는다
	// HttpServletRequest 객체를 써야 getSession를 받아온다
	@GetMapping("/result")
	public String loginresult(@RequestParam String userid, @RequestParam String pw, HttpServletRequest req) {
		HttpSession session = req.getSession(); // 세션을 가져오기
		session.setAttribute("userid", userid); // "userid"라는 변수에 userid 넣는 것 / "userid"로 userid를 세션에 바인딩?
		session.setAttribute("pw", pw);
		System.out.println("로그인결과");
		return "result";
	}
}
