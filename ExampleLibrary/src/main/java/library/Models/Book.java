package library.Models;

public class Book {
	
	private int ID;
	private String ISBN;
	private String Title;
	private String Author;
	private double Price;
	private int Quantity;
	
	
	public Book(){
		
	}
	
	public int getID(){
		return this.ID;
	}
	
	public void setID(int id) {
		this.ID = id;
	}
	
	public String getISBN() {
		return this.ISBN;
	}
	
	public void setISBN(String ISBN) {
		this.ISBN = ISBN;
	}
	
	public String getTitle() {
		return this.Title;
	}
	
	public void setTitle(String title) {
		this.Title = title;
	}
	
	public String getAuthor() {
		return this.Author;
	}
	
	public void setAuthor(String author) {
		this.Author=author;
	}
	
	public void setPrice(double price) {
		this.Price = price;
	}
	
	public double getPrice() {
		return this.Price;
	}
	
	public int getQuantity() {
		return this.Quantity;
	}
	
	public void setQuantity(int quantity) {
		this.Quantity=quantity;
	}

}
