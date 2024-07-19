package org.aliaydin.mongospringdemo.product;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class ProductService {

    private ProductRepository productRepository;
    public String saveProduct(Product product){

        // todo: use a DTO and validate the objects

        //productRepository.insert -> for new object insertion, if there is an id match it will throw an error.
        //productRepository.save -> for new object insertion and updating it

        return productRepository.save(product).getId();
    }

    public Product findProductById(String id){
        return productRepository.findById(id).orElse(null);
    }

    public List<Product> findAllProduct(){
        return productRepository.findAll();
    }

    public void deleteProductById(String id){
        productRepository.deleteById(id);
    }
}
