package vr1.ravi.springcourseapi.topic;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TopicController {
    
    @GetMapping("/topics")
    public List<Topic> getAllTopics(){
        List<Topic> topic = new ArrayList<>();
        Topic t1 = new Topic("01", "Java", "This is Java Topic");
        Topic t2 = new Topic("02", "JavaScript", "This is JS Topic");
         topic.add(t1);
         topic.add(t2);

        return topic;
    }


}
