package com.platzi.market.domain.repository;

import com.platzi.market.domain.Product;
import org.apache.catalina.LifecycleState;
import org.springframework.expression.spel.support.ReflectivePropertyAccessor;

import java.util.List;
import java.util.Optional;

public interface ProductRepository {
    List<Product> getAll();
    Optional<List<Product>> getByCategory(int categoryId);
    Optional<List<Product>> getScarseProduct(int quantity);
    Optional<Product> getProduct(int productId);
    Product save(Product product);
    void delete(int productId);

}
