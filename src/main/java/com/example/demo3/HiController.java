package com.example.demo3;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class HiController {

    @Resource
    private HiService hiService;

    @GetMapping("/")
    public String getHuman() {
        return hiService.getName();
    }

    @GetMapping("/temp/")
    public String getHuman2() {
        return hiService.getName2();
    }

}
