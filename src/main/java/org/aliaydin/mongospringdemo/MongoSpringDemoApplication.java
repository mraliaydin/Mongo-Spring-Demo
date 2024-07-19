package org.aliaydin.mongospringdemo;

import org.aliaydin.mongospringdemo.category.Category;
import org.aliaydin.mongospringdemo.category.CategoryRepository;
import org.aliaydin.mongospringdemo.product.Product;
import org.aliaydin.mongospringdemo.product.ProductRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class MongoSpringDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(MongoSpringDemoApplication.class, args);
    }

    //Execute code at execution time
    /*@Bean
    public CommandLineRunner commandLineRunner(
            //Inject
            ProductRepository productRepository,
            CategoryRepository categoryRepository
    ){
        return args -> {
            *//*Product product = Product.builder()
                    .name("iPhone")
                    .description("Smart Phone")
                    .build();

            productRepository.insert(product);*//*

            Category category = Category.builder()
                    .name("Ayakkabi")
                    .description("Ayakkabi Acıklama")
                    .build();

            categoryRepository.insert(category);

            Category category1 = Category.builder()
                    .name("Gomlek")
                    .description("Gomlek Acıklama")
                    .build();

            categoryRepository.insert(category1);
        };
    }*/

}
