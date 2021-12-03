package br.com.luish.management.resources;

import java.net.URI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import br.com.luish.management.models.Topic;
import br.com.luish.management.services.TopicService;

@RestController
@RequestMapping(value = "/topic")
public class TopicResource {
	
	@Autowired 
	TopicService service;
	
	@RequestMapping(method = RequestMethod.POST)
	public ResponseEntity<Topic> insert(@RequestBody Topic obj) {
		
		obj = service.insert(obj);
		
	
		
		// retornar codigo 201 e uri
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(obj.getId()).toUri();
		return ResponseEntity.created(uri).build();
	}

}
