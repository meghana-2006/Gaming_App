package com.Meghana.Gaming_app.entity;

import java.time.LocalDateTime;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "recharges")
public class Recharge {

    @Id
    private String id;
    private String memberId;
    private Double amount;
    private LocalDateTime date;

    public Recharge() {}

    public Recharge(String id, String memberId, Double amount, LocalDateTime date) {
        this.id = id;
        this.memberId = memberId;
        this.amount = amount;
        this.date = date;
    }

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
