package com.rajlee.api.eazybankbackendapplication.repositories;

import java.util.List;

import com.rajlee.api.eazybankbackendapplication.model.Loans;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface LoanRepository extends CrudRepository<Loans, Long> {
	
	List<Loans> findByCustomerIdOrderByStartDtDesc(int customerId);

}
