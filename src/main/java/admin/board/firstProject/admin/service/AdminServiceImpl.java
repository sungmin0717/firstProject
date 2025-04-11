package admin.board.firstProject.admin.service;

import org.springframework.stereotype.Service;

import admin.board.firstProject.admin.mapper.AdminMapper;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class AdminServiceImpl implements AdminService{


	private final AdminMapper mapper;



}
