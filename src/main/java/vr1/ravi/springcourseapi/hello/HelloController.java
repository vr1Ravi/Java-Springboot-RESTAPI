package vr1.ravi.springcourseapi.hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController    /* Annotation to tell spring this class is controller class. That is inside this method
we can have all the methods that we want to excute after a specipic api hit*/
public class HelloController {   
     
    @RequestMapping("/hello")   // Annotation to tell spring to map this method when user hit "/hello"; by default it's get method
    public String sayHi(){
        return  "hi";
    }
   
}
