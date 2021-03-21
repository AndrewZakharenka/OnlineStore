package com.store.converter.product;

import com.store.converter.AbstractConverter;
import com.store.converter.category.CategoryConverter;
import com.store.converter.order.OrderConverter;
import com.store.converter.productBrand.ProductBrandConverter;
import com.store.converter.shoppingCart.ShoppingCartConverter;
import com.store.model.category.Category;
import com.store.model.product.Product;
import com.store.entity.product.ProductEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ProductConverter extends AbstractConverter<ProductEntity, Product> {

    private CategoryConverter categoryConverter;
    private ProductBrandConverter productBrandConverter;
    private OrderConverter orderConverter;
    private ShoppingCartConverter shoppingCartConverter;


    @Override
    public Product convert(ProductEntity productEntity) {
        return new Product(productEntity.getId(), productEntity.getModel(),
                productEntity.getPrice(), productEntity.getUrlPhoto(),
                categoryConverter.convert(productEntity.getCategory()),
                productBrandConverter.convert(productEntity.getProductBrand()),
                orderConverter.convertSet(productEntity.getOrders()),
                shoppingCartConverter.convertSet(productEntity.getShoppingCarts()));
    }

    @Override
    public ProductEntity convertReverse(Product product) {
        return new ProductEntity(product.getId(), product.getModel(),
                product.getPrice(), product.getUrlPhoto(),
                categoryConverter.convertReverse(product.getCategory()),
                productBrandConverter.convertReverse(product.getProductBrand()),
                orderConverter.convertSetReverse(product.getOrders()),
                shoppingCartConverter.convertSetReverse(product.getShoppingCarts()));
    }

    @Autowired
    public void setOrderConverter(OrderConverter orderConverter) {
        this.orderConverter = orderConverter;
    }

    @Autowired
    public void setShoppingCartConverter(ShoppingCartConverter shoppingCartConverter) {
        this.shoppingCartConverter = shoppingCartConverter;
    }

    @Autowired
    public void setProductBrandConverter(ProductBrandConverter productBrandConverter) {
        this.productBrandConverter = productBrandConverter;
    }

    @Autowired
    public void setCategoryConverter(CategoryConverter categoryConverter) {
        this.categoryConverter = categoryConverter;
    }
}
