package com.example.exercise2;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/v2")
public class AskingForecastController {

    @GetMapping(path = "/ciao/{provincia}")
    public User NameAndQuestion(
            @PathVariable String provincia,
            @RequestParam String nome)
    {
        return new User(nome, provincia);
    }
}
