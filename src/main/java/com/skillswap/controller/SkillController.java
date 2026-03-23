package com.skillswap.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.skillswap.entity.Skill;
import com.skillswap.service.SkillService;

@RestController
@RequestMapping("/skills")
@CrossOrigin("*")
public class SkillController {

    @Autowired
    private SkillService service;

    @PostMapping("/add")
    public Skill addSkill(@RequestBody Skill s) {
        return service.addSkill(s);
    }

    @GetMapping("/all")
    public List<Skill> getSkills(){
        return service.getSkills();
    }
}