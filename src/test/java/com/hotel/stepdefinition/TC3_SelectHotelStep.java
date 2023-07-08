package com.hotel.stepdefinition;

import com.hotel.base.BaseClass;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

/**
 * @author Sithara
 * @see This class is used to perform the functionalities in Select Hotel page of the mobile app
 * @since 05-07-2023
 */
public class TC3_SelectHotelStep extends BaseClass{
	
	/**
	 * @author Sithara
	 * @see This method is used to verify search hotel success message in the mobile app
	 * @param expSuccessMsg should be passed as the argument in String
	 * @since 05-07-2023
	 */
	@Then("User should verify success message after search hotel {string}")
	public void user_should_verify_success_message_after_search_hotel(String expSuccessMsg) {
		String actualMsg = TC1_LoginStep.pom.getSelectHotelPage().searchHotelSuccessMsg();
		TC1_LoginStep.common.verifySuccessMsg(expSuccessMsg,actualMsg );
		
	}
	
	/**
	 * @author Sithara
	 * @see This method is used to select the first hotel and save the hotel name and price of the selected hotel in the mobile app
	 * @since 05-07-2023
	 */
	@When("User should select first hotel name and save hotel name,price")
	public void user_should_select_first_hotel_name_and_save_hotel_name_price() {
		TC1_LoginStep.pom.getSelectHotelPage().selectFirstHotelNameAndSavePrice();
	}
	
	/**
	 * @author Sithara
	 * @see This method is used to confirm the selection of the hotel in the mobile app
	 * @since 05-07-2023
	 */
	@When("User should accept hotel booking alert")
	public void user_should_accept_hotel_booking_alert() {
		TC1_LoginStep.pom.getSelectHotelPage().confirmHotel();
	}
}
