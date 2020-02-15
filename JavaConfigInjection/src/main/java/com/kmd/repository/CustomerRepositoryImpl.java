package com.kmd.repository;

import java.util.ArrayList;
import java.util.List;

import com.kmd.model.Customer;

public class CustomerRepositoryImpl implements CustomerRepository{
	
	@Override
	public List<Customer> findAll(){
		List<Customer> customers = new ArrayList<>();
		Customer customer = new Customer();
		customer.setFirstName("John");
		customer.setLastName("Blue");
		
		customers.add(customer);
		return customers;
	}
}
