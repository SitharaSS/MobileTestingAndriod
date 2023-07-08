package com.hotel.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.hotel.base.BaseClass;




/**
 * 
 * @author Sithara
 * @see This is used to capture locators of Booking Confirm page and following POM design pattern
 * @since 30/06/2023
 */
public class BookingConfirmPage  extends BaseClass{
	
	public static String bookedhotelname;
	public static String orderId;
	
	public BookingConfirmPage() {
		PageFactory.initElements(driver, this);
	}
    @FindBy(xpath="//*[@text='#CRMSZ69943 Booking is Confirmed']")
    private WebElement orderIdBookingConfirmationMsg;
    
    
	@FindBy(xpath = "")
	private WebElement textOrderId;

	@FindBy(xpath = "")
	private WebElement textBookingconfirmation;

	@FindBy(xpath = "//*[@text='Hotel Royal Orchid Resort & Convention Centre is booked!']")
	private WebElement textHotelName;

	@FindBy(xpath = "")
	private WebElement btnMyBooking;
    
	public WebElement getOrderIdBookingConfirmationMsg() {
		return orderIdBookingConfirmationMsg;
	}
	
	public WebElement getTextOrderId() {
		return textOrderId;
	}

	public WebElement getTextBookingconfirmation() {
		return textBookingconfirmation;
	}

	public WebElement getTextHotelName() {
		return textHotelName;
	}

	public WebElement getBtnMyBooking() {
		return btnMyBooking;
	}

	/**
	 * @author Sithara
	 * @see This method is used to save generated order id and get booking success
	 *      message
	 * @return Which will return actBookingSuccessMsg as a String
	 * @since 03-07-2023
	 */

	public String bookHotelSuccessMsg() {
		String textmsg = elementGetText(getOrderIdBookingConfirmationMsg());
		String[] split = textmsg.split(" ");
		orderId = split[0];
		String actBookingSuccessMsg = split[1];
		return actBookingSuccessMsg;
	}
	
	/**
	 * @author Sithara
	 * @see This method is used to save generated order id and get booking success
	 *      message
	 * @param expMsg should be passed AS the argument in String 
	 * @since 03-07-2023
	 */
	public void verifyBookHotelSuccessMsg(String expMsg) {
		if(bookHotelSuccessMsg().contains(expMsg)) {
			System.out.println("BookHotelSuccessMsg is correct");

	}
	
	}

	
	
	
}
