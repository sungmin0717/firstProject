package admin.board.firstProject.subPage.service;

import java.util.concurrent.CompletableFuture;

import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;
import org.thymeleaf.context.Context;
import org.thymeleaf.spring6.SpringTemplateEngine;

import admin.board.firstProject.subPage.mapper.SubPageMapper;
import jakarta.mail.MessagingException;
import jakarta.mail.internet.MimeMessage;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Service
@RequiredArgsConstructor
@Slf4j
public class SubPageServiceImpl implements SubPageService {

	private final SpringTemplateEngine templateEngine;
	private final JavaMailSender mailSender;
	private final SubPageMapper mapper;

	// 이메일 중복확인
	@Override
	public int duplication(String phon) {
		
		
		int result = mapper.duplication(phon);
		
		
		return result;
	}
	
	
	
	//DB INSERT 학생 정보 저장
	@Override
	@Async("asyncExecutor")
	public CompletableFuture<Integer> information(String name, String email, String phon, String htmlName) {
		
	    try {
	        MimeMessage mimeMessage = mailSender.createMimeMessage();
	        MimeMessageHelper helper = new MimeMessageHelper(mimeMessage, true, "UTF-8");

	        String emailTitle = "emailPage";
	        helper.setTo(email);
	        helper.setSubject(name + "님 안녕하세요.");
	        helper.setText(loadHtml(htmlName, emailTitle), true);
	        mailSender.send(mimeMessage);

	        int result = mapper.informationInsert(name, email, phon);
	        return CompletableFuture.completedFuture(result);

	    } catch (MessagingException e) {
	        e.printStackTrace();
	        return CompletableFuture.completedFuture(0);
	    }
			
	}
	
	
	
//	템플릿엔진 html 요소를 얻어와 타임리프 처럼 사용 가능
	public String loadHtml(String authKey, String htmlName) {

		// org.tyhmeleaf.Context 선택!!
		Context context = new Context();

		// 타임리프가 적용된 HTML에서 사용할 값 추가
		context.setVariable("authKey", authKey);

		// templates/email 폴더에서 htmlName과 같은
		// .html 파일 내용을 읽어와 String으로 변환
		return templateEngine.process("email/" + htmlName, context);

	}
	
	
	



}
