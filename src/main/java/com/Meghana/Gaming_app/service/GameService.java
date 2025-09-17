package com.Meghana.Gaming_app.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.Meghana.Gaming_app.entity.Game;
import com.Meghana.Gaming_app.repository.GameRepository;

@Service
public class GameService {

    private final GameRepository gameRepository;

    public GameService(GameRepository gameRepository) {
        this.gameRepository = gameRepository;
    }

    public List<Game> getAllGames() {
        return gameRepository.findAll();
    }

    public Game getGameById(String id) {
        return gameRepository.findById(id).orElse(null);
    }

    public Game saveGame(Game game) {
        return gameRepository.save(game);
    }

    public void deleteGame(String id) {
        gameRepository.deleteById(id);
    }
}
