package com.demo.ung_dung_quan_ly_khach_hang.repository;

import com.demo.ung_dung_quan_ly_khach_hang.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer , Integer> {
}
