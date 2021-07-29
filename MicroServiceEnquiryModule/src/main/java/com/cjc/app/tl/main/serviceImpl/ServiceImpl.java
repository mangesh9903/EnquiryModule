package com.cjc.app.tl.main.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cjc.app.tl.main.model.EnquiryCustomer;
import com.cjc.app.tl.main.repository.EnquiryCustomerRepository;
import com.cjc.app.tl.main.service.ServiceInterface;



@Service
public class ServiceImpl  implements ServiceInterface{

	@Autowired
	EnquiryCustomerRepository repo;
	
	@Override
	public void saveData(EnquiryCustomer enq) {
		
		repo.save(enq);
		
		
	}

	@Override
	public List getData() {
		
		return (List)repo.findAll();
	}

	@Override
	public EnquiryCustomer updateData(EnquiryCustomer eqs) {
		
		      EnquiryCustomer eq=repo.save(eqs);
			return eq;
	}

	@Override
	public EnquiryCustomer editData(int id) {
		
		return repo.findById(id).get();
	}

	@Override
	public boolean deleteData(int id) {
		EnquiryCustomer ec=(EnquiryCustomer)repo.findById(id).get();
			ec.setStatus("Closed");
			repo.save(ec);
		return true;
	}

	@Override
	public void deleteEnqCustomer(int id) {
		
		 
		 repo.deleteById(id);
		    
		  
	}

	@Override
	public List<EnquiryCustomer> checkStatus(String status) {
		
		List<EnquiryCustomer> eq=(List<EnquiryCustomer>) repo.findByStatus(status);
	  return eq;
	}

}
