package com.skillswap.entity;

import jakarta.persistence.*;

@Entity
public class SkillRequest {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long requesterId;
    private Long receiverId;
    private Long requestedSkillId;
    private Long offeredSkillId;
    private String status;

    public SkillRequest() {}

    public Long getId() { return id; }

    public Long getRequesterId() { return requesterId; }

    public void setRequesterId(Long requesterId) {
        this.requesterId = requesterId;
    }

    public Long getReceiverId() { return receiverId; }

    public void setReceiverId(Long receiverId) {
        this.receiverId = receiverId;
    }

    public Long getRequestedSkillId() { return requestedSkillId; }

    public void setRequestedSkillId(Long requestedSkillId) {
        this.requestedSkillId = requestedSkillId;
    }

    public Long getOfferedSkillId() { return offeredSkillId; }

    public void setOfferedSkillId(Long offeredSkillId) {
        this.offeredSkillId = offeredSkillId;
    }

    public String getStatus() { return status; }

    public void setStatus(String status) {
        this.status = status;
    }
}
