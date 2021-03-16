package com.store.entity.productBrand;

import com.store.entity.Entity;

import javax.persistence.Column;
import javax.persistence.Table;

@javax.persistence.Entity
@Table(name = "product_brand")
public class ProductBrandEntity extends Entity {

    @Column(name = "NAME_BRAND")
    private String name;

    @Column(name = "DESCRIPTION")
    private String description;

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

    public ProductBrandEntity(long id, String name, String description) {
        super(id);
        this.name = name;
        this.description = description;
    }

    public ProductBrandEntity(String name, String description) {
        this.name = name;
        this.description = description;
    }
}
