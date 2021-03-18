package com.store.model.shoppingCart;

import com.store.model.AbstractModel;
import com.store.model.product.Product;
import com.store.model.user.User;

import java.util.HashSet;
import java.util.Set;


public class ShoppingCart extends AbstractModel {

    private double totalPrice;
    private User user;
    private Set<Product> products = new HashSet<>();

    public ShoppingCart() {
    }

    public ShoppingCart(double totalPrice, User user) {
        this.totalPrice = totalPrice;
        this.user = user;
    }

    public ShoppingCart(long id, double totalPrice, User user) {
        super(id);
        this.totalPrice = totalPrice;
        this.user = user;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
