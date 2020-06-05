package library.Models;


public class Librarian {
	
	private int ID;
	private String Name;
	private String Password;
	
	
	public Librarian() {
		
	}
	
	public int getID() {
		 return this.ID;
	}
	
	public void setID(int id) {
		this.ID = id;
	}
	
	public String getName() {
		 return this.Name;
	}
	
	public void setName(String name) {
		this.Name= name;
	}
	
	public String getPassword() {
		 return this.Password;
	}
	
	public void setPassword(String password) {
		this.Password= password;
	}

}
