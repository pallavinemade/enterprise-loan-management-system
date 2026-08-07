package com.pallavi.loan.repository;

import com.pallavi.loan.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Repository interface for Customer entity.
 * Provides CRUD operations and data access methods for Customer records.
 * Extends JpaRepository to leverage Spring Data JPA functionality.
 */
public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
