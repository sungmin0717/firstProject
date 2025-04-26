package admin.board.firstProject.admin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import admin.board.firstProject.admin.service.AdminService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;



@Controller
@RequiredArgsConstructor
@RequestMapping ("admin")
public class AdminContoller {
	private final AdminService service;
	
	
	

	@RequestMapping("")
	public String adminLogin() {
		
		
		
		
		return "admin/adminLogin";
	}
	
	
	

}
