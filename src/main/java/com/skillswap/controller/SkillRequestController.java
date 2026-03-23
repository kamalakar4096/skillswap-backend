package com.skillswap.controller;

import com.skillswap.entity.SkillRequest;
import com.skillswap.service.SkillRequestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/requests")
@CrossOrigin
public class SkillRequestController {

    @Autowired
    private SkillRequestService service;

    @PostMapping("/send")
    public SkillRequest sendRequest(@RequestBody SkillRequest request) {
        return service.sendRequest(request);
    }

    @GetMapping("/all")
    public List<SkillRequest> getAllRequests() {
        return service.getAllRequests();
    }
}