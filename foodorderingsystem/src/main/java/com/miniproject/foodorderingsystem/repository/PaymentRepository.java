package com.miniproject.foodorderingsystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.miniproject.foodorderingsystem.model.Payment;

@Repository
public interface PaymentRepository extends JpaRepository<Payment, Integer>

{

}
