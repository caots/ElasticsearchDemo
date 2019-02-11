package bksoftware.caots.elasticsearch.Controller;

import bksoftware.caots.elasticsearch.Entity.Customer;
import bksoftware.caots.elasticsearch.Service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("/api/v1/customer")
public class CustomerController {


    @Autowired
    CustomerService customerService;


    @RequestMapping("/{name}")
    public List<Customer> findByname(@PathVariable String name){
        return customerService.findByName(name);
    }
}
