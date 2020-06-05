package library.ReportLate;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import library.ReportLate.ReportLateUI.ReportLatePage;

public class ReportLateSteps {
	
	ReportLatePage reportPage;
	
	@Given("^Отворена е формата за създаване на репорт$")
	public void isLoginFormPresent() throws Throwable {
		assertNotNull(reportPage);
	}

	@When("^Въведено е LettingID$")
	public void addLettingID() throws Throwable {
		reportPage.addLettingID(5);
	}

	@When("^Въвеждат се детайли$")
	public void addDetails() throws Throwable {
		reportPage.addDetails("Книгата не е върната на време.");
	}

	@When("^Въвежда се име на човека, създаващ репорта$")
	public void addReportee() throws Throwable {
		reportPage.addReportee("Anna");
	}

	@Then("^вижда съобщение с текст\"Успешно създаден репорт.\"$")
	public void checkMessage(String expectedMessage) throws Throwable {
		assertEquals(expectedMessage, reportPage.getMessage());
	}

}
