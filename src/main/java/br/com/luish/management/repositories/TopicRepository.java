package br.com.luish.management.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.luish.management.models.Topic;

@Repository
public interface TopicRepository extends JpaRepository<Topic, Integer>{

	List<Topic> findByTitle(String title);
	
}
