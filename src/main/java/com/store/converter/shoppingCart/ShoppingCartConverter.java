package com.store.converter.shoppingCart;

import com.store.converter.AbstractConverter;
import com.store.converter.product.ProductConverter;
import com.store.converter.user.UserConverter;
import com.store.entity.shoppingCart.ShoppingCartEntity;
import com.store.model.shoppingCart.ShoppingCart;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ShoppingCartConverter extends AbstractConverter<ShoppingCartEntity, ShoppingCart> {

    private UserConverter userConverter;
    private ProductConverter productConverter;

    @Override
    public ShoppingCart convert(ShoppingCartEntity shoppingCartEntity) {
        return new ShoppingCart(shoppingCartEntity.getId(), shoppingCartEntity.getTotalPrice(),
                userConverter.convert(shoppingCartEntity.getUser()),
                productConverter.convertSet(shoppingCartEntity.getProducts()));
    }

    @Override
    public ShoppingCartEntity convertReverse(ShoppingCart shoppingCart) {
        return new ShoppingCartEntity(shoppingCart.getId(), shoppingCart.getTotalPrice(),
                userConverter.convertReverse(shoppingCart.getUser()),
                productConverter.convertSetReverse(shoppingCart.getProducts()));
    }

    @Autowired
    public void setUserConverter(UserConverter userConverter) {
        this.userConverter = userConverter;
    }

    @Autowired
    public void setProductConverter(ProductConverter productConverter) {
        this.productConverter = productConverter;
    }
}
