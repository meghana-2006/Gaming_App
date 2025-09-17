package com.Meghana.Gaming_app.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.Meghana.Gaming_app.entity.Collection;
import com.Meghana.Gaming_app.repository.CollectionRepository;

@Service
public class CollectionService {

    private final CollectionRepository collectionRepository;

    public CollectionService(CollectionRepository collectionRepository) {
        this.collectionRepository = collectionRepository;
    }

    public List<Collection> getAllCollections() {
        return collectionRepository.findAll();
    }

    public Collection getCollectionById(String id) {
        return collectionRepository.findById(id).orElse(null);
    }

    public Collection saveCollection(Collection collection) {
        return collectionRepository.save(collection);
    }

    public void deleteCollection(String id) {
        collectionRepository.deleteById(id);
    }
}
