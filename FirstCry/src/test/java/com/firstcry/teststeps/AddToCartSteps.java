package com.firstcry.teststeps;

import static org.testng.Assert.assertTrue;

import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AddToCartSteps extends Driver{
	
	@Given("a user is on the landing page of firstcry")
	public void a_user_is_on_the_landing_page_of_firstcry() {
		assertTrue(driver.getTitle().equals("Baby Products Online India: Newborn Baby Products & Kids Online Shopping at FirstCry.com"));
	}
	@When("he type {string} and select the first option from the auto-complete box")
	public void he_type_and_select_the_first_option_from_the_auto_complete_box(String string) throws InterruptedException {

		addToCartPage.clicksearchIcon();
		addToCartPage.searchItem("Computer Accessories");	
	}
	@When("he click {string} button")
	public void he_click_button(String string) {
		addToCartPage.clickAddToCartBtn();
	}
	@Then("he must see the text messsage {double} {string} is displayed")
	public void he_must_see_the_text_messsage_is_displayed(Double double1, String string) {
		String expectedText = "Portronics POR-704 Portable Laptop Stand with Cooling Fan - Grey";
	    String actualText = addToCartPage.getText();
	    Assert.assertEquals(actualText, expectedText);
	}
}
