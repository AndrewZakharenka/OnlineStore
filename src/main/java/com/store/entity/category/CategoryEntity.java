package com.store.entity.category;

import com.store.entity.Entity;

import javax.persistence.Column;
import javax.persistence.Table;

@javax.persistence.Entity
@Table(name = "category")
public class CategoryEntity extends Entity {

    @Column(name = "NAME_CATEGORY")
    private String name;

    @Column(name = "DESCRIPTION")
    private String description;

    @Column(name = "SUBCATEGORY_ID")
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

    public CategoryEntity() {
    }

    public CategoryEntity(String name, String description, int parentCategoryId) {
        this.name = name;
        this.description = description;
        this.parentCategoryId = parentCategoryId;
    }

    public CategoryEntity(long id, String name, String description, int parentCategoryId) {
        super(id);
        this.name = name;
        this.description = description;
        this.parentCategoryId = parentCategoryId;
    }
}
