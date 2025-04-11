package admin.board.firstProject.subPage.service;

public interface SubPageService {

	/** 이메일 중복 확인
	 * 
	 * @param phon
	 * @return
	 */
	int duplication(String phon);

	/** 이메일 중복이 존재하지않고 db insert
	 * 
	 * @param name
	 * @param email
	 * @param phon
	 * @return
	 */
	int information(String name, String email, String phon);

}
