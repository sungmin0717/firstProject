package admin.board.firstProject.subPage.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;




@Mapper
public interface SubPageMapper {

	//이메일 중복확인
	int duplication(String phon);
	
	
	
	
	//insert 작업
	int informationInsert(
			@Param ("name") String name, 
			@Param ("email") String email, 
			@Param ("phon") String phon);


	
	
	
}
