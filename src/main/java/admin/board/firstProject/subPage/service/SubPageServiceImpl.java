package admin.board.firstProject.subPage.service;

import org.springframework.stereotype.Service;

import admin.board.firstProject.subPage.mapper.SubPageMapper;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class SubPageServiceImpl implements SubPageService{
	
	
	private final SubPageMapper mapper;
	
	

}
