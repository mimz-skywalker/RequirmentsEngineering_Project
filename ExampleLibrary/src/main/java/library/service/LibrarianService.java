package library.service;

import java.util.ArrayList;
import java.util.List;

import library.Models.Librarian;

public class LibrarianService {
	
	private List<Librarian> librarians = new ArrayList<Librarian> ();
	
	public LibrarianService() {
		
		Librarian ivan = new Librarian();
		ivan.setID(1);
		ivan.setName("Ivan");
		ivan.setPassword("ivanpass123");
		
		Librarian georgi = new Librarian();
		georgi.setID(2);
		georgi.setName("Georgi");
		georgi.setPassword("georgipass123");
		
		this.librarians.add(ivan);
		this.librarians.add(georgi);
		
		
	}
	
	public String Login(String name, String pass) {


		// java 7
		boolean userLogin = false;
		
		for (Librarian l : this.librarians) {
			if (l.getName().equals(name) 
					&& l.getPassword().equals(pass)) {
				userLogin = true;
				break;
			}
		}

		return userLogin ? "Успешно влизане в системата" : "Грешни данни!";
	}

}
