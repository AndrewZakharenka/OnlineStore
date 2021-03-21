package com.store.repository.productBrand;

import com.store.entity.productBrand.ProductBrandEntity;
import com.store.repository.BaseRepository;

public interface ProductBrandRepository extends BaseRepository<ProductBrandEntity, Long> {
    ProductBrandEntity getById(Long id);
}
