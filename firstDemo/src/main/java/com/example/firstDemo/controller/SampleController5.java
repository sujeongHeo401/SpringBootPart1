package com.example.firstDemo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

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
	
	@PostMapping("/SampleController5View")
	public String insertView(
			BookDTO bookDTO,
			Model model) {
		
		/// bootDTO 객체 출력
		System.out.println("-----------------");
		System.out.println(bookDTO.getTitle());
		System.out.println(bookDTO.getAuthor());
		System.out.println(bookDTO.getPublisher());
		System.out.println(bookDTO.getPublishingDate());
		
		model.addAttribute("heading", "Book Information");
		return "/post/SampleController5vIEW";
	}

}
