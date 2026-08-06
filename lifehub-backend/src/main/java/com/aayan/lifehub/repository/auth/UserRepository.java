package com.aayan.lifehub.repository.auth;

import com.aayan.lifehub.model.auth.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User,String> {

}
