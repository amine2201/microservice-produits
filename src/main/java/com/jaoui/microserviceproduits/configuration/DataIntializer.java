package com.jaoui.microserviceproduits.configuration;

import com.jaoui.microserviceproduits.dao.ProductRepository;
import com.jaoui.microserviceproduits.model.Product;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DataIntializer {
    @Bean
    public CommandLineRunner commandLineRunner(ProductRepository productDao, ApplicationPropertiesConfiguration appProperties) {
        return args -> {
            System.out.println(" ********* DataIntializer commandLineRunner() ");
            System.out.println(" ********* DataIntializer commandLineRunner() appProperties.getLimitDeProduits() = " + appProperties.getLimitDeProduits());
            //creating new Products
            Product product1 = new Product("Ordinateur portable", "Laptop", "image1", 120D);
            Product product2 = new Product("Aspirateur Robot", "Robot", "image2", 56D);
            Product product3 = new Product("Table de Ping Pong", "Ping Pong Table", "image3", 67D);
            Product product4 = new Product("Chaise de Bureau", "Office Chair", "image4", 89D);
            Product product5 = new Product("Casque de Ski", "Ski Helmet", "image5", 23D);
            //adding them to database
            productDao.save(product1);
            productDao.save(product2);
            productDao.save(product3);
            productDao.save(product4);
            productDao.save(product5);
        };
    }
}
