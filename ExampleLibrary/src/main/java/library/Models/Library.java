package library.Models;

import java.util.*;

public class Library {
	
	private String Name;
	private ArrayList<Book> BooksAvailable;
	private ArrayList<Customer> Customers;
	private ArrayList<Librarian> Librarians;
	private ArrayList<Letting> ActiveLettings;
	
	public Library() {
		
	}
	
	public String getName(){
		return this.Name;
	}
	
	public void setName(String name) {
		this.Name=name;
	}
	
	public ArrayList<Book> getBooksAvailable(){
		return this.BooksAvailable;
	}
	
	public void setBooksAvailable(ArrayList<Book> books) {
		this.BooksAvailable = books;
	}
	
	public ArrayList<Customer> getCustomers(){
		return this.Customers;
	}
	
	public void setCustomers(ArrayList<Customer> customers) {
		this.Customers = customers;
	}
	
	public ArrayList<Librarian> getLibrarians(){
		return this.Librarians;
	}
	
	public void setLibrarians(ArrayList<Librarian> librarians) {
		this.Librarians = librarians;
	}
	
	public ArrayList<Letting> getArrayList(){
		return this.ActiveLettings;
	}
	
	public void setLettings(ArrayList<Letting> lettings) {
		this.ActiveLettings = lettings;
	}
}
