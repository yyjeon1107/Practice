package com.map.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MyController {

		@GetMapping("/test01")
		public String MapTest01() {
			return "/view/test01";
		}
		
		@GetMapping("/test02")
		public String MapTest02() {
			return "/view/test02";
		}
		
		@GetMapping("/test03")
		public String MapTest03() {
			return "/view/test03";
		}
		
		@GetMapping("/kakao")
		public String MapTest04() {
			return "/view/kakao";
		}
		
		@GetMapping("/daum")
		public String MapTest05() {
			return "/view/daum";
		}
}
