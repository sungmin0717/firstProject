package admin.board.firstProject.subPage.service;

import org.springframework.stereotype.Service;

import admin.board.firstProject.subPage.mapper.SubPageMapper;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Service
@RequiredArgsConstructor
@Slf4j
public class SubPageServiceImpl implements SubPageService {

	private final SubPageMapper mapper;

	// 이메일 중복확인
	@Override
	public int duplication(String phon) {
		
		
		int result = mapper.duplication(phon);
		
		
		return result;
	}
	
	
	
	//DB INSERT 학생 정보 저장
	@Override
	public int information(String name, String email, String phon) {
		
		
		
		
		return mapper.informationInsert(name,email,phon);
	}

}
