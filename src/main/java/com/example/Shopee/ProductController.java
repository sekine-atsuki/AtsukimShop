package com.example.Shopee;

import org.springframework.mail.SimpleMailMessage;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.mail.javamail.JavaMailSender;

@Controller
public class ProductController {
    private final ProductRepository repo;
    private final JavaMailSender mailSender;  // ★追加

    public ProductController(ProductRepository repo, JavaMailSender mailSender) { // ★追加
        this.repo = repo;
        this.mailSender = mailSender; // ★追加
    }

    @GetMapping("/products")
    public String list(Model model) {
        model.addAttribute("products", repo.findAll());
        return "products/list";
    }

    @GetMapping("/products/{id}")
    public String detail(@PathVariable Long id, Model model) {
        model.addAttribute("product", repo.findById(id));
        return "products/detail";
    }

    @GetMapping("/contact")
    public String contact(Model model) {
        model.addAttribute("product", repo.findAll());
        return "contact/form";
    }

    @PostMapping("/contact")
    public String sendContact(
            @RequestParam String name,
            @RequestParam String country,
            @RequestParam String email,
            @RequestParam String message
    ) {
        SimpleMailMessage mail = new SimpleMailMessage();
        mail.setTo("your-email@example.com");
        mail.setSubject("New Contact from Website");
        mail.setText(
                "Name: " + name + "\n" +
                        "Country: " + country + "\n" +
                        "Email: " + email + "\n" +
                        "Message:\n" + message
        );
        mailSender.send(mail);
        return "contact/success";
    }
}