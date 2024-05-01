package com.rajlee.api.eazybankbackendapplication.repositories;

import com.rajlee.api.eazybankbackendapplication.model.customer;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CustomerRepository extends CrudRepository<customer,Long> {
     List<customer> findByEmail(String email) ;
}
