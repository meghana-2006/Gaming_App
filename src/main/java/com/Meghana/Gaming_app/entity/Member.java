package com.Meghana.Gaming_app.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "members")
public class Member {

    @Id
    private String id;
    private String name;
    private String phoneNo;
    private Double balance;

    public Member() {}

    public Member(String id, String name, String phoneNo, Double balance) {
        this.id = id;
        this.name = name;
        this.phoneNo = phoneNo;
        this.balance = balance;
    }

    // Getters & Setters
    public String getId() { return id; }
    public void setId(String id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getPhoneNo() { return phoneNo; }
    public void setPhoneNo(String phoneNo) { this.phoneNo = phoneNo; }

    public Double getBalance() { return balance; }
    public void setBalance(Double balance) { this.balance = balance; }
}
