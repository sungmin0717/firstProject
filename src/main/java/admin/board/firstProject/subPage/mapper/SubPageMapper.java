package admin.board.firstProject.subPage.mapper;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface SubPageMapper {

	//이메일 중복확인
	int duplication(String phon);
	
	
	//insert 작업
	int informationInsert(String name, String email, String phon);


	
	
	
}
