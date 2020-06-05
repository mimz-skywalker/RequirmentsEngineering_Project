package library.AddCustomer.UI;

import java.util.ArrayList;

import library.Models.Letting;
import library.service.CustomerService;

public class AddCustomerPage {
	
	
	private String Name;
	private String Password;
	private String Message;
	
	public void enterName(String name) {
		this.Name = name;
	}
	
	public void enterPassword(String pass) {
		this.Password = pass;
	}
	
	public void clickCreateCustomerButton() {
		
		boolean isPassEmpty = Password == null || Password.isEmpty();
		
		if(isPassEmpty) {
			Message = "Моля, въведете парола за новия читател.";
		}
		else {
			this.Message = new CustomerService().addCustomer(Name, Password);
		}
	}
	
	public String getMessage() {
		return this.Message;
	}
	

}
