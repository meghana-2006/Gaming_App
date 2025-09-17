package com.Meghana.Gaming_app.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.Meghana.Gaming_app.entity.Transaction;

public interface TransactionRepository extends MongoRepository<Transaction, String> {
}
