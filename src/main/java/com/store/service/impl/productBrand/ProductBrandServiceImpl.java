package com.store.service.impl.productBrand;

import com.store.converter.IConverter;
import com.store.entity.product.ProductEntity;
import com.store.entity.productBrand.ProductBrandEntity;
import com.store.model.product.Product;
import com.store.model.productBrand.ProductBrand;
import com.store.repository.product.ProductRepository;
import com.store.repository.productBrand.ProductBrandRepository;
import com.store.service.Service;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@org.springframework.stereotype.Service
public class ProductBrandServiceImpl implements Service<ProductBrand> {
    private ProductBrandRepository productBrandRepository;
    private IConverter<ProductBrandEntity, ProductBrand> productBrandConverter;


    @Override
    public List<ProductBrand> getAll() {
        return productBrandConverter.convertAll((List<ProductBrandEntity>) productBrandRepository.findAll());
    }

    @Override
    public void add(ProductBrand productBrand) {
        productBrandRepository.save(productBrandConverter.convertReverse(productBrand));
    }

    @Override
    public boolean deleteById(long id) {
        productBrandRepository.deleteById(id);
        if (productBrandRepository.getById(id) == null) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public void edit(ProductBrand productBrand) {
        productBrandRepository.save(productBrandConverter.convertReverse(productBrand));
    }

    @Override
    public ProductBrand getById(long id) {
        return productBrandConverter.convert(productBrandRepository.findById(id).get());
    }

    @Autowired
    public void setProductBrandConverter(IConverter<ProductBrandEntity, ProductBrand> productBrandConverter) {
        this.productBrandConverter = productBrandConverter;
    }

    @Autowired
    public void setProductBrandRepository(ProductBrandRepository productBrandRepository) {
        this.productBrandRepository = productBrandRepository;
    }
}
