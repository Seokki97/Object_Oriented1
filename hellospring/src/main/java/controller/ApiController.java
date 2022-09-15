package controller;

import controller.dto.User;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class ApiController {

    //text를 내려주는것
    @GetMapping("/text")
    public String text(@RequestParam String account){
        return account;
    }

    //JSON을 내려주는것
    @PostMapping
    public User json(@RequestBody User user){
        return user;

    }
}
