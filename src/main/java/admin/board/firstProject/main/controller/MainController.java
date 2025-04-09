package admin.board.firstProject.main.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import admin.board.firstProject.main.service.MainService;
import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor
public class MainController {
	
	
	private final MainService service;
	
	
	
	@RequestMapping("/")
	public String main() {
		
		
		
		
		
		return "main/main";
	}

}
