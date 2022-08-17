package put.controller;

import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import post.dto.PostRequestDto;
import put.dto.putRequestDto;

@RestController
@RequestMapping("/api")
public class PutApiController {

    @PutMapping("/put")
    public putRequestDto put(@RequestBody putRequestDto requestDto){
        return requestDto;
    }
}
