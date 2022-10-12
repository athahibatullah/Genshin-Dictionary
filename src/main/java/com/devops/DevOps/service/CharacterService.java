package com.devops.DevOps.service;

import com.devops.DevOps.entity.Character;
import com.devops.DevOps.repository.CharacterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CharacterService {

    @Autowired
    CharacterRepository repository;

    public Character getCharacterByName(String name){
        Character character = new Character();

        if(repository.findByName(name) != null){
            return repository.findByName(name);
        }
        else{
            throw new RuntimeException("Character with name " + name + " does not exist in the database");
        }
    }
    public List<Character> getAllCharacter(){
        return repository.findAll();
    }
}
