package library.EditInventory;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import library.EditInventory.EditInventoryUI.EditInventoryPage;

public class EditInventorySteps {
	
	EditInventoryPage inventoryPage = new EditInventoryPage();
	
	@Given("^Отворена е формата за редактиране на наличности$")
	public void isInventoryPagePresent() throws Throwable {
		assertNotNull(inventoryPage);
	}

	@When("^Въведен е валиден уникален ISBN$")
	public void addISBN() throws Throwable {
		inventoryPage.addISBN("1-2-3-4-5");
	}

	@When("^Въведено е заглавие на книгата")
	public void addTitle() throws Throwable {
		inventoryPage.addTitle("Pride and Prejudice");
	}

	@When("^Въведен е автор$")
	public void addAuthor() throws Throwable {
		inventoryPage.addAuthor("Jane Austin");
	}
	
	@When("^Въведен е наличен брой екземпляри$")
	public void addQuantity() throws Throwable {
		inventoryPage.addQuantity(4);
	}
	
	@When("^Въведена е цена$")
	public void addPrice() throws Throwable {
		inventoryPage.addPrice(6.5f);
	}
	


	@Then("^вижда съобщение с текст Извежда се съобщение \"Успешно добавихте ново произведение. \"$")
	public void checkMessage(String expectedMessage) throws Throwable {
		assertEquals(expectedMessage, inventoryPage.getMessage());
	}

}
