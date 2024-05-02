package com.rajlee.api.eazybankbackendapplication.repositories;

import com.rajlee.api.eazybankbackendapplication.model.customer;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CustomerRepository extends CrudRepository<customer, Long> {

    List<customer> findByEmail(String email);
    
}
