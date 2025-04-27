package admin.board.firstProject.admin.service;

import java.util.List;

import org.springframework.stereotype.Service;

import admin.board.firstProject.admin.mapper.AdminMapper;
import admin.board.firstProject.subPage.dto.InformationDto;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class AdminServiceImpl implements AdminService {

	private final AdminMapper mapper;

	@Override
	public int adminLogin(String adminPw) {

		return mapper.adminLogin(adminPw);
	}

	@Override
	public int userChange(String studentTf, String studentNo) {
		
		return mapper.userChange(studentTf, studentNo);
	}

	
	@Override
	public List<InformationDto> userList() {
		
		
		return mapper.userList();
	}
	
	//정렬
@Override
	public List<InformationDto> consultation() {
	
		return mapper.consultation();
	}


//검색 기능
@Override
public List<InformationDto> search(String input) {
	
	return mapper.search(input);
}
}
