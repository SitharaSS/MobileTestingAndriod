package com.hotel.stepdefinition;

import com.hotel.base.BaseClass;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

/**
 * @author Sithara
 * @see This class is used to perform the functionalities in Book Hotel page of the mobile app
 * @since 05-07-2023
 */
public class TC4_BookHotelStep extends BaseClass{
	
	/**
	 * @author Sithara
	 * @see This method is used to verify select hotel success message in the mobile app
	 * @param expSuccessMsg should be passed as the argument in String
	 * @since 05-07-2023
	 */
	@Then("User should verify success message after select hotel {string}")
	public void user_should_verify_success_message_after_select_hotel(String expSuccessMsg) {
		String actualMsg = TC1_LoginStep.pom.getBookHotelPage().bookHotelSuccessMsg();
		TC1_LoginStep.common.verifySuccessMsg(expSuccessMsg,actualMsg );
	}
	
	
	/**
	 * @author Sithara
	 * @see This method is used to add Guest detail without gst in the mobile app
	 * @param salutation should be passed as the argument in String
	 * @param firstname should be passed as the argument in String
	 * @param lastname should be passed as the argument in String
	 * @param mobNo should be passed as the argument in String
	 * @param email should be passed as the argument in String
	 * @throws InterruptedException this is for handling the InterruptedException
	 * @since 05-07-2023
	 */
	@When("User add the guest details and enter {string},{string},{string},{string} and {string}")
	public void user_add_the_guest_details_and_enter_and(String salutation, String firstname, String lastname, String mobNo, String email) throws InterruptedException {
		TC1_LoginStep.pom.getBookHotelPage().addGuestDetails(salutation, firstname, lastname, mobNo, email);
	}
	
	
	/**
	 * @author Sithara
	 * @see This method is used to add gst details in the mobile app
	 * @param registrationNo should be passed as the argument in String
	 * @param companyName should be passed as the argument in String
	 * @param companyAddress should be passed as the argument in String
	 * @since 05-07-2023
	 */
	@When("User enter GST details {string},{string} and {string}")
	public void user_enter_gst_details_and(String registrationNo, String companyName, String companyAddress) {
		TC1_LoginStep.pom.getBookHotelPage().addGstDetails(registrationNo, companyName, companyAddress);
		TC1_LoginStep.pom.getBookHotelPage().clickNextBtn();
	}
	
	
	/**
	 * @author Sithara
	 * @see This method is used to add special request details in the mobile app
	 * @param otherRequest should be passed as the argument in String
	 * @throws InterruptedException this is for handling the InterruptedException
	 * @since 05-07-2023
	 */
	@When("User add special request and the enter the message {string}")
	public void user_add_special_request_and_the_enter_the_message(String otherRequest) throws InterruptedException {
		TC1_LoginStep.pom.getBookHotelPage().addSpecialRequest(otherRequest);
	}
	
	
	
	
	@When("User proceed with the payment options {string}")
	public void user_proceed_with_the_payment_options(String string, io.cucumber.datatable.DataTable dataTable) {
	   
	}
	
	
	@Then("User should verify booking success message after booking {string} and save the generated order id")
	public void user_should_verify_booking_success_message_after_booking_and_save_the_generated_order_id(String string) {
	    
	}
	
	
	@Then("User should verify whether the same  hotel is booked")
	public void user_should_verify_whether_the_same_hotel_is_booked() {
	    
	}
	
	
	@When("User navigate to My Booking page")
	public void user_navigate_to_my_booking_page() {
	    
	}
}
