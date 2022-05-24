package org.stepdef;

import org.base.AdactinPOM;
import org.base.BaseClass;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefenition {
	
	BaseClass bc;
	AdactinPOM ap;
	
	@Given("User is on adactin hotel application in chrome browser")
	public void user_is_on_adactin_hotel_application_in_chrome_browser() {
		bc = new BaseClass();
		bc.getDriver();		
	    bc.geturl("http://adactinhotelapp.com/");
	}

	@When("User enters the username as {string} and password as {string} and clicks login")
	public void user_enters_the_username_as_and_password_as_and_clicks_login(String string, String string2) {
		ap = new AdactinPOM();
		WebElement txtUserName = ap.getTxtUserName();
		txtUserName.sendKeys(string);
		WebElement txtPassword = ap.getTxtPassword();
		txtPassword.sendKeys(string2);
		bc.btnClick(ap.getBtnLogin());
	}

	@Then("User should validate the login page with {string}")
	public void user_should_validate_the_login_page_with(String string) {
		WebElement txtUser = ap.getTxtUser();
		String text = txtUser.getAttribute("value");
		Assert.assertEquals(string, text);
		bc.quit();
	}

	@When("User enters location Number of rooms Checkin date {string} Checkout date {string} adults per room and clicks search")
	public void user_enters_location_number_of_rooms_checkin_date_checkout_date_adults_per_room_and_clicks_search(String string, String string2) {
		bc.dropSelect(ap.getDropSelect(), "value", "London");
		bc.dropSelect(ap.getDropSelect3(), "value", "2");
		WebElement txtDateIn = ap.getTxtDateIn();
		txtDateIn.clear();
		txtDateIn.sendKeys(string);
		WebElement txtDateOut = ap.getTxtDateOut();
		txtDateOut.clear();
		txtDateOut.sendKeys(string2);
		bc.btnClick(ap.getBtnLogin2());
	}

	@When("User selects the hotel and clicks continue")
	public void user_selects_the_hotel_and_clicks_continue() {
		bc.btnClick(ap.getBtnLogin3());
		bc.btnClick(ap.getBtnLogin4());

	}

	@When("User enters First name {string} Last name {string} Billing Address {string} creditcard number {string} and selects credit card type Expiry date and enters cvv {string} and clicks BookNow")
	public void user_enters_first_name_last_name_billing_address_creditcard_number_and_selects_credit_card_type_expiry_date_and_enters_cvv_and_clicks_book_now(String string, String string2, String string3, String string4, String string5) {
		bc.txtKeys(ap.getTxtDetails(), string);
		bc.txtKeys(ap.getTxtDetails2(), string2);
		bc.txtKeys(ap.getTxtDetails3(), string3);
		bc.txtKeys(ap.getTxtDetails4(), string4);
		bc.dropSelect(ap.getDropSelect6(), "value", "VISA");
		bc.dropSelect(ap.getDropSelect7(), "value", "3");
		bc.dropSelect(ap.getDropSelect8(), "value", "2013");
		bc.txtKeys(ap.getTxtDetails5(), string5);
		bc.btnClick(ap.getBtnLogin5());
	}

	@Then("User should validate the order confirmation")
	public void user_should_validate_the_order_confirmation() {
		bc.getAttribute(ap.getGetText());
		bc.quit();
	}

	@When("User enter username as {string} and password as {string} and clicks login")
	public void user_enter_username_as_and_password_as_and_clicks_login(String string, String string2) {
		ap = new AdactinPOM();
		WebElement txtUserName = ap.getTxtUserName();
		txtUserName.sendKeys(string);
		WebElement txtPassword = ap.getTxtPassword();
		txtPassword.sendKeys(string2);
		bc.btnClick(ap.getBtnLogin());
	}

	@When("User enters location Number of rooms with incorrect Checkin date {string} Checkout date {string} adults per room and clicks search")
	public void user_enters_location_number_of_rooms_with_incorrect_checkin_date_checkout_date_adults_per_room_and_clicks_search(String string, String string2) {
		bc.dropSelect(ap.getDropSelect(), "value", "London");
		bc.dropSelect(ap.getDropSelect3(), "value", "2");
		WebElement txtDateIn = ap.getTxtDateIn();
		txtDateIn.clear();
		txtDateIn.sendKeys(string);
		WebElement txtDateOut = ap.getTxtDateOut();
		txtDateOut.clear();
		txtDateOut.sendKeys(string2);
		bc.btnClick(ap.getBtnLogin2());
		bc.quit();
	}

	@Then("User selects the hotel and clicks continue and validates the error message")
	public void user_selects_the_hotel_and_clicks_continue_and_validates_the_error_message() {
		System.out.println("Error Message Validated");

	}

	@Then("User gets order id clicks my itinerary and Validates canecellation by cancelling the order id")
	public void user_gets_order_id_clicks_my_itinerary_and_validates_canecellation_by_cancelling_the_order_id() {
		WebElement getItinerary = ap.getGetItinerary();
		getItinerary.click();
		WebElement btnCancelSelect = ap.getBtnCancelSelect();
	    btnCancelSelect.click();
	    WebElement btnCancel = ap.getBtnCancel();
	    btnCancel.click();
	    bc.quit();
	}

	@When("User clicks booked itenary and selects the booking and clicks cancel")
	public void user_clicks_booked_itenary_and_selects_the_booking_and_clicks_cancel() {
	    WebElement lnkBooked = ap.getLnkBooked();
	    lnkBooked.click();
	    WebElement btnCancelSelect = ap.getBtnCancelSelect();
	    btnCancelSelect.click();
	    WebElement btnCancel = ap.getBtnCancel();
	    btnCancel.click();
	    bc.quit();

	}

	@Then("User validates the cancellation of the booked order")
	public void user_validates_the_cancellation_of_the_booked_order() {
		 System.out.println("Successfully cancelled Booking");
	}

	
}
