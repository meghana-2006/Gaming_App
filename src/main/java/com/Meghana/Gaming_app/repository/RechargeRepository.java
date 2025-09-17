package com.Meghana.Gaming_app.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.Meghana.Gaming_app.entity.Recharge;

public interface RechargeRepository extends MongoRepository<Recharge, String> {
}
