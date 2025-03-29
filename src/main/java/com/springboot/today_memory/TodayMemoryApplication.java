package com.springboot.today_memory;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class TodayMemoryApplication {

	public static void main(String[] args) {
		SpringApplication.run(TodayMemoryApplication.class, args);
	}

}
