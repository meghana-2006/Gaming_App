package com.Meghana.Gaming_app.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.Meghana.Gaming_app.entity.Game;

public interface GameRepository extends MongoRepository<Game, String> {
}
