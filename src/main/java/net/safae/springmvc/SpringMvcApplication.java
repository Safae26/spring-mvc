package net.safae.springmvc;

import net.safae.springmvc.entities.Product;
import net.safae.springmvc.repositories.ProductRepository;
import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication()
//exclude = { SecurityAutoConfiguration.class } // Désactivation de la protection par défaut de Spring Security (au début)
public class SpringMvcApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringMvcApplication.class, args);
    }

    @Bean
    CommandLineRunner start(ProductRepository productRepository) {
        return args -> {

            productRepository.save(Product.builder().name("Mouse").price(120).quantity(500).build());
            productRepository.save(Product.builder().name("Laptop").price(5000).quantity(20000).build());
            productRepository.save(Product.builder().name("Smartphone").price(1000).quantity(9000).build());

            // Autres :

            // Computer Hardware
            productRepository.save(Product.builder().name("Wireless Keyboard").price(59.99).quantity(350).build());
            productRepository.save(Product.builder().name("Gaming Mouse").price(89.99).quantity(420).build());
            productRepository.save(Product.builder().name("4K Monitor").price(349.99).quantity(150).build());
            productRepository.save(Product.builder().name("Bluetooth Headphones").price(129.99).quantity(600).build());
            productRepository.save(Product.builder().name("External SSD 1TB").price(119.99).quantity(280).build());

            // Computer Components
            productRepository.save(Product.builder().name("Mechanical Keyboard").price(79.99).quantity(200).build());
            productRepository.save(Product.builder().name("Graphics Card RTX 3080").price(799.99).quantity(50).build());
            productRepository.save(Product.builder().name("32GB RAM Kit").price(149.99).quantity(180).build());
            productRepository.save(Product.builder().name("1TB NVMe SSD").price(99.99).quantity(320).build());
            productRepository.save(Product.builder().name("CPU Cooler").price(49.99).quantity(410).build());

            // Mobile Devices
            productRepository.save(Product.builder().name("Tablet 10.5\" ").price(299.99).quantity(250).build());
            productRepository.save(Product.builder().name("Smart Watch").price(199.99).quantity(380).build());
            productRepository.save(Product.builder().name("Wireless Earbuds").price(79.99).quantity(520).build());
            productRepository.save(Product.builder().name("Phone Case").price(19.99).quantity(1200).build());
            productRepository.save(Product.builder().name("Screen Protector").price(9.99).quantity(2500).build());

            // Networking
            productRepository.save(Product.builder().name("Wi-Fi Router").price(89.99).quantity(190).build());
            productRepository.save(Product.builder().name("Mesh Wi-Fi System").price(249.99).quantity(80).build());
            productRepository.save(Product.builder().name("Ethernet Cable 10ft").price(12.99).quantity(1500).build());
            productRepository.save(Product.builder().name("Network Switch 8-Port").price(59.99).quantity(120).build());
            productRepository.save(Product.builder().name("VPN Router").price(129.99).quantity(95).build());

            // Accessories
            productRepository.save(Product.builder().name("Laptop Stand").price(29.99).quantity(430).build());
            productRepository.save(Product.builder().name("USB-C Hub").price(39.99).quantity(370).build());
            productRepository.save(Product.builder().name("Webcam 1080p").price(69.99).quantity(210).build());
            productRepository.save(Product.builder().name("Wireless Charger").price(34.99).quantity(490).build());
            productRepository.save(Product.builder().name("Monitor Arm").price(89.99).quantity(160).build());

            productRepository.findAll().forEach(
                    product -> System.out.println(product.toString())
            );
        };
    }
}
