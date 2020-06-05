package library.AddCustomer;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import library.AddCustomer.UI.AddCustomerPage;

public class AddCustomerSteps {
	 
	AddCustomerPage customerPage;
	
	@Given("^Отворена е формата за добавяне на нов читател$")
	public void isCustomerPagePresent() throws Throwable {
		assertNotNull(customerPage);
	}

	@When("^Въведено е име на нов читател$")
	public void addName() throws Throwable {
		customerPage.enterName("Peter");
	}

	@When("^Въведена е парола$")
	public void addPassword() throws Throwable {
		customerPage.enterPassword("PeterPass123");
	}

	@When("^натисне бутона за вход$")
	public void clikCreateButton() throws Throwable {
		customerPage.clickCreateCustomerButton();
	}

	@Then("^Извежда се съобщение \"Успешно създадохте читател.$")
	public void checkMessage(String expectedMessage) throws Throwable {
		assertEquals(expectedMessage, customerPage.getMessage());
	}
	


}
