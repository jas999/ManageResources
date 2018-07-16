package com.s4technology.controller;




import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.s4technology.model.Greeting;

@RestController
public class GreetingController {
	
	@Autowired
	Greeting greeting ;
	
    @RequestMapping("/hello-world")
    @ResponseBody
    public Greeting sayHello()  {    	
        return greeting; 
    }
    
    
    
    
}
