package vr1.ravi.springcourseapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication     // Annotaion to tells springboot to this is our starting point of an application
public class SpringCourseApiApplication {

	public static void main(String[] args) {
		// calling static method run of SpringApplication Class to run our spring aplication;
		SpringApplication.run(SpringCourseApiApplication.class, args);
	}

}
