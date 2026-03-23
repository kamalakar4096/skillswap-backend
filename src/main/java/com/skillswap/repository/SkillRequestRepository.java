package com.skillswap.repository;

import com.skillswap.entity.SkillRequest;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SkillRequestRepository extends JpaRepository<SkillRequest, Long> {
}