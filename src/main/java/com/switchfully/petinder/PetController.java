package com.switchfully.petinder;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping(value="pets")
public class PetController {
    @GetMapping(value = "hello")
    public String helloPets(){
        return "Hello Pets!";
    }
}
