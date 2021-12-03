package br.com.luish.management;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.com.luish.management.models.Topic;
import br.com.luish.management.services.TopicService;

@SpringBootApplication
public class SessionManagementApplication implements CommandLineRunner {
	
	@Autowired
	TopicService service;

	public static void main(String[] args) {
		SpringApplication.run(SessionManagementApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		Date data = new Date();
		
		Topic top1 = new Topic("Adiantamento", data);
		Topic top2 = new Topic("Benefícios", data);
		Topic top3 = new Topic("Cartão", data);
		Topic top4 = new Topic("Juros", data);
		
		service.insert(top1);
		service.insert(top2);
		service.insert(top3);
		service.insert(top4);
		

	}

}
