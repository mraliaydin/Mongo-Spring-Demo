package org.aliaydin.mongospringdemo.category;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface CategoryRepository extends MongoRepository<Category, String> {
}
