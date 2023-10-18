package com.sboot.projectOne.greeting;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller

public class GreetingController {

    @GetMapping("/greeting")
    @ResponseBody
    public String getGreet(){
        System.out.println("hello");
        return "hello user in get method";
    }

    @PostMapping("/greet")
    @ResponseBody
    public String postGreet(){
        return "hello user in post method";
    }

    @DeleteMapping("/greet")
    @ResponseBody
    public String noGreet(){
        return "bye bye";
    }
}
