package com.hotel.stepdefinition;

import com.hotel.base.BaseClass;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

/**
 * @author Sithara
 * @see This class is used to perform the functionalities in Explore Hotel page of the mobile app
 * @since 05-07-2023
 */
public class TC2_ExploreHotelStep extends BaseClass{
	
	
	/**
	 * @author Sithara
	 * @see This method is used to verify login success message in the mobile app
	 * @param expSuccessMsg should be passed as the argument in String
	 * @since 05-07-2023
	 */
	@Then("User should verify success message after login {string}")
	public void user_should_verify_success_message_after_login(String expSuccessMsg) {
		TC1_LoginStep.common.verifySuccessMsg(expSuccessMsg, TC1_LoginStep.pom.getExploreHotelPage().actLoginSuccessMsg());
	}
	/**
	 * @author Sithara
	 * @see This method is used to search hotel in the mobile app
	 * @param stateName should be passed as the argument in String
	 * @param cityName should be passed as the argument in String
	 * @param roomType should be passed as the argument in String
	 * @param checkInDate should be passed as the argument in String
	 * @param checkOutDate should be passed as the argument in String
	 * @param noOfRooms should be passed as the argument in String
	 * @param noOfAdults should be passed as the argument in String
	 * @param noOfChildren should be passed as the argument in String
	 * @throws InterruptedException is used to handle InterruptedException
	 * @since 05-07-2023
	 * 
	 */
	@When("User search hotels {string},{string},{string},{string},{string},{string},{string} and {string}")
	public void user_search_hotels_and(String stateName, String cityName, String roomType, String checkInDate, String checkOutDate, String noOfRooms, String noOfAdults, String noOfChildren) throws InterruptedException {
		TC1_LoginStep.pom.getExploreHotelPage().exploreHotels( stateName, cityName, roomType, checkInDate, checkOutDate, noOfRooms,  noOfAdults, noOfChildren );
	}
	
}
