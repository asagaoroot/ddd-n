package com.asagaoroot.ddd.controller;

import com.asagaoroot.ddd.chapter.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String hello(@RequestParam(value = "name", defaultValue = "World") String name) {

        var userRepository = new UserRepository();
        var userService = new UserService(userRepository);
        var userApplicationService = new UserApplicationService(userRepository, userService);

        var program = new Program(userRepository);
        program.createUser("naruse");

        var updateNameCommand = new UserUpdateCommand("0"); // dummy
        updateNameCommand.name = "naruse2";
        userApplicationService.update(updateNameCommand);

        var updateMailCommand = new UserUpdateCommand("0"); // dummy
        updateMailCommand.mail = "xxx@gmail.com";
        userApplicationService.update(updateMailCommand);

        return String.format("Hello %s!", name);
    }

}
