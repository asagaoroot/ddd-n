package com.asagaoroot.ddd.controller;

import com.asagaoroot.ddd.chapter.Program;
import com.asagaoroot.ddd.chapter.UserRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String hello(@RequestParam(value = "name", defaultValue = "World") String name) {

        var userRepository = new UserRepository();
        var program = new Program(userRepository);
        program.createUser("naruse");

        return String.format("Hello %s!", name);
    }

}
