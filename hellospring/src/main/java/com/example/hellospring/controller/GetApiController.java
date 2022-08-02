package com.example.hellospring.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/get") //주소부여
public class GetApiController {

    @GetMapping(path = "/hello") //명시적으로 path에 주소를 넣어주는것
    public String hello(){
        return "get Hello";
    }

    @RequestMapping(path = "/hi", method = RequestMethod.GET) //get / post/ put/ delete 모든 메서드가 매핑되기 때문에 명시적지정해줌
    public String hi(){

        return "Request hi";
    }
}
