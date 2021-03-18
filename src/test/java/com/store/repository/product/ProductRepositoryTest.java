package com.store.repository.product;

import com.store.entity.category.CategoryEntity;
import com.store.entity.product.ProductEntity;
import com.store.entity.productBrand.ProductBrandEntity;
import com.store.repository.AbstractRepositoryTest;
import com.store.repository.BaseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.util.HashSet;

import static org.junit.jupiter.api.Assertions.*;

@DataJpaTest
class ProductRepositoryTest extends AbstractRepositoryTest<ProductEntity, Long> {

    @Override
    protected ProductEntity createEntity() {
        ProductEntity productEntity = new ProductEntity();
        productEntity.setCategory(new CategoryEntity());
        productEntity.setProductBrand(new ProductBrandEntity());
        productEntity.setOrders(new HashSet<>());
        return productEntity;
    }

    @Override
    @Autowired
    protected void setRepository(BaseRepository<ProductEntity, Long> repository) {
        this.repository = repository;
    }
}