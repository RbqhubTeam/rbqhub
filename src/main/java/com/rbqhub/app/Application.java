package com.rbqhub.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
@SpringBootApplication
@ComponentScan(value="com.rbqhub.huishu")
@EntityScan(value="com.rbqhub.huishu.entity")
@EnableJpaRepositories(value="con.huishu.com.rbqhub.repository")
public class Application {
	public static void main(String[] args) {
		 SpringApplication.run(Application.class, args); 
	}
}
