package com.example.o14_spring_boot.controller;

import com.example.o14_spring_boot.dto.CustomerDTO;
import com.example.o14_spring_boot.entity.Customer;
import com.example.o14_spring_boot.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/customer")
public class CustomerController {
    //property injection
    @Autowired
    private CustomerService customerService;

    @GetMapping("get")
    public String getCustomer() {
        return "Hellow World";
    }

    @PostMapping("save")
    public boolean saveCustomer(@RequestBody CustomerDTO customerDTO) {
        boolean res = customerService.addCustomer(customerDTO);
        return res;

    }

    @GetMapping("getAll")
    public List<Customer> getAllCustomers() {

        List<Customer> list = customerService.getAllCustomer();

        System.out.println(list);

        return list;

    }

    @DeleteMapping("delete")
    public boolean deleteID(Integer id) {
        customerService.deleteCustomer(id);

        return true;
    }

    @PutMapping("update")
    public boolean

}

