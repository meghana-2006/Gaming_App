package com.Meghana.Gaming_app.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Meghana.Gaming_app.entity.Collection;
import com.Meghana.Gaming_app.service.CollectionService;

@RestController
@RequestMapping("/api/collections")
public class CollectionController {

    private final CollectionService collectionService;

    public CollectionController(CollectionService collectionService) {
        this.collectionService = collectionService;
    }

    @GetMapping
    public List<Collection> getAllCollections() {
        return collectionService.getAllCollections();
    }

    @GetMapping("/{id}")
    public Collection getCollectionById(@PathVariable String id) {
        return collectionService.getCollectionById(id);
    }

    @PostMapping
    public Collection createCollection(@RequestBody Collection collection) {
        return collectionService.saveCollection(collection);
    }

    @DeleteMapping("/{id}")
    public void deleteCollection(@PathVariable String id) {
        collectionService.deleteCollection(id);
    }
}
