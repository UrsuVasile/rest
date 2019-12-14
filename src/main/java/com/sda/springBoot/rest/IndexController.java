package com.sda.springBoot.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class IndexController {

    @GetMapping(path = "welcome")
    public String welcome() {
        String welcome = "Bine ati venit pe pagina de inceput!";
        return welcome;
    }
}
