package com.example.hellospring.controller;

import org.springframework.web.bind.annotation.*;

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

    //http://localhost:8080/api/get/path-variable/{name}<-- 계속 바뀔 수 있는 것들
    @GetMapping("/path-variable/{name}")
    public String pathVariable(@PathVariable String name){
        System.out.println("PathVariable : " + name);
        return name;
    }
}
