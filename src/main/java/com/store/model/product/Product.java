package com.store.model.product;

import com.store.model.AbstractModel;
import com.store.model.category.Category;
import com.store.model.order.Orders;
import com.store.model.productBrand.ProductBrand;
import com.store.model.shoppingCart.ShoppingCart;

import java.util.HashSet;
import java.util.Set;

public class Product extends AbstractModel {

    private String model;
    private double price;
    private String urlPhoto;
    private Category category;
    private ProductBrand productBrand;
    private Set<Orders> orders = new HashSet<>();
    private Set<ShoppingCart> shoppingCarts = new HashSet<>();


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

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public ProductBrand getProductBrand() {
        return productBrand;
    }

    public void setProductBrand(ProductBrand productBrand) {
        this.productBrand = productBrand;
    }

    public Set<Orders> getOrders() {
        return orders;
    }

    public void setOrders(Set<Orders> orders) {
        this.orders = orders;
    }

    public Product() {
    }

    public Product(String model, double price, String urlPhoto, Category category,
                   ProductBrand productBrand, Set<Orders> orders) {
        this.model = model;
        this.price = price;
        this.urlPhoto = urlPhoto;
        this.category = category;
        this.productBrand = productBrand;
        this.orders = orders;
    }

    public Product(long id, String model, double price, String urlPhoto, Category category,
                   ProductBrand productBrand, Set<Orders> orders) {
        super(id);
        this.model = model;
        this.price = price;
        this.urlPhoto = urlPhoto;
        this.category = category;
        this.productBrand = productBrand;
        this.orders = orders;
    }

}
