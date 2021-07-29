package com.cjc.app.tl.main.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cjc.app.tl.main.model.EnquiryCustomer;
import com.cjc.app.tl.main.service.ServiceInterface;



@RestController
@RequestMapping("/EnquiryCustomer")
@CrossOrigin("*")
public class EnquiryController {
	
	@Autowired
	ServiceInterface si;
	
	@PostMapping("/AddData")
	public String AddInfo(@RequestBody EnquiryCustomer enq)
	{
		si.saveData(enq);
		return "Data Inserted Successfully";
	}

	@GetMapping("/getAllData")
	public List getAllData()
	{
		return (List) si.getData();
	}
	
	@PutMapping("/updateData")
	public EnquiryCustomer updateData(@RequestBody EnquiryCustomer eqc)
	{
		
		return si.updateData(eqc);
	}
	
	
	@GetMapping("/edit/{id}")
	public EnquiryCustomer editData(@PathVariable("id")Integer id)
	{
		return si.editData(id);
	}
	
	@PutMapping("/closeData/{id}")
	public boolean deleteData(@PathVariable("id") Integer id)
	{
		return si.deleteData(id);
		
	}
	
	@DeleteMapping("/deleteEnqCust/{id}")
	public String deleteEnqCust(@PathVariable("id")Integer id)
	{
		
		si.deleteEnqCustomer(id);
		
		return "Enquiry Customer Data Deleted";
	}
	

	
	@GetMapping("/getDataByStatus/{status}")
	public List getData(@PathVariable("status")String status)
	{
		List<EnquiryCustomer> eq=si.getData();
		List<EnquiryCustomer> elist=new ArrayList<EnquiryCustomer>();
		for(EnquiryCustomer e:eq)
		{
			if(e.getStatus().equals(status))
			{
				elist.add(e);
			}
		}
		return elist;
	}
	
	
}
