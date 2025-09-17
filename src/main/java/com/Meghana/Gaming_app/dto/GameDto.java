package com.Meghana.Gaming_app.dto;

import com.Meghana.Gaming_app.enums.GameStatus;

public class GameDto {
    private String id;
    private String name;
    private Double price;
    private String description;
    private GameStatus status;
    private Integer duration;
    private Integer minPlayerCount;
    private Integer maxPlayerCount;
    private Boolean playerCountMultiple;

    // Getters & Setters
    public String getId() { return id; }
    public void setId(String id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public Double getPrice() { return price; }
    public void setPrice(Double price) { this.price = price; }

    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }

    public GameStatus getStatus() { return status; }
    public void setStatus(GameStatus status) { this.status = status; }

    public Integer getDuration() { return duration; }
    public void setDuration(Integer duration) { this.duration = duration; }

    public Integer getMinPlayerCount() { return minPlayerCount; }
    public void setMinPlayerCount(Integer minPlayerCount) { this.minPlayerCount = minPlayerCount; }

    public Integer getMaxPlayerCount() { return maxPlayerCount; }
    public void setMaxPlayerCount(Integer maxPlayerCount) { this.maxPlayerCount = maxPlayerCount; }

    public Boolean getPlayerCountMultiple() { return playerCountMultiple; }
    public void setPlayerCountMultiple(Boolean playerCountMultiple) { this.playerCountMultiple = playerCountMultiple; }
}
