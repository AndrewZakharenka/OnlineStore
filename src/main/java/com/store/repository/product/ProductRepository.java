package com.store.repository.product;


import com.store.entity.product.ProductEntity;
import com.store.repository.BaseRepository;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends BaseRepository<ProductEntity, Long> {
}
