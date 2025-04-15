package admin.board.firstProject.subPage.service;

import java.util.concurrent.CompletableFuture;

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
	CompletableFuture<Integer> information(String name, String email, String phon, String htmlName);


}
