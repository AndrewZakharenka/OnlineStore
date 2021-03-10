package com.store.entity.category;

import com.store.entity.Entity;

import javax.persistence.Column;
import javax.persistence.Table;

@javax.persistence.Entity
@Table(name = "category")
public class CategoryEntity extends Entity {

    @Column(name = "NAME_CATEGORY")
    private String nameCategory;

    @Column(name = "DESCRIPTION")
    private String description;

    @Column(name = "SUBCATEGORY_ID")
    private int subcategoryId;

    public String getNameCategory() {
        return nameCategory;
    }

    public void setNameCategory(String nameCategory) {
        this.nameCategory = nameCategory;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getSubcategoryId() {
        return subcategoryId;
    }

    public void setSubcategoryId(int subcategoryId) {
        this.subcategoryId = subcategoryId;
    }

    public CategoryEntity(String nameCategory, String description, int subcategoryId) {
        this.nameCategory = nameCategory;
        this.description = description;
        this.subcategoryId = subcategoryId;
    }

    public CategoryEntity(long id, String nameCategory, String description, int subcategoryId) {
        super(id);
        this.nameCategory = nameCategory;
        this.description = description;
        this.subcategoryId = subcategoryId;
    }
}
