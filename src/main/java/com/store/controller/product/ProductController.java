package com.store.controller.product;

import com.store.model.category.Category;
import com.store.model.product.Product;
import com.store.model.productBrand.ProductBrand;
import com.store.service.Service;
import com.store.service.impl.product.ProductServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Controller
public class ProductController {
    private Service<Product> productService;
    private Service<Category> categoryService;
    private Service<ProductBrand> productBrandService;

    @GetMapping("/catalog")
    public String catalog(Model model){
        List<Product> products = productService.getAll();
        List<Category> categories = categoryService.getAll();
        List<ProductBrand> productBrands = productBrandService.getAll();
        model.addAttribute("products", products);
        model.addAttribute("categories", categories);
        model.addAttribute("productBrands", productBrands);
        return "catalog";
    }

    @GetMapping("catalog/{id}")
    public String viewProduct(@PathVariable("id") int id, Model model){
        Product product = productService.getById(id);
        model.addAttribute("product", product);
        return "product-page";
    }


    @Autowired
    public void setCategoryService(Service<Category> categoryService) {
        this.categoryService = categoryService;
    }

    @Autowired
    public void setProductService(Service<Product> productService) {
        this.productService = productService;
    }

    @Autowired
    public void setProductBrandService(Service<ProductBrand> productBrandService) {
        this.productBrandService = productBrandService;
    }
}
