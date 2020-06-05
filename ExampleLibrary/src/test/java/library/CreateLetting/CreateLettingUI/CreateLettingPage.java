package library.CreateLetting.CreateLettingUI;

import java.util.Date;

import library.service.LettingService;

public class CreateLettingPage {
	
	private int CustomerID;
	private String BookTitle;
	private Date StartDate;
	private Date ReturnDate;
	private String Message;
	
	public void enterCustomerID(int ID) {
		this.CustomerID = ID;
	}
	
	public void enterBookTitle(String title) {
		this.BookTitle = title;
	}
	
	public void enterStartDate(Date date) {
		this.StartDate = date;
	}
	
	public void enterReturnDate(Date date) {
		this.ReturnDate = date;
	}
	
	public void clickCreateLettingButton() {
		
		boolean isCustomerIDEmpty = this.CustomerID == 0;
		boolean isTitleEmpty = this.BookTitle == null || this.BookTitle.isEmpty();
		boolean isStartDateEmpty = this.StartDate == null;
		boolean isReturnDateEmpty = this.ReturnDate == null;
		
		Date today = new Date();
		today.setHours(0);
		
		boolean isReturnDateInvalid = this.ReturnDate.before(this.StartDate) || this.ReturnDate.before(today);
		
		if(isCustomerIDEmpty) {
			
			this.Message = "Моля, въвдете читател, който взима книгата. ";
		}
		else if(isReturnDateInvalid) {
			
			this.Message = "Моля, въвдете валидна дата за очаквано връщане.";
		}
		else {
			
			this.Message = new LettingService().addLetting(CustomerID, BookTitle, StartDate, ReturnDate);
		}
		
	}
	
	public String getMessage() {
		return this.Message;
	}

}
