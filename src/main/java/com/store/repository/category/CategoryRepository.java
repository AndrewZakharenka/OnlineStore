package com.store.repository.category;

import com.store.entity.category.CategoryEntity;
import com.store.repository.BaseRepository;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends BaseRepository<CategoryEntity, Long> {
}
