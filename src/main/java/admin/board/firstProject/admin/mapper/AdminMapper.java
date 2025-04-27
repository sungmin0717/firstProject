package admin.board.firstProject.admin.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import admin.board.firstProject.subPage.dto.InformationDto;

@Mapper
public interface AdminMapper {

	
//	로그인 정보
	int adminLogin(String adminPw);
//	유저 상태 변경
	int userChange(
			@Param("studentTf") String studentTf, 
			@Param("studentNo") String studentNo);
	
	
	//유저 정보 가져오기
	List<InformationDto> userList();
	/** 정렬
	 * 
	 * @return
	 */
	List<InformationDto> consultation();
	
	/** 검색 기능
	 * 
	 * @param input
	 * @return
	 */
	List<InformationDto> search(String input);

	
	
}
