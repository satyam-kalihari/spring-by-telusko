package com.telusko.eshop;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
    
    @RequestMapping("/")
    // use @RestController or use here @ResponseBody
    public String greet(){
        return "Welcome to satyam's eshop!!!";
    }

    @RequestMapping("/about")
    public String about(){
        return "About us page!!!";
    }

    @RequestMapping("/contact")
    public String contact(){
        return "Contact us page!!!";
    }
}
