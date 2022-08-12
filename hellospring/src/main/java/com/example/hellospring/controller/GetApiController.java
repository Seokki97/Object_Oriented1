package com.example.hellospring.controller;

import com.example.hellospring.dto.UserRequest;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

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
    @GetMapping("/path-variable/{name}") //{}안에 이름과 pathvariable 변수 이름은 똑같아야함
    public String pathVariable(@PathVariable String name){
        System.out.println("PathVariable : " + name);
        return name;
    }

   //http://localhost:8080/api/get/query-param?user=steve&email=steve@gmail.com&age=30

    @GetMapping(path = "query-param")
    public String queryParam(@RequestParam Map<String, String> queryParam){
        StringBuilder sb = new StringBuilder();

        queryParam.entrySet().forEach(entry ->{
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
            System.out.println("\n");

            sb.append(entry.getKey()+" = " + entry.getValue()+"\n");
        });
        return sb.toString();
    }

    @GetMapping(path = "query-param02")
    public String queryParam02(
        @RequestParam String name,
        @RequestParam String email,
        @RequestParam int age
        ){
        System.out.println(name);
        System.out.println(email);
        System.out.println(age);

        return name+age+email;
    }

    @GetMapping(path = "query-param03")
    public String queryParam03( UserRequest userRequest){
        System.out.println(userRequest.getAge());
        System.out.println(userRequest.getEmail());
        System.out.println(userRequest.getName());

        return userRequest.toString();
    }
//여기서 requestparam 어노테이션을 안붙이는 이유는 매개변수에 객체가 들어오면 스프링부트가 자체적으로 키값들으 판단함
//그리고 해당 객체에서 매칭을 알아서 하고 가져와줌

}
