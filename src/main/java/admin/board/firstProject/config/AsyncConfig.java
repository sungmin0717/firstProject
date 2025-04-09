package admin.board.firstProject.config;


import java.util.concurrent.Executor;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

@Configuration
@EnableAsync
public class AsyncConfig {

  @Bean(name = "asyncExecutor")
  public Executor asyncExecutor() {
      ThreadPoolTaskExecutor executor = new ThreadPoolTaskExecutor();
      executor.setCorePoolSize(10);  // 기본 쓰레드 수
      executor.setMaxPoolSize(50);  // 최대 쓰레드 수
      executor.setQueueCapacity(100); // 대기 큐 크기
      executor.setThreadNamePrefix("Async-Thread-");
      executor.initialize();
      return executor;
  }
	
}
