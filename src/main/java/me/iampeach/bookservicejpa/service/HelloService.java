package me.iampeach.bookservicejpa.service;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping({"/greeting"})
public class HelloService {

    @GetMapping("/hello")
    public String hello() {
        return "Hello";
    }

    @GetMapping("/hi")
    public String hi() {
        return "hi";
    }
}
