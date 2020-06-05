package library.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import library.Models.Letting;

public class LettingService {
	
	private List<Letting> lettings = new ArrayList<Letting>();
	
	public LettingService() {
		
	}
	
	public String addLetting(int customerID, String book, Date start, Date returnDate) {
		
		Letting letting = new Letting();
		letting.setID(this.lettings.size() + 1);
		letting.setCustomerID(customerID);
		letting.setBookTitle(book);
		letting.setStartDate(start);
		letting.setReturnDate(returnDate);
		
		this.lettings.add(letting);
		
		return "Книгата е успешно отдадена под наем. ";
		
		
	}

}
