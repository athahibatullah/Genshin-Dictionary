package com.devops.DevOps.repository;

import com.devops.DevOps.entity.Character;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CharacterRepository extends JpaRepository<Character, Integer> {
    Character findByName(String name);
}
