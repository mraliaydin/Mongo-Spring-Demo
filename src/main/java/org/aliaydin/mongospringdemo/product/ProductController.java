package org.aliaydin.mongospringdemo.product;

import lombok.AllArgsConstructor;
import org.apache.coyote.Response;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/products")
@AllArgsConstructor
public class ProductController {


    private ProductService productService;

    @PostMapping
    public ResponseEntity<String> saveProduct(@RequestBody Product product){
        return new ResponseEntity<>(productService.saveProduct(product), HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<Product>> findAllProduct(){
        return ResponseEntity.ok(productService.findAllProduct());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Product> findProductById(@PathVariable String id){
        return ResponseEntity.ok(productService.findProductById(id));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteProductById(@PathVariable String id){
        productService.deleteProductById(id);
        return ResponseEntity.ok("Product Deleted Successfully");
    }
}
