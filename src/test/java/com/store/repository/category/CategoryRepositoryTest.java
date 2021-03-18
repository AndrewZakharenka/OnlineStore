package com.store.repository.category;

import com.store.entity.category.CategoryEntity;
import com.store.repository.AbstractRepositoryTest;
import com.store.repository.BaseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import static org.junit.jupiter.api.Assertions.*;

@DataJpaTest
class CategoryRepositoryTest extends AbstractRepositoryTest<CategoryEntity, Long> {

    @Override
    protected CategoryEntity createEntity() {
        return new CategoryEntity();
    }

    @Override
    @Autowired
    protected void setRepository(BaseRepository<CategoryEntity, Long> repository) {
        this.repository = repository;
    }
}