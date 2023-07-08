package com.hotel.pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.hotel.base.BaseClass;


/**
 * 
 * @author Sithara
 * @see This class is used to perform ExploreHotelPage function and we use reusable code using baseclass
 * @since 30-06-2023
 */

public class ExploreHotelPage extends BaseClass {
	
public ExploreHotelPage() {
		
		PageFactory.initElements(driver, this);
	  }	
	
	//@FindBy(xpath="//h3[text()='Hotel Booking']")
	@FindBy(xpath="")
    private WebElement hotelBooking;
	
	@FindBy(xpath="//*[@resource-id='header_welcome']")
    private WebElement LoginSuccessMsg;
	
	@FindBy(xpath="//*[@resource-id='search_select_state']")	
	private WebElement ddnSelectState;
	
	@FindBy(xpath="//*[@resource-id='search_select_city']")
	private WebElement ddnSelectCity;
	
	@FindBy(xpath="//*[@resource-id='search_room_type']")
	private WebElement ddnSelectRoom ;
	
	@FindBy(xpath="//*[@resource-id='search_select_checkin']")
	private WebElement txtCheckInDate;
	
	@FindBy(xpath="//*[@resource-id='android:id/button1']")
	private WebElement confirmDate;
	
	@FindBy(xpath="//*[@resource-id='search_select_checkout']")
	private WebElement txtCheckOutDate;
	
	@FindBy(xpath="//*[@resource-id='search_button']")
	private List<WebElement> btnsearch;
	
	@FindBy(xpath="//*[@resource-id='search_select_no_of_rooms']")
	private WebElement ddnSelectnoofrooms ;
	
	@FindBy(xpath="//*[@resource-id='search_select_no_of_adults']")
	private WebElement ddnSelectnoOfadults ;
	
	@FindBy(xpath="//*[@resource-id='search_no_of_children']")
	private WebElement ddnSelectnoofchildren;
	
	@FindBy(xpath="//*[@resource-id='search_reset_button']")
	private WebElement resetBtn;	
	
	
	@FindBy(xpath="//*[@text='Please select state']")
	private WebElement invalidState;
	
	@FindBy(xpath="//*[@text='Please select city']")	
	private WebElement invalidCity;
	
	@FindBy(xpath="//*[@text='Please select Check-in date']")	
	private WebElement invalidCheckin;
	
	@FindBy(xpath="//*[@text='Please select Check-out date']")	
	private WebElement invalidCheckOut;
	
	@FindBy(xpath="//*[@text='Please select no. of rooms']")	
	private WebElement invalidNoofRooms;
	
	@FindBy(xpath="//*[@text='Please select no. of adults']")
	private WebElement invalidNoofAdults;
	
	@FindBy(xpath="")
	private WebElement frame;
	
//	@FindBy(xpath="//a[@class='icoTwitter mr-2 dropdown-toggle']")
//	private WebElement ddnwelcome;
	
	public WebElement getFrame() {
		return frame;
	}
	public WebElement getHotelBooking() {
		return hotelBooking;
	}

	public WebElement getLoginSuccessMsg() {
		return LoginSuccessMsg;
	}
     public WebElement getDdnSelectState() {
		return ddnSelectState;
	}
   public WebElement getDdnSelectCity() {
		return ddnSelectCity;
	}

	public WebElement getDdnSelectRoom() {
		return ddnSelectRoom;
	}

	public WebElement getTxtCheckInDate() {
		return txtCheckInDate;
	}
	
	public WebElement getConfirmDate() {
		return confirmDate;
	}

	public WebElement getTxtCheckOutDate() {
		return txtCheckOutDate;
	}

	public List<WebElement> getBtnsearch() {
		return btnsearch;
	}
    public WebElement getDdnSelectnoofrooms() {
		return ddnSelectnoofrooms;
	}

	public WebElement getDdnSelectnoOfadults() {
		return ddnSelectnoOfadults;
	}

	

	public WebElement getDdnSelectnoofchildren() {
		return ddnSelectnoofchildren;
	}

	public WebElement getResetBtn() {
		return resetBtn;
	}

	public WebElement getInvalidState() {
		return invalidState;
	}

	

	public WebElement getInvalidCity() {
		return invalidCity;
	}

	
	public WebElement getInvalidCheckin() {
		return invalidCheckin;
	}

	

	public WebElement getInvalidCheckOut() {
		return invalidCheckOut;
	}

	
	public WebElement getInvalidNoofRooms() {
		return invalidNoofRooms;
	}

	

	public WebElement getInvalidNoofAdults() {
		return invalidNoofAdults;
	}
    

	
	/**
	 * @author Sithara
	 * @see This method is used to check the login success message
	 * @since 03-07-2023
	 */
	public String actLoginSuccessMsg() {
		visibilityOfElement(getLoginSuccessMsg());
		String loginMsgString = getLoginSuccessMsg().getText();
	    System.out.println(loginMsgString);
	    return loginMsgString;
//		if(loginMsgString.contains("Welcome")&&loginMsgString.contains("Sithara"))
//		{
//			System.out.println("Login message is correct");
//		}
		
	}
	
	/**
	 * @author Sithara
	 * @see This method is used to explore hotel
	 * @param stateName should be passed as the argument in String
	 * @param cityName should be passed as the argument in String
	 * @param roomType should be passed as the argument in String
	 * @param checkInDate should be passed as the argument in String
	 * @param checkOutDate should be passed as the argument in String
	 * @param noOfRooms should be passed as the argument in String
	 * @param noOfAdults should be passed as the argument in String
	 * @param noOfChildren should be passed as the argument in String
	 * @throws InterruptedException is used to handle the Interrupted Exception
	 * @since 03-07-2023
	 */
	public void exploreHotels(String stateName,String cityName,String roomType,String checkInDate,String checkOutDate,String noOfRooms, String noOfAdults,String noOfChildren ) throws InterruptedException {
		//visibilityOfElement(getDdnSelectState());
		elementClick(getDdnSelectState());
		//waitUsingFluentWait();
		visibilityOfElement(findLocatorByText(stateName));
		//Thread.sleep(3000);
		elementClick(findLocatorByText(stateName));
		
		elementClick(getDdnSelectCity());
		waitUsingFluentWait();
		visibilityOfElement(findLocatorByText(cityName));
		elementClick(findLocatorByText(cityName));
		
		selectRoomType(roomType);
		
		elementClick(getTxtCheckInDate());
		elementClick(getConfirmDate());
		
		elementClick(getTxtCheckOutDate());
		elementClick(getConfirmDate());
		
		elementClick(getDdnSelectnoofrooms());
		elementClick(findLocatorByText(noOfRooms));
		
		elementClick(getDdnSelectnoOfadults());
		elementClick(findLocatorByText(noOfAdults));
		
		elementSendKeys(getDdnSelectnoofchildren(),noOfChildren);
		
		scrollDown(getBtnsearch());
		elementClick(getBtnsearch().get(0));
		
	}
	
	/**
	 * @author Sithara
	 * @see This method is used to select Room Type
	 * @param roomType should be passed as the argument in String
	 * @since 03-07-2023
	 */
	public void selectRoomType(String roomType) {
		String[] split = roomType.split("/");
		for (String eachRoomType : split) {
			elementClick(getDdnSelectRoom());
			elementClick(findLocatorByText(eachRoomType));
			
		}
		
	}
	
}	
	
		
		

		
		
	 


			
		
		
		
	


