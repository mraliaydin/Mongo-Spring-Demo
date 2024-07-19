package org.aliaydin.mongospringdemo.product;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import org.aliaydin.mongospringdemo.category.Category;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

//To create a document in mongoDb
@Document
@Data
@AllArgsConstructor
@Builder
public class Product {

    @Id
    private String id;
    private String name;
    private String description;
    private List<String> tags;

    // Reference of another collection
    @DBRef
    private Category category;
}
