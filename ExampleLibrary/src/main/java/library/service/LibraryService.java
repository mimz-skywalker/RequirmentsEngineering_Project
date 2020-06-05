package library.service;

import java.util.ArrayList;

import library.Models.Book;
import library.Models.Customer;
import library.Models.Letting;
import library.Models.Librarian;
import library.Models.Library;

public class LibraryService {
	
	public LibraryService(String name, ArrayList<Book> books,
			  						   ArrayList<Librarian> librarians,
			  						   ArrayList<Customer> customers,
			  						   ArrayList<Letting> lettings) {
		
		Library myLibrary = new Library();
		
		myLibrary.setName(name);
		myLibrary.setLibrarians(librarians);
		myLibrary.setCustomers(customers);
		myLibrary.setLettings(lettings);
		
		  
	}

}
