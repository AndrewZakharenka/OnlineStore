package com.store.service.impl.product;
import com.store.converter.IConverter;
import com.store.entity.product.ProductEntity;
import com.store.model.product.Product;
import com.store.model.productBrand.ProductBrand;
import com.store.repository.category.CategoryRepository;
import com.store.repository.product.ProductRepository;
import com.store.repository.productBrand.ProductBrandRepository;
import com.store.service.Service;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@org.springframework.stereotype.Service
public class ProductServiceImpl implements Service<Product> {
    private ProductRepository productRepository;
    @Autowired
    private CategoryRepository categoryRepository;
    @Autowired
    private ProductBrandRepository productBrandRepository;
    private IConverter<ProductEntity, Product> productConverter;


    @Override
    public List<Product> getAll() {
        return productConverter.convertAll((List<ProductEntity>) productRepository.findAll());
    }

    @Override
    public void add(Product product) {
        ProductEntity productEntity = productConverter.convertReverse(product);
        if (productEntity.getCategory() != null){
            productEntity.setCategory(categoryRepository.getById(product.getCategory().getId()));
        } else {
            productEntity.setCategory(categoryRepository.getById(1L));
        }
        if (productEntity.getProductBrand() != null){
            productEntity.setProductBrand(productBrandRepository.getById(product.getProductBrand().getId()));
        } else {
            productEntity.setProductBrand(productBrandRepository.getById(1L));
        }
        productRepository.save(productEntity);
    }

    @Override
    public boolean deleteById(long id) {
        productRepository.deleteById(id);
        if (productRepository.getById(id) == null){
            return true;
        } else{
            return false;
        }
    }

    @Override
    public void edit(Product product) {
        productRepository.save(productConverter.convertReverse(product));
    }

    @Override
    public Product getById(long id) {
        return productConverter.convert(productRepository.findById(id).get());
    }


    @Autowired
    public void setProductRepository(ProductRepository productRepository){
        this.productRepository = productRepository;
    }

    @Autowired
    public void setProductConverter(IConverter<ProductEntity, Product> productConverter) {
        this.productConverter = productConverter;
    }
}
