package com.store.controller.admin;

import com.store.model.category.Category;
import com.store.model.product.Product;
import com.store.model.productBrand.ProductBrand;
import com.store.service.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class AdminProductController {
    private Service<Product> productService;
    private Service<Category> categoryService;
    private Service<ProductBrand> productBrandService;

    @GetMapping("/admin/products")
    public String viewProducts(Model model) {
        List<Product> products = productService.getAll();
        model.addAttribute("products", products);
        return "admin_products";
    }

    @RequestMapping("admin/products/new")
    public String showNewProductPage(Model model) {
        Product product = new Product();
        List<Category> categories = categoryService.getAll();
        List<ProductBrand> productBrands = productBrandService.getAll();
        model.addAttribute("product", product);
        model.addAttribute("categories", categories);
        model.addAttribute("productBrands", productBrands);
        return "admin_new_product";
    }

    @RequestMapping(value = "admin/products/save", method = RequestMethod.POST)
    public String saveProduct(@ModelAttribute("product") Product product ){
        product.setProductBrand(new ProductBrand());
        product.setCategory(new Category());
        productService.add(product);
        return "redirect:/admin/products";
    }

    @RequestMapping("/admin/product/edit/{id}")
    public ModelAndView showEditProductPage(@PathVariable(name = "id") int id) {
        ModelAndView mav = new ModelAndView("admin_edit_product");
        Product product = productService.getById(id);
        mav.addObject("product", product);
        mav.addObject("category", product.getCategory());
        mav.addObject("productBrand", product.getProductBrand());
        return mav;
    }

    @Autowired
    public void setProductService(Service<Product> productService) {
        this.productService = productService;
    }

    @Autowired
    public void setCategoryService(Service<Category> categoryService) {
        this.categoryService = categoryService;
    }

    @Autowired
    public void setProductBrandService(Service<ProductBrand> productBrandService) {
        this.productBrandService = productBrandService;
    }
}
