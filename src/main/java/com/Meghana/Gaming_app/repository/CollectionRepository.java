package com.Meghana.Gaming_app.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.Meghana.Gaming_app.entity.Collection;

public interface CollectionRepository extends MongoRepository<Collection, String> {
}
