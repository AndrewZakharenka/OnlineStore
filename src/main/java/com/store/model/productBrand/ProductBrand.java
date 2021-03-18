package com.store.model.productBrand;

import com.store.model.AbstractModel;

public class ProductBrand extends AbstractModel {

    private String name;
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

    public ProductBrand() {
    }

    public ProductBrand(long id, String name, String description) {
        super(id);
        this.name = name;
        this.description = description;
    }

    public ProductBrand(String name, String description) {
        this.name = name;
        this.description = description;
    }
}
