package cn.edu.hqu.javaee.ex2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "cn.edu.hqu.javaee.web.controller")
public class Ex2Application {

	public static void main(String[] args) {
		SpringApplication.run(Ex2Application.class, args);
	}

}
