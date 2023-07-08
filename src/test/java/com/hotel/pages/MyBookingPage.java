package com.hotel.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.hotel.base.BaseClass;
import com.omrbranch.pagemanager.PageObjectManager;



	/**
	 * @author Sithara
	 * @see The purpose of this class is to capture locators of MyBookings page and following POM design pattern
	 * @since 30-06-2023
	 *
	 */
public class MyBookingPage extends BaseClass{
	
	PageObjectManager pom= new PageObjectManager();
	
	public static String bookedhotelname,bookedhotelprice,bookedhotelorderid;

	public MyBookingPage(){
		PageFactory.initElements(driver, this);
		}

    @FindBy(xpath="//a[@data-testid='username']")
    private WebElement clkWelcome;
	
    @FindBy(xpath="//a[text()='My Account']")
    private WebElement clkMyAccount;
    
    @FindBy(xpath="(//button[text()='Edit'])[1]")
	private WebElement  editBtn;
    
    @FindBy(name="check_in")
	private WebElement  chkInDate;
    
    @FindBy(xpath="//button[text()='Confirm']")
	private WebElement  confirmBtn;
    
    @FindBy(xpath="//li[text()='Booking updated successfully']")
	private WebElement  txtBookingSuccessMessage;
    
	@FindBy(id="search")
	private WebElement txtSearchBooking;
	
	@FindBy(id = "bookings")
	private WebElement txtBookingsUpt;
	
	@FindBy(xpath="(//div[@class='room-code'])")
	private WebElement txtOrderId;
	
	@FindBy(xpath=("div[@class='col-md-7 mobile-space-none']/a/h5[1]"))
	private WebElement  txtHotelName;
	
	@FindBy(xpath="(//strong[@class='total-prize'])[1]")
	private WebElement txtHotelPrize;
	
	@FindBy(xpath="(//a[text()='Cancel'])[1]")
	private WebElement  cancelBtn;
	
	@FindBy(xpath="(//li[@class='alertMsg']")
	private WebElement  txtcancelAlert;
	
	@FindBy(xpath="(//li[text()='Your booking cancelled successfully']")
	private WebElement  txtCancelledSuccessMessage;

	
	
	
	
	
	public PageObjectManager getPom() {
		return pom;
	}


	public static String getBookedhotelname() {
		return bookedhotelname;
	}


	public static String getBookekhotelprice() {
		return bookedhotelprice;
	}


	public static String getBookedhotelorderid() {
		return bookedhotelorderid;
	}


	public WebElement getClkWelcome() {
		return clkWelcome;
	}


	public WebElement getClkMyAccount() {
		return clkMyAccount;
	}


	public WebElement getEditBtn() {
		return editBtn;
	}


	public WebElement getChkInDate() {
		return chkInDate;
	}


	public WebElement getConfirmBtn() {
		return confirmBtn;
	}


	public WebElement getTxtBookingSuccessMessage() {
		return txtBookingSuccessMessage;
	}


	public WebElement getTxtSearchBooking() {
		return txtSearchBooking;
	}


	public WebElement getTxtBookingsUpt() {
		return txtBookingsUpt;
	}


	public WebElement getTxtOrderId() {
		return txtOrderId;
	}


	public WebElement getTxtHotelName() {
		return txtHotelName;
	}


	public WebElement getTxtHotelPrize() {
		return txtHotelPrize;
	}


	public WebElement getCancelBtn() {
		return cancelBtn;
	}


	public WebElement getTxtcancelAlert() {
		return txtcancelAlert;
	}


	public WebElement getTxtCancelledSuccessMessage() {
		return txtCancelledSuccessMessage;
	}
	
	public String getConfirmMsg() {
		String confirmMsg= elementGetText(getTxtBookingSuccessMessage());
		return confirmMsg;
		
	}
	/**
	 * @author Sithara
	 * @seeThis method is used to navigate my booking
	 * @param newChkInDate
	 * @since 14-05-2023
	 */
	public void navigateToMyBooking() {

		elementClick(getClkWelcome());
		elementClick(getClkMyAccount());
	//	elementClick(getConfirmBtn());
	}
	
	
	/**
	 * @author Sithara
	 * @see This method is used to get booking pagesuccess message
	 * return It will return String
	 * @since 14-05-2023
	 */
	
