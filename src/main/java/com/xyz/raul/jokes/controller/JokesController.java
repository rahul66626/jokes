package com.xyz.raul.jokes.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JokesController {
	
	
	@GetMapping("/")
    public String greetMe(){
        return "Hello World From Jokes App deployed in Tomcat.......";
    }
	
	@GetMapping("/joke")
    public String joke(){
        return "What's the best thing about switzerland, i don't know but the flag is a big plus";
    }
	

}
