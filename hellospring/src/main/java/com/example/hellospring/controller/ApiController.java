package com.example.hellospring.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController //해당 클래스는 rest api로 처리하는 controller
@RequestMapping("/api") //RequestMapping은 url을 지정해주는 annotaition
public class ApiController {

    @GetMapping("/hello") //http://localhost:8080/api/hello 라는 주소가 맵핑됨
    public String hello(){
        return "Hello Spring boot!";
    }
}
