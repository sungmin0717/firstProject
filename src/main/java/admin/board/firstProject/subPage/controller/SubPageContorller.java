package admin.board.firstProject.subPage.controller;

import org.springframework.stereotype.Controller;

import admin.board.firstProject.subPage.service.SubPageService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;



@Controller
@RequiredArgsConstructor
public class SubPageContorller {

	private final SubPageService service;
	

	
	@RequestMapping("subPage")
	public String subPage(

			) {
		
		
		
		return ("subPage/subPage");
	}
	
	
	
	
	
	
	
}
