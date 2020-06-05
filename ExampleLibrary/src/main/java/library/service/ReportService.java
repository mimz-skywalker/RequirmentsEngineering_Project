package library.service;

import java.util.ArrayList;
import java.util.List;

import library.Models.Report;

public class ReportService {
	
	private List<Report> reports = new ArrayList<Report>();
	
	public ReportService() {
		
	}
	
	public String addReport(int lettingID, String reportee, String Details) {
		
		Report report = new Report();
		
		report.setID(this.reports.size() + 1);
		report.setLettingID(lettingID);
		report.setReportee(reportee);
		report.setDetails(Details);
		
		this.reports.add(report);
		
		return "Успешно създаден репорт.";
		
	}

}
