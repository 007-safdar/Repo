package dev.sxfdxr.springmovies;


import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface reviewsRepository extends MongoRepository<reviews, ObjectId>{
    
}
