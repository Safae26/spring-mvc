package net.safae.springmvc.web;

import jakarta.servlet.http.HttpSession;
import jakarta.validation.Valid;
import net.safae.springmvc.entities.Product;
import net.safae.springmvc.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class ProductController {
     @Autowired
     private ProductRepository productRepository;

    @GetMapping("/user/index")
    @PreAuthorize("hasRole='USER'")
    public String index(Model model) {
        List<Product> products = productRepository.findAll();
        model.addAttribute("productsList", products);
        return "products";
    }

    @GetMapping("/")
    public String home() {
        return "redirect:/user/index";
    }
    // Pour 'Delete', il ne faut jamais utiliser GET, c'est une faille de sécurité
    @PreAuthorize("hasRole='ADMIN'")
    @PostMapping("/admin/delete")
    public String delete(@RequestParam(name="id") Long id) {
        productRepository.deleteById(id);
        return "redirect:/user/index";
    }

    @GetMapping("/admin/newProduct")
    @PreAuthorize("hasRole='ADMIN'")
    public String newProduct(Model model) {
        model.addAttribute("product", new Product());
        return "new-product";
    }

    @PostMapping("/admin/saveProduct")
    @PreAuthorize("hasRole='ADMIN'")
    public String saveProduct(@Valid Product product, BindingResult bindingResult, Model model) {
        if (bindingResult.hasErrors()) {
            return "new-product";
        }
        productRepository.save(product);
        return "redirect:/user/index";
    }

    @GetMapping("/notAuthorized")
    public String notAuthorized() {
        return "notAuthorized";
    }

    @GetMapping("/login")
    public String login() {
        return "login";
    }

    @GetMapping("/logout")
    public String logout(HttpSession session) {
        session.invalidate();
        return "login";
    }

    // 404 : Page not found
    // 405 : Méthode pas autorisée
}
