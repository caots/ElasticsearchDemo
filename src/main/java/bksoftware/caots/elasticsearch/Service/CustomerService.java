package bksoftware.caots.elasticsearch.Service;

import bksoftware.caots.elasticsearch.Entity.Customer;
import bksoftware.caots.elasticsearch.Repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService {

    @Autowired
    CustomerRepository customerRepository;

    public List<Customer>  findByName(String name){
        return  customerRepository.findByNameLike(name);
    }


}