package com.store.model.category;

import com.store.entity.Entity;
import com.store.model.AbstractModel;


public class Category extends AbstractModel {
    
    private String name;
    private String description;
    private int parentCategoryId;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getParentCategoryId() {
        return parentCategoryId;
    }

    public void setParentCategoryId(int parentCategoryId) {
        this.parentCategoryId = parentCategoryId;
    }

    public Category() {
    }

    public Category(String name, String description, int parentCategoryId) {
        this.name = name;
        this.description = description;
        this.parentCategoryId = parentCategoryId;
    }

    public Category(long id, String name, String description, int parentCategoryId) {
        super(id);
        this.name = name;
        this.description = description;
        this.parentCategoryId = parentCategoryId;
    }
}
