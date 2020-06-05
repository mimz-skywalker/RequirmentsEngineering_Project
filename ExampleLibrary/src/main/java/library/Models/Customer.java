package library.Models;

import java.util.ArrayList;

public class Customer {
	
	private int ID;
	private String Name;
	private String Password;
	private ArrayList<Letting> Lettings;
	
	public Customer() {
		
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
	
	public ArrayList<Letting> getLettings(){
		return this.Lettings;
	}
	
	public void setLettings(ArrayList<Letting> lettings) {
		this.Lettings = lettings;
	}
	

}
