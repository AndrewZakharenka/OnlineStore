package com.store.entity.product;

import com.store.entity.Entity;
import com.store.entity.category.CategoryEntity;
import com.store.entity.order.OrdersEntity;
import com.store.entity.productBrand.ProductBrandEntity;
import com.store.entity.shoppingCart.ShoppingCartEntity;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@javax.persistence.Entity
@Table(name = "product")
public class ProductEntity extends Entity {

    @Column(name = "MODEL")
    private String model;

    @Column(name = "PRICE")
    private double price;

    @Column(name = "URL_PHOTO")
    private String urlPhoto;

    @ManyToOne(cascade = CascadeType.ALL, optional = false, fetch = FetchType.EAGER)
    @JoinColumn(name = "ID_CATEGORY", referencedColumnName = "id")
    private CategoryEntity category;

    @ManyToOne(cascade = CascadeType.ALL, optional = false, fetch = FetchType.EAGER)
    @JoinColumn(name = "ID_PRODUCT_BRAND", referencedColumnName = "id")
    private ProductBrandEntity productBrand;

    @ManyToMany(mappedBy = "products")
    private Set<OrdersEntity> orders = new HashSet<>();

    @ManyToMany(mappedBy = "products")
    private Set<ShoppingCartEntity> shoppingCarts = new HashSet<>();


    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getUrlPhoto() {
        return urlPhoto;
    }

    public void setUrlPhoto(String urlPhoto) {
        this.urlPhoto = urlPhoto;
    }

    public CategoryEntity getCategory() {
        return category;
    }

    public void setCategory(CategoryEntity category) {
        this.category = category;
    }

    public ProductBrandEntity getProductBrand() {
        return productBrand;
    }

    public void setProductBrand(ProductBrandEntity productBrand) {
        this.productBrand = productBrand;
    }

    public Set<OrdersEntity> getOrders() {
        return orders;
    }

    public void setOrders(Set<OrdersEntity> orders) {
        this.orders = orders;
    }

    public ProductEntity(String model, double price, String urlPhoto, CategoryEntity category,
                         ProductBrandEntity productBrand, Set<OrdersEntity> orders) {
        this.model = model;
        this.price = price;
        this.urlPhoto = urlPhoto;
        this.category = category;
        this.productBrand = productBrand;
        this.orders = orders;
    }

    public ProductEntity(long id, String model, double price, String urlPhoto, CategoryEntity category,
                         ProductBrandEntity productBrand, Set<OrdersEntity> orders) {
        super(id);
        this.model = model;
        this.price = price;
        this.urlPhoto = urlPhoto;
        this.category = category;
        this.productBrand = productBrand;
        this.orders = orders;
    }

}
