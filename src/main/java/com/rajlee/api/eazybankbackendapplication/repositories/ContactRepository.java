package com.rajlee.api.eazybankbackendapplication.repositories;

import com.rajlee.api.eazybankbackendapplication.model.Contact;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ContactRepository extends CrudRepository<Contact, Long> {
	
	
}
