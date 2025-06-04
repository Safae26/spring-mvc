package net.safae.springmvc.repositories;

import net.safae.springmvc.entities.Product;
import org.springframework.data.domain.*;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
    Page<Product> findByNameContains(String keyword, Pageable pageable);
}
