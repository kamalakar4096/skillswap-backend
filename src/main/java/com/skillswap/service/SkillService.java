package com.skillswap.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.skillswap.entity.Skill;
import com.skillswap.repository.SkillRepository;

@Service
public class SkillService {

    @Autowired
    private SkillRepository repo;

    public Skill addSkill(Skill s) {
        return repo.save(s);
    }

    public List<Skill> getSkills() {
        return repo.findAll();
    }
}