package com.cjc.app.tl.main.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.cjc.app.tl.main.model.EnquiryCustomer;

@Repository
public interface EnquiryCustomerRepository extends JpaRepository<EnquiryCustomer, Integer> {


	@Query(value = "select * from EnquiryCustomer where status=:status " , nativeQuery = true)
	public EnquiryCustomer findByStatus(String status);
	
}
