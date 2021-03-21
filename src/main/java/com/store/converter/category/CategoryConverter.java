package com.store.converter.category;

import com.store.converter.AbstractConverter;
import com.store.entity.category.CategoryEntity;
import com.store.model.category.Category;
import org.springframework.stereotype.Component;

@Component
public class CategoryConverter extends AbstractConverter<CategoryEntity, Category> {
    @Override
    public Category convert(CategoryEntity categoryEntity) {
        return new Category(categoryEntity.getId(), categoryEntity.getName(),
                categoryEntity.getDescription(), categoryEntity.getParentCategoryId());
    }

    @Override
    public CategoryEntity convertReverse(Category category) {
        return new CategoryEntity(category.getId(), category.getName(),
                category.getDescription(), category.getParentCategoryId());
    }
}
