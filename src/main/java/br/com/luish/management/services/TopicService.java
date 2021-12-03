package br.com.luish.management.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.luish.management.models.Topic;
import br.com.luish.management.repositories.TopicRepository;
import br.com.luish.management.utils.DateUtil;

@Service
public class TopicService {

	@Autowired
	TopicRepository repository;

	public void insert(Topic topic) {
		
		if(!isDuplicate(topic)) 
			repository.save(topic);
	
	}

	private boolean isDuplicate(Topic topic) {

		List<Topic> topics = repository.findByTitle(topic.getTitle());

		if (topics == null || topics.size() == 0)
			return false;
		
		for (Topic aux : topics) {
			
			if(aux.getTitle().equals(topic.getTitle())) {
				if((DateUtil.equalsDate(topic.getDate(), aux.getDate()))) {
					return true;
				}
			}
			
		}
			
		return false;

	}

}
