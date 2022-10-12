package com.devops.DevOps.controller;

import com.devops.DevOps.entity.Character;
import com.devops.DevOps.service.CharacterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api")
public class CharacterController {
    @Autowired
    CharacterService service;

    @GetMapping("")
    public String HelloWorld(){
        return "Hello";
    }
    @GetMapping("/character")
    public List<Character> getAllCharacter(){
        return service.getAllCharacter();
    }

    @GetMapping("/character/{name}")
    public Character getCharacterByName(@PathVariable String name){
        return service.getCharacterByName(name);
    }

}
