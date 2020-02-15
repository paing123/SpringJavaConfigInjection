package com.kmd.service;

import java.util.List;

import com.kmd.model.Customer;
import com.kmd.repository.CustomerRepository;
import com.kmd.repository.CustomerRepositoryImpl;

public class CustomerServiceImpl implements CustomerService {

	private CustomerRepository customerRepo;

	@Override
	public List<Customer> findAll() {
		return customerRepo.findAll();
	}

	public CustomerServiceImpl() {
	}

	public CustomerServiceImpl(CustomerRepository customerRepository) {
		System.out.println("This is constructor injection");
		this.customerRepo = customerRepository;
	}

	public void setCustomerRepo(CustomerRepository customerRepo) {
		System.out.println("This is setter injection");
		this.customerRepo = customerRepo;
	}

}
