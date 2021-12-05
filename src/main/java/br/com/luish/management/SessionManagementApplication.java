package br.com.luish.management;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.com.luish.management.services.ConvocationService;
import br.com.luish.management.services.SessionService;

@SpringBootApplication
public class SessionManagementApplication {
	
	@Autowired
	ConvocationService service;
	
	@Autowired
	SessionService s;


	public static void main(String[] args) {
		SpringApplication.run(SessionManagementApplication.class, args);
	}

}
