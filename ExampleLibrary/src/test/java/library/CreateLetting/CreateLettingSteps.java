package library.CreateLetting;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.sql.Date;
import java.time.LocalDate;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import library.CreateLetting.CreateLettingUI.CreateLettingPage;

public class CreateLettingSteps {
	
	CreateLettingPage lettingPage;
	
	@Given("^Отворена е формата за създаване на запис за отдаване$")
	public void isLettingpagePresent() throws Throwable {
		assertNotNull(lettingPage);
	}

	@When("^Въведена е книгата, която се отдава$")
	public void addBook() throws Throwable {
		lettingPage.enterBookTitle("IT");
	}

	@When("Въведена е начална дата$")
	public void addStartDate() throws Throwable {
		lettingPage.enterStartDate(null);
	}

	@When("^Въведена е дата за очаквано връщане")
	public void addReturnDate() throws Throwable {
		lettingPage.enterReturnDate(null);
	}

	@Then("^Извежда се съобщение \"Моля, въвдете читател, който взима книгата. $")
	public void checkMessage(String expectedMessage) throws Throwable {
		assertEquals(expectedMessage, lettingPage.getMessage());
	}

}
