package org.example.controller;
import org.example.dto.CustomerDTO;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("api/v1/customer")
public class CustomerController {
    private List<CustomerDTO> customers = new ArrayList<>();

    @GetMapping(path = "getAll")
    public List<CustomerDTO> getCustomer(){
        return customers;
    }

    @PostMapping(path = "save")
    private CustomerDTO saveCustomer(@RequestBody CustomerDTO customerDTO){
        customers.add(customerDTO);
        return customerDTO;
    }

    @PutMapping(path = "update")
    public CustomerDTO updateCustomer(@RequestBody CustomerDTO customerDTO){
        for (int i = 0;i<customers.size();i++){
            CustomerDTO existingCustomer = customers.get(i);
            if(existingCustomer.getId().equals(customerDTO.getId())){
                existingCustomer.setName(customerDTO.getName());
                existingCustomer.setAddress(customerDTO.getAddress());
                return existingCustomer;
            }
        }
      return customerDTO;
    }

    @DeleteMapping(path = "delete/{id}")
    public boolean deleteCustomer(@PathVariable("id") String id){
        for (int i = 0; i < customers.size();i++){
            CustomerDTO existingCustomer = customers.get(i);
            if(existingCustomer.getId().equals(id)){
                customers.remove(i);
                return true;
            }
        }
        return false;
    }
}
