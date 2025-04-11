package admin.board.firstProject.subPage.controller;

import org.springframework.stereotype.Controller;

import admin.board.firstProject.subPage.dto.InformationDto;
import admin.board.firstProject.subPage.service.SubPageService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;



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
	
	
	@ResponseBody
	@PostMapping("subPage/information")
	public String information(
			@RequestBody InformationDto informationDto,
			RedirectAttributes ra
			) {
		
		String message = null;
		String path = null;
		
		log.debug(informationDto.getStudentName());
		log.debug(informationDto.getStudentEmail());
		log.debug(informationDto.getStudentTel());

		String name = informationDto.getStudentName();
		String email = informationDto.getStudentEmail();
		String phon = informationDto.getStudentTel();
		
		//이메일 중복일때 return
		int phonDuplication = service.duplication(phon);

		String flag = null;
		
		
		//1일떄 중복이메일 존재 
		//0일떄 중복이메일 존재하지않음.
		if(phonDuplication == 1) {
			//중복이 존재해 메시지,리다이렉트 등록 실패.
			flag = "f";
		}else {
			//0일떄는
			//JS 정규표현식 가공후 insert
			int result = service.information(name, email, phon);
			flag = "t";
		}
		
		return flag;
	}
	
	
	
	
	
	
}
