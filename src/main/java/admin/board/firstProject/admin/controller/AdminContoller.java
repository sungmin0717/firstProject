package admin.board.firstProject.admin.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import admin.board.firstProject.admin.dto.adminDto;
import admin.board.firstProject.admin.service.AdminService;
import admin.board.firstProject.subPage.dto.InformationDto;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.GetMapping;



@SessionAttributes({"result"})
@Controller
@RequiredArgsConstructor
@RequestMapping ("admin")
@Slf4j
public class AdminContoller {
	private final AdminService service;
	
	
	

	@RequestMapping("")
	public String adminLogin() {
		
		
		
		
		return "admin/adminLogin";
	}
	
	
	@PostMapping("loginJoin")
	public String loginJoin(
			adminDto adminDto,
			RedirectAttributes ra,
			Model model
			
			) {
		
		
		String adminPw =adminDto.getAdminPw();
		
		String message = null;
		String location = null;
		
		
		
		
		int result = service.adminLogin(adminPw);
		
		model.addAttribute(result);
		
		if(result == 1) {
			
//			유저 정보 가져와 리스트 뿌리기
			List<InformationDto> userList = service.userList();
			
			
			model.addAttribute("userList", userList);
			location = "admin/adminPage"; 
			//성공
		}else {
			//실패
			location = "redirect:/"; 
		}
		
		
		return location;
	}
	
	@ResponseBody
	@PostMapping("userTrueFalse")
	public String userTureFalse(
			@RequestBody InformationDto information
			) {
		
		String studentTf = information.getStudentTf();
		String studentNo = information.getStudentNo();
		
		log.debug(studentTf);
		log.debug(studentNo);
		
		int result = service.userChange(studentTf,studentNo);
		
		return "";
	}
	
	
	@PostMapping("consultation")
	public String consultation(
			Model model
			) {
		
		//정렬
		List<InformationDto> userList = service.consultation();
		
		
		model.addAttribute("userList", userList);
		
		return "admin/table";
	}
	
	
	@PostMapping("search")
	public String search(@RequestParam(name = "input", required = false) String input,
			Model model)  {
		
		
			
		log.debug("input 검색 결과 : {}", input);
			
			List<InformationDto> userList = service.search(input);
			
			model.addAttribute("userList", userList);
			
			
		return "admin/adminPage";
	}
	
	
	
	

}
