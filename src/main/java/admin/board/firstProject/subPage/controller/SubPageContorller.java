package admin.board.firstProject.subPage.controller;

import org.springframework.stereotype.Controller;

import admin.board.firstProject.subPage.service.SubPageService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;



@Controller
@RequiredArgsConstructor
@Slf4j
public class SubPageContorller {
	
	

	private final SubPageService service;
	

	
	@RequestMapping("subPage")
	public String subPage(

			) {
		
		
		
		return ("subPage/subPage");
	}
	
	
	
	@PostMapping("subPage/information")
	public String information(
			) {
		
		
	
		

		
		
		
		
		
		
		return"redirect:/";
		
	}
	
	
	
	
	
	
}
