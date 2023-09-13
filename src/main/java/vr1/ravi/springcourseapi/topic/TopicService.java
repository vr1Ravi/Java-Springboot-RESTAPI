package vr1.ravi.springcourseapi.topic;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

// Business Service
@Service
public class TopicService {
    
    private List<Topic> topics = Arrays.asList(
           new Topic("01", "Java", "This is Java Topic"),
         new Topic("02", "JavaScript", "This is JS Topic")
    );

   public List<Topic> getAlltopics(){
    return topics;
   }
}
