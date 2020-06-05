package library.Login;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import HomeScreen.HomeScreenSteps;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import library.Login.LoginUI.LoginPage;

public class LoginSteps {
	
	LoginPage loginPage;
	

	@Given("^Библиотекарят отваря началната страница$")
	public void isLoginFormPresent() throws Throwable {
		assertNotNull(loginPage);
	}

	@When("^Името е валидно$")
	public void addUserName() throws Throwable {
		loginPage.addUsername("Ivan");
	}

	@When("^Паролата е валидна$")
	public void addPassword() throws Throwable {
		loginPage.addPassword("ivanpasss123");
	}

	@When("^натисне бутона за вход$")
	public void clikLoginFormLoginButton() throws Throwable {
		loginPage.clickLoginButton();
	}

	@Then("^вижда съобщение с текст \" Добре дошли в библиотеката! \"$")
	public void checkLoginMessage(String expectedMessage) throws Throwable {
		assertEquals(expectedMessage, loginPage.getMessage());
	}

}



