package api.springbootstarter.topic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TopicService {
	
	 List<Topic> topics = new ArrayList<>(Arrays.asList(
			new Topic("Spring", "Spring Framework","Spring Description"),
			new Topic("Java", "Core Java","Java Description"),
			new Topic("JavaScript", "JavaScript","JavaScript Description")							
			));
	
	public List<Topic> getAllTopics(){
		return topics;
		
	}

	public Topic getTopic(String id) {
		
		return topics.stream().filter(t->t.getId().equals(id)).findFirst().get();
	}

	public void addTopic(Topic topic) {
		topics.add(topic);		
	}
	
}
