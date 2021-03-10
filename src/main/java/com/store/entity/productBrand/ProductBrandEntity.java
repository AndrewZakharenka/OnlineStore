package com.store.entity.productBrand;

import com.store.entity.Entity;

import javax.persistence.Column;
import javax.persistence.Table;

@javax.persistence.Entity
@Table(name = "product_brand")
public class ProductBrandEntity extends Entity {

    @Column(name = "NAME_BRAND")
    private String nameBrand;

    @Column(name = "DESCRIPTION")
    private String description;

    public String getNameBrand() {
        return nameBrand;
    }

    public void setNameBrand(String nameBrand) {
        this.nameBrand = nameBrand;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ProductBrandEntity(long id, String nameBrand, String description) {
        super(id);
        this.nameBrand = nameBrand;
        this.description = description;
    }

    public ProductBrandEntity(String nameBrand, String description) {
        this.nameBrand = nameBrand;
        this.description = description;
    }
}
