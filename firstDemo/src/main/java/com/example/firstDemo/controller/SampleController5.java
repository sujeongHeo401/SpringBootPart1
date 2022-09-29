package com.example.firstDemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.firstDemo.dto.BookDTO;

/*
 * 
 * Form 과 View 그리고 Thymeleaf 로 뷰페이지 만들기
 * BookDTO 사용
 */

@Controller
public class SampleController5 {
	@GetMapping("/SampleController5Form")
	public String insertBook(Model model) {
		model.addAttribute("bookDTO", new BookDTO());
		
		return "/post/SampleController5Form";
	}

}
