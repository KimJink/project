package com.project.web;

import com.project.web.dto.HelloResponseDto;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class HelloController {
    @GetMapping("/hello")
    public String hello(){
        return "hello";
    }
    @GetMapping("/hello/dto")
    public HelloResponseDto helloDto(@RequestParam Map<String, Object> param){
        return HelloResponseDto.builder().name((String)param.get("name")).amount(Integer.parseInt((String)param.get("amount"))).build();
    }
}
