package com.store.converter.productBrand;

import com.store.converter.AbstractConverter;
import com.store.entity.productBrand.ProductBrandEntity;
import com.store.model.productBrand.ProductBrand;
import org.springframework.stereotype.Component;

@Component
public class ProductBrandConverter extends AbstractConverter<ProductBrandEntity, ProductBrand> {
    @Override
    public ProductBrand convert(ProductBrandEntity productBrandEntity) {
        return new ProductBrand(productBrandEntity.getId(), productBrandEntity.getName(),
                productBrandEntity.getDescription());
    }

    @Override
    public ProductBrandEntity convertReverse(ProductBrand productBrand) {
        return new ProductBrandEntity(productBrand.getId(), productBrand.getName(),
                productBrand.getDescription());
    }
}
