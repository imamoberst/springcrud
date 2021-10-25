package com.imamtaufik.models.repo;

import com.imamtaufik.models.entities.Tutorial;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface TutorialRepo extends MongoRepository<Tutorial,String> {
    List<Tutorial> findByTitleContaining(String title);
    List<Tutorial> findByPublished(boolean published);
}
