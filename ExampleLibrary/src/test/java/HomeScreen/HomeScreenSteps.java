package HomeScreen;

import static org.junit.Assert.assertNotNull;

import cucumber.api.java.en.Given;
import library.Login.LoginUI.LoginPage;

public class HomeScreenSteps {
	
	static LoginPage loginPage;
	
	@Given("^Отворена е формата за добавяне на нов читател$")
	public void navigateToLoginPage() throws Throwable {
	     loginPage = new LoginPage();
	}

	public static LoginPage getLoginPageIfExists() {
		assertNotNull("Login Page does not exists!", loginPage);
		return loginPage;
	}
	
}
