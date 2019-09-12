package com.ejercicioSoftware.demo;


import org.springframework.data.jpa.repository.JpaRepository;

enum Status {

    IN_PROGRESS,
    COMPLETED,
    CANCELLED;
}
interface OrderRepository extends JpaRepository<Order, Long> {
}