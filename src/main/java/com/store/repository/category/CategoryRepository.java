package com.store.repository.category;

import com.store.entity.category.CategoryEntity;
import com.store.repository.BaseRepository;


public interface CategoryRepository extends BaseRepository<CategoryEntity, Long> {
    CategoryEntity getById(Long id);
}
