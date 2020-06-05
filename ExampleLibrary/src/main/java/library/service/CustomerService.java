package library.service;

import java.util.ArrayList;
import java.util.List;

import library.Models.Customer;

public class CustomerService {
	
	private List<Customer> customers = new ArrayList<Customer>();
	
	public CustomerService() {
		
	}
	
	public String addCustomer(String Name, String Pass) {
		
		Customer newCustomer = new Customer();
		
		//adding one to the current list size to generate unique ID
		newCustomer.setID(this.customers.size() + 1);
		newCustomer.setName(Name);
		newCustomer.setPassword(Pass);
	
		this.customers.add(newCustomer);
		
		return "Успешно създадохте читател. ";
		
	}

}
