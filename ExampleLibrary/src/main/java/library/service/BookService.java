package library.service;

import java.util.ArrayList;
import java.util.List;

import library.Models.Book;

public class BookService {
	
	private List<Book> books = new ArrayList<Book>();
	
	public BookService() {
		
	}
	
	public String addBook(String isbn, String title, String author, double price, int quantity) {
		
		Book book = new Book();
		
		book.setID(this.books.size() + 1);
		book.setISBN(isbn);
		book.setTitle(title);
		book.setAuthor(author);
		book.setPrice(price);
		book.setQuantity(quantity);
		
		this.books.add(book);
		
		return "Успешно добавихте ново произведение. ";
		
	}
	
	public String editInventory(String title, int newQuantity) {
		
		for(Book b : books) {
			
			if(b.getTitle().equals(title)) {
				
				b.setQuantity(newQuantity);
			}
		}
		
		return "Успешно редактиран запис.";
	}

}
