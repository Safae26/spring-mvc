package net.safae.springmvc;

import net.safae.springmvc.entities.Product;
import net.safae.springmvc.repositories.ProductRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.context.annotation.Bean;

@SpringBootApplication()
//exclude = { SecurityAutoConfiguration.class }
public class SpringMvcApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringMvcApplication.class, args);
    }

    @Bean
    CommandLineRunner start(ProductRepository repository, ProductRepository productRepository) {
        return args -> {
            productRepository.save(Product.builder().name("Mouse").price(120).quantity(500).build());
            productRepository.save(Product.builder().name("Laptop").price(50).quantity(20000).build());
            productRepository.save(Product.builder().name("Smartphone").price(1000).quantity(9000).build());

            productRepository.findAll().forEach(
                    product -> {
                        System.out.println(product.toString());
                    }
            );
        };
    }
}
