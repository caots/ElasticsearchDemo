package bksoftware.caots.elasticsearch.Repository;

import bksoftware.caots.elasticsearch.Entity.Customer;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CustomerRepository extends ElasticsearchRepository<Customer,String> {
    List<Customer> findByNameLike(String name);
}
