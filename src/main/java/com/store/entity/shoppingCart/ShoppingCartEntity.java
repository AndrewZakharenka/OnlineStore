package com.store.entity.shoppingCart;


import com.store.entity.Entity;
import com.store.entity.product.ProductEntity;
import com.store.entity.user.UserEntity;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@javax.persistence.Entity
@Table(name = "shopping_cart")
public class ShoppingCartEntity extends Entity {

    @Column(name = "TOTAL_PRICE")
    private double totalPrice;

    @ManyToOne(cascade = CascadeType.ALL, optional = false, fetch = FetchType.EAGER)
    @JoinColumn(name = "ID_USER", referencedColumnName = "id")
    private UserEntity user;

    @ManyToMany(cascade = {CascadeType.ALL})
    @JoinTable(
            name = "shopping_cart_product",
            joinColumns = {@JoinColumn(name = "ID_SHOPPING_CART")},
            inverseJoinColumns = {@JoinColumn(name = "ID_PRODUCT")}
    )
    private Set<ProductEntity> products = new HashSet<>();

    public ShoppingCartEntity() {
    }

    public ShoppingCartEntity(double totalPrice, UserEntity user, Set<ProductEntity> products) {
        this.totalPrice = totalPrice;
        this.user = user;
        this.products = products;
    }

    public ShoppingCartEntity(long id, double totalPrice, UserEntity user, Set<ProductEntity> products) {
        super(id);
        this.totalPrice = totalPrice;
        this.user = user;
        this.products = products;
    }

    public Set<ProductEntity> getProducts() {
        return products;
    }

    public void setProducts(Set<ProductEntity> products) {
        this.products = products;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public UserEntity getUser() {
        return user;
    }

    public void setUser(UserEntity user) {
        this.user = user;
    }
}
