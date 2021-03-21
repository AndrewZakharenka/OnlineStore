package com.store.service.impl.category;


import com.store.converter.IConverter;
import com.store.entity.category.CategoryEntity;
import com.store.model.category.Category;
import com.store.repository.BaseRepository;
import com.store.repository.category.CategoryRepository;
import com.store.service.Service;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@org.springframework.stereotype.Service
public class CategoryServiceImpl implements Service<Category> {
    private CategoryRepository categoryRepository;
    private IConverter<CategoryEntity, Category> categoryConverter;


    @Override
    public List<Category> getAll() {
        return categoryConverter.convertAll((List<CategoryEntity>) categoryRepository.findAll());
    }

    @Override
    public void add(Category category) {
        categoryRepository.save(categoryConverter.convertReverse(category));
    }

    @Override
    public boolean deleteById(long id) {
        categoryRepository.deleteById(id);
        if (categoryRepository.getById(id) == null) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public void edit(Category category) {
        categoryRepository.save(categoryConverter.convertReverse(category));
    }

    @Override
    public Category getById(long id) {
        return categoryConverter.convert(categoryRepository.findById(id).get());
    }

    @Autowired
    public void setCategoryConverter(IConverter<CategoryEntity, Category> categoryConverter) {
        this.categoryConverter = categoryConverter;
    }

    @Autowired
    public void setCategoryRepository(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }
}
