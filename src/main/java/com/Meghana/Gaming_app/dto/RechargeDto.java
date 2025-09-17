package com.Meghana.Gaming_app.dto;

import java.time.LocalDateTime;

public class RechargeDto {
    private String id;
    private String memberId;
    private Double amount;
    private LocalDateTime date;

    // Getters & Setters
    public String getId() { return id; }
    public void setId(String id) { this.id = id; }

    public String getMemberId() { return memberId; }
    public void setMemberId(String memberId) { this.memberId = memberId; }

    public Double getAmount() { return amount; }
    public void setAmount(Double amount) { this.amount = amount; }

    public LocalDateTime getDate() { return date; }
    public void setDate(LocalDateTime date) { this.date = date; }
}
