package com.skillswap.service;

import com.skillswap.entity.SkillRequest;
import com.skillswap.repository.SkillRequestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SkillRequestService {

    @Autowired
    private SkillRequestRepository repository;

    public SkillRequest sendRequest(SkillRequest request) {
        request.setStatus("PENDING");
        return repository.save(request);
    }

    public List<SkillRequest> getAllRequests() {
        return repository.findAll();
    }
}