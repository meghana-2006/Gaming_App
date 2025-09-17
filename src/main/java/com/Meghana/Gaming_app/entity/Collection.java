package com.Meghana.Gaming_app.entity;

import java.time.LocalDate;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "collections")
public class Collection {

    @Id
    private String id;
    private Double amount;
    private LocalDate date;

    public Collection() {}

    public Collection(String id, Double amount, LocalDate date) {
        this.id = id;
        this.amount = amount;
        this.date = date;
    }

    // Getters & Setters
    public String getId() { return id; }
    public void setId(String id) { this.id = id; }

    public Double getAmount() { return amount; }
    public void setAmount(Double amount) { this.amount = amount; }

    public LocalDate getDate() { return date; }
    public void setDate(LocalDate date) { this.date = date; }
}
