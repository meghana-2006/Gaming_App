package com.Meghana.Gaming_app.dto;

import java.time.LocalDate;

public class CollectionDto {
    private String id;
    private Double amount;
    private LocalDate date;

    // Getters & Setters
    public String getId() { return id; }
    public void setId(String id) { this.id = id; }

    public Double getAmount() { return amount; }
    public void setAmount(Double amount) { this.amount = amount; }

    public LocalDate getDate() { return date; }
    public void setDate(LocalDate date) { this.date = date; }
}
