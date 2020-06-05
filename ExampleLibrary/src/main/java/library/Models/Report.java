package library.Models;

public class Report {
	
	private int ID;
	private int LettingID;
	private String ReportedBy;
	private String Details;
	
	public Report() {
		
	}
	
	public int getID() {
		return this.ID;
	}
	
	public void setID(int id) {
		this.ID = id;
	}
	
	public int getLettingID() {
		return this.LettingID;
	}
	
	public void setLettingID(int id) {
		this.LettingID = id;
	}
	
	public String getReprotee() {
		return this.ReportedBy;
	}
	
	public void setReportee(String reportee) {
		this.ReportedBy = reportee;
	}
	
	public String getDetails() {
		return this.Details;
	}
	
	public void setDetails(String details) {
		this.Details = details;
	}

}
