package com.Meghana.Gaming_app.entity;

import java.time.LocalDateTime;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "transactions")
public class Transaction {

    @Id
    private String id;
    private String memberId;
    private String gameId;
    private Double amount;
    private LocalDateTime date;

    public Transaction() {}

    public Transaction(String id, String memberId, String gameId, Double amount, LocalDateTime date) {
        this.id = id;
        this.memberId = memberId;
        this.gameId = gameId;
        this.amount = amount;
        this.date = date;
    }

    // Getters & Setters
    public String getId() { return id; }
    public void setId(String id) { this.id = id; }

    public String getMemberId() { return memberId; }
    public void setMemberId(String memberId) { this.memberId = memberId; }

    public String getGameId() { return gameId; }
    public void setGameId(String gameId) { this.gameId = gameId; }

    public Double getAmount() { return amount; }
    public void setAmount(Double amount) { this.amount = amount; }

    public LocalDateTime getDate() { return date; }
    public void setDate(LocalDateTime date) { this.date = date; }
}
