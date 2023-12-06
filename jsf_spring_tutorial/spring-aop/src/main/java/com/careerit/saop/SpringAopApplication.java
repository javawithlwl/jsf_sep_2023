package com.careerit.saop;

import com.careerit.saop.service.MathService;
import com.careerit.saop.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.sql.SQLOutput;

@SpringBootApplication
@RequiredArgsConstructor
public class SpringAopApplication {
	private final MathService mathService;
	private final UserService userService;
	public static void main(String[] args) {
		SpringApplication.run(SpringAopApplication.class, args);
	}

	@Bean
	public CommandLineRunner runner(){
		return args -> {
			//mathService.generatePrimeNumbers(10000000,100000000);
			System.out.println(userService.getUserDetails());
		};
	}
}
