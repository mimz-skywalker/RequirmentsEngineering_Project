package Dashboard;

import static org.junit.Assert.assertNotNull;

import cucumber.api.java.en.Given;
import library.AddCustomer.UI.AddCustomerPage;
import library.CreateLetting.CreateLettingUI.CreateLettingPage;
import library.EditInventory.EditInventoryUI.EditInventoryPage;
import library.Login.LoginUI.LoginPage;
import library.ReportLate.ReportLateUI.ReportLatePage;

public class DashboardSteps {
	
	static AddCustomerPage addCustomerPage;
	static CreateLettingPage createLettingPage;
	static EditInventoryPage editInventoryPage;
	static ReportLatePage reportLatePage;
	
	@Given("^Отворена е формата за добавяне на нов читател$")
	public void navigateToCustomerPage() throws Throwable {
		addCustomerPage = new AddCustomerPage();
	}

	public static AddCustomerPage getHomePageIfExists() {
		assertNotNull("Customer Page does not exists!", addCustomerPage);
		return addCustomerPage;
	}
	
	@Given("^Отворена е формата за създаване на запис за отдаване$")
	public void navigateToLettingPage() throws Throwable {
		createLettingPage = new CreateLettingPage();
	}

	public static CreateLettingPage getLettingIfExists() {
		assertNotNull("Letting Page does not exists!", createLettingPage);
		return createLettingPage;
	}
	
	@Given("^Отворена е формата за редактиране на наличности$")
	public void navigateToInventoryPage() throws Throwable {
		editInventoryPage = new EditInventoryPage();
	}

	public static EditInventoryPage getInventoryIfExists() {
		assertNotNull("Inventory Page does not exists!", editInventoryPage);
		return editInventoryPage;
	}
	
	@Given("^Отворена е формата за създаване на репорт$")
	public void navigateToReport() throws Throwable {
		reportLatePage = new ReportLatePage();
	}

	public static ReportLatePage getReportIfExists() {
		assertNotNull("Report Page does not exists!", reportLatePage);
		return reportLatePage;
	}
	
	

}
