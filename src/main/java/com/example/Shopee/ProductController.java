package com.example.Shopee;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class ProductController {
    private final ProductRepository repo;

    public ProductController(ProductRepository repo) {
        this.repo = repo;
    }

    /** ホーム画面 */
    @GetMapping("/home")
    public String home(Model model) {
        model.addAttribute("products", repo.findAll());
        return "products/home";   // templates/products/list.html
    }

    /** 商品一覧 */
    @GetMapping("/products")
    public String list(Model model) {
        model.addAttribute("products", repo.findAll());
        return "products/list";   // templates/products/list.html
    }

    /** 商品詳細 */
    @GetMapping("/products/{id}")
    public String detail(@PathVariable Long id, Model model) {
        model.addAttribute("product", repo.findById(id));
        return "products/detail"; // templates/products/detail.html
    }

    /** 問合せフォーム */
    @GetMapping("/contact")
    public String contact(Model model) {
        model.addAttribute("products", repo.findAll());
        return "products/contact";   // templates/products/list.html
    }
}