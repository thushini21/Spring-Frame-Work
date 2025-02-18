package com.example.o14_spring_boot.service;

import com.example.o14_spring_boot.dto.CustomerDTO;
import com.example.o14_spring_boot.entity.Customer;
import com.example.o14_spring_boot.repository.CustomerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
public class CustomerService {
    @Autowired
    private CustomerRepo customerRepo;
    public boolean addCustomer(CustomerDTO customerDTO){
       Customer customer= (new Customer(
                customerDTO.getId(),
                customerDTO.getName(),
                customerDTO.getAddress()));

        customerRepo.save(customer);
        System.out.println("Service Method"+customerDTO.getName());
        //data save
        return true;
    }
    public List<Customer> getAllCustomer() {
        return customerRepo.findAll();
    }


    public boolean deleteCustomer(Integer id){
        customerRepo.deleteById(id);
        return true;
    }

}
