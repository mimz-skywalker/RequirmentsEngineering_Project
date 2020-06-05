package library.ReportLate.ReportLateUI;

import library.service.ReportService;

public class ReportLatePage {
	
	private int LettingID;
	private String Reportee;
	private String Details;
	private String Message;
	
	public void addLettingID(int id) {
		this.LettingID = id;
	}
	
	public void addReportee(String reportee) {
		this.Reportee = reportee;
	}
	
	public void addDetails(String details) {
		this.Details = details;
	}
	
	public void clickCreateReportButton() {
		
		boolean isLettingIDInvalid = LettingID == 0;
		
		if(isLettingIDInvalid) {
			
			this.Message = "Моля, посочете активно отдаване. ";
		}
		else {
			
			this.Message = new ReportService().addReport(LettingID, Reportee, Details);
		}
	}
	
	public String getMessage() {
		return this.Message;
	}

}
