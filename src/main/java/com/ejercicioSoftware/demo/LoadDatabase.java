package com.ejercicioSoftware.demo;

import lombok.extern.slf4j.Slf4j;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@Slf4j
class LoadDatabase {

    @Bean
    CommandLineRunner initDatabase(EmployeeRepository repository, OrderRepository orderRepository) {
        return args -> {
            orderRepository.save(new Order("MacBook Pro", Status.COMPLETED));
            orderRepository.save(new Order("iPhone", Status.IN_PROGRESS));

            orderRepository.findAll().forEach(order -> {
                log.info("Preloaded " + order);
            });
            log.info("Preloading " + repository.save(new Employee("Bilbo ","Baggins",  "burglar")));
            log.info("Preloading " + repository.save(new Employee("Frodo ","Baggins", "thief")));
        };
    }
}