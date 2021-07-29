package com.cjc.app.tl.main.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.cjc.app.tl.main.model.EnquiryCustomer;



@Service
public interface ServiceInterface {
	
	public void saveData(EnquiryCustomer enq);
	
	public List getData();
	
	public EnquiryCustomer updateData(EnquiryCustomer eqc);
	
	public EnquiryCustomer editData(int id);
	
	public boolean deleteData(int id);
	
	public void deleteEnqCustomer(int id);

	public List<EnquiryCustomer> checkStatus(String status);
	
	
}
