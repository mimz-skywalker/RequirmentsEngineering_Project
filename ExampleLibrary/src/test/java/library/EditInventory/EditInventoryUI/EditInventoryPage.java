package library.EditInventory.EditInventoryUI;

import library.service.BookService;

public class EditInventoryPage {
	
	private String ISBN;
	private String Title;
	private String Author;
	private double Price;
	private int Quantity;
	private String Message;
	
	public void addISBN(String ISBN) {
		this.ISBN = ISBN;
	}
	
	public void addTitle(String title) {
		this.Title = title;
	}
	
	public void addAuthor(String author) {
		this.Author = Author;
	}
	
	public void addPrice(double price) {
		this.Price = price;
	}
	
	public void addQuantity(int quantity) {
		this.Quantity = quantity;
	}
	
	public void clickAddBookButton() {
		
		this.Message = new BookService().addBook(ISBN, Title, Author, Price, Quantity);
		
	}
	
	public void clickEditQuantityButton() {
		
		this.Message = new BookService().editInventory(Title, Quantity);
	}
	
	public String getMessage() {
		return this.Message;
	}

}
