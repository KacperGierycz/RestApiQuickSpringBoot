 package api.springbootstarter.topic;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TopicController {

	@RequestMapping("/topics")
	public List<Topic> getAllTopics() {
		return Arrays.asList(
				new Topic("Spring", "Spring Framework","Spring Description"),
				new Topic("Java", "Core Java","Java Description"),
				new Topic("JavaScript", "JavaScript","JavaScript Description")							
				);
	}
}
