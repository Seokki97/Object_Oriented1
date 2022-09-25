package controller;

import controller.dto.User;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class ApiController {

    //text를 내려주는것
    @GetMapping("/text")
    public String text(@RequestParam String account){
        return account;
    }

    //JSON을 내려주는것, request를 하면 object mapper가 object로 변환시켜주고 이것을 json으로 변환후 response해줌
    @PostMapping
    public User json(@RequestBody User user){
        return user;

    }
}
