package org.example.repository;

import org.example.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer,Integer> {//clas name , primary keye ek eke nama

}
