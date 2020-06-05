package library.Models;

import java.util.Date;

public class Letting {
	
	private int ID;
	private int CustomerID;
	private String BookTitle;
	private Date StartDate;
	private Date ReturnDate; 
	
	public Letting(){
		
	}
	
	public int getID() {
		 return this.ID;
	}
	
	public void setID(int id) {
		this.ID = id;
	}
	
	public int getCustomerID() {
		 return this.CustomerID;
	}
	
	public void setCustomerID(int id) {
		this.CustomerID = id;
	}
	
	public String getBookTitle() {
		 return this.BookTitle;
	}
	
	public void setBookTitle(String  title) {
		this.BookTitle = title;
	}
	
	public Date getStartDate() {
		 return this.StartDate;
	}
	
	public void setStartDate(Date date) {
		this.StartDate = date;
	}
	
	public Date getReturnDate() {
		 return this.ReturnDate;
	}
	
	public void setReturnDate(Date date) {
		this.ReturnDate = date;
	}
	

}