	public String txtSearchBooking() {

		String actBookingUptPageSuccessMsg = elementGetText(getTxtBookingsUpt());
		String booking=actBookingUptPageSuccessMsg.substring(0, 8);
		return booking;

	}
	/**
	 * @author Sithara
	 * @see This method is used to search for generated orderid
	 * @since 03-07-2023
	 */
	public void searchForGeneratedOrderId() {
    String generatedId = pom.getBookHotelPage().generatedId;
    String substring = generatedId.replace("#", "");
    System.out.println(substring);
    elementSendKeys(getTxtSearchBooking(), substring);
	}
	/**
	 * 
	 * @author Sithara
	 * @param newChkInDate the new check in date of the user
	 * @see This method is used to edit the date 
	 * @since 03-07-2023
	 */
	public void editAndChangeCheckInDate(String newChkInDate) {
		elementClick(getEditBtn());
		elementSendKeysJs(getChkInDate(),newChkInDate);
		elementClick(getConfirmBtn());
	}
	/**
	 * @author Sithara
	 * @see This method is used to get the actual booking successMessage
	 * @return it returns the value
	 * @since 03-07-2023 
	 */
	public String bookingPageSuccessMsg() {
		String actBookingSuccessMsg = elementGetText(getTxtBookingsUpt());
		return actBookingSuccessMsg;
     
	}
	/**
	 * @author Sithara
	 * @return it returns the actual booking message
	 * @see This method is used to get booking success message
	 * @since 03-07-2023
	 */
	
	public boolean bookingSuccessMsg(String actBookingSuccessMsg) {
		
		boolean equalsIgnoreCase = getConfirmMsg().equalsIgnoreCase(actBookingSuccessMsg);
		return equalsIgnoreCase;
		
		}
	/**
	 * @author Sithara
	 * @see This method is used to success message
	 * @return It will return String
	 * @since 13-05-2023
	 */
	public String bookingCancelSuccessMsg() {

		String actBookingCancelMsg = elementGetText(getTxtCancelledSuccessMessage());
		return actBookingCancelMsg;
		}
	/**
	 * @author Sithara
	 * @see This method is used to verify hotel name
	 * @return Which will return verifyHotelName as a boolean
	 * @since 03-07-2023
	 */
      public String bookedHotelName() {

		String bookedHotelName = elementGetText(getTxtHotelName());
		return bookedHotelName;
		
	  }
      /**
       * @author Sithara
	   * @see This method is used to verify the hotel name  
       * @return it returns the hotel name
       * @since 03-07-2023
       */
      public boolean verifyHotelName() {
    	 // String verifyHotelName = elementGetText(getTxtHotelName());
    	boolean verifyHotelName = bookedHotelName().equals(SelectHotelPage.HotelName);
		return verifyHotelName;

	  }
      /**
       * @author Sithara
	   * @see This method is used to book the hotel
       * @return it returns the replace all
       * @since 03-07-2023
       */
      public String bookedHotelPrize() {
    	String bookedHotelPrize= elementGetText(getTxtHotelPrize());
    	String replaceAll = bookedHotelPrize.replace("Rs","$");
		return replaceAll;
	
      }
      /**
  	 * @author Sithara
  	 * @see This method is used to verify hotel price
  	 * @return Which will return verifyHotelPrice as a boolean
  	 * @since 03-07-2023
  	 */
  	
  	public boolean verifyHotelPrize() {

  		//String bookedHotelPrice = elementGetText(getTxtHotelPrize());
      //bookedHotelPrice.equals(SelectHotelPage.HotelPrice);
  		boolean verifyHotelPrize = bookedHotelPrize().equals(SelectHotelPage.HotelPrice);
		return verifyHotelPrize;
  		
  	}
  	/**
  	 * @author Sithara
  	 * @return it returns the order Id
  	 * @see this method is used to get booked order Id
  	 * @since 03-07-2023
  	 */
  	
  	public String OrderId() {
  		String bookhotelorderid = elementGetText(getTxtOrderId()) ;
		return bookhotelorderid;
  	}
  	
  
  	/**
	 * @author Sithara
	 * @see This method is used to verify orderid
	 * @return Which will return verifyOrderId as a boolean
	 * @since 03-07-2023
	 */
	public boolean verifyOrderId() {

	//	String bookedOrderid = elementGetText(getTxtOrderId());
		// OrderId.equals(BookingConfirmPage.orderId);
	boolean verifyOrderId = OrderId().equals(BookingConfirmPage.orderId);
	return verifyOrderId;
	}
	
	
	/**
	 * @author Sithara
	 * @see This method is used to cancel orderid
	 * @since 03-07-2023
	 */
	public void cancelOrderId() {

		elementClick(getCancelBtn());
	}
	
	/**
	 * @author Sithara
	 * @see This method is used to search for Existing orderid
	 * @since 03-07-2023
	 */
	
	public String searchForExisitingOrderId(String existOrderId) {

		//elementSendKeys(getTxtSearchBooking(), existOrderId);
         String a = elementGetText(getTxtOrderId());
		return a;
	}
	
	
	

}
	
	
