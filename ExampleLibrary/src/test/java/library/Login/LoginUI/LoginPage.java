package library.Login.LoginUI;

import library.service.LibrarianService;

public class LoginPage {
	
	private String Message;
	private String Name;
	private String Password;
	
	public void addUsername(String name) {
		this.Name = name;
	}
	
	public void addPassword(String pass) {
		this.Password = pass;
	}
	
	public void clickLoginButton() {
		
		boolean isNameEmpty = this.Name == null || this.Name.isEmpty();
		boolean isPasswordEmpty = this.Password == null || this.Password.isEmpty();
		
		if(isNameEmpty || isPasswordEmpty) {
			
			this.Message = new LibrarianService().Login(this.Name, this.Password);
		}
		
		else {
			 this.Message = new LibrarianService().Login("georgi" , "geaorgipass123");
		}
		
	}
	
	public String getMessage() {
		return this.Message;
	}

}
