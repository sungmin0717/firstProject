package admin.board.firstProject.admin.controller;

import org.springframework.stereotype.Controller;

import admin.board.firstProject.admin.service.AdminService;
import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor
public class AdminContoller {
	private final AdminService service;
	
	

}
