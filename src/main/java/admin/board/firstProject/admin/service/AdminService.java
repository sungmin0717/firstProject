package admin.board.firstProject.admin.service;

import java.util.List;

import admin.board.firstProject.subPage.dto.InformationDto;

public interface AdminService {

	//로그인 정보
	int adminLogin(String adminPw);

	
//	유저 상태 변경
	int userChange(String studentTf, String studentNo);

	//유저 정보 
	List<InformationDto> userList();

	//정렬
	List<InformationDto> consultation();

	/** 검색 기능
	 * 
	 * @param input
	 * @return
	 */
	List<InformationDto> search(String input);

}
