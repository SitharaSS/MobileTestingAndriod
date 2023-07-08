package com.hotel.pages;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.hotel.base.BaseClass;





/**
 * 
 * @author Sithara
 * @see This class is used to perform the select hotel page function
 * @since 30-06-2023
 */
    /**
     * @author Sithara
     * @see This class used to perform Select Hotel page function
     * @since 30-06-2023
     */
    public class SelectHotelPage extends BaseClass{
	
	public static String HotelName;
	
	public static String HotelPrice;
	
	public  SelectHotelPage()  {
	PageFactory.initElements(driver, this);
	}
			@FindBy(xpath="//*[@resource-id='select_hotel_text']")
			private WebElement selectHotelSuccessMsg;
		
			@FindBy(xpath="")	
			private WebElement radPriceLowToHigh;
			
			@FindBy(xpath="//*[@resource-id='hotel_continue_button']")	
			private List<WebElement> btnContinue;
		
			@FindBy(xpath="")	
			private List<WebElement> textSelectAllHotelName;

			@FindBy(xpath="")	
			private WebElement radPriceHighToLow;
			
			@FindBy(xpath="//*[@resource-id='hotel_name']")	
			private List<WebElement> textHotelName;
			
			@FindBy(xpath="//*[@resource-id='hotel_price_with_tax']")	
			private List<WebElement> textHotelPrice;

			@FindBy(xpath="")	
			private List<WebElement> textAllHotelPrice;
			
			@FindBy(xpath="//*[@resource-id='android:id/button2']")
			private WebElement okBtn;
			
			

			public WebElement getSelectHotelSuccessMsg() {
				return selectHotelSuccessMsg;
			}
			
			public static String getHotelName() {
				return HotelName;
			}



			public static String getHotelPrice() {
				return HotelPrice;
			}


			public WebElement getRadPriceLowToHigh() {
				return radPriceLowToHigh;
			}



			public List<WebElement> getBtnContinue() {
				return btnContinue;
			}



			public List<WebElement> getTextSelectAllHotelName() {
				return textSelectAllHotelName;
			}



			public WebElement getRadPriceHighToLow() {
				return radPriceHighToLow;
			}



			public List<WebElement> getTextHotelName() {
				return textHotelName;
			}



			public List<WebElement> getTextHotelPrice() {
				return textHotelPrice;
			}



			public List<WebElement> getTextAllHotelPrice() {
				return textAllHotelPrice;
			}



			public WebElement getOkBtn() {
				return okBtn;
			}



			/**
			 * @author Sithara
		     * @see This method used to select First Hotel Name And Save Price
		     * @since 03-07-2023
			 */
			public void selectFirstHotelNameAndSavePrice() {
				 scrollDown(getTextHotelName());
				 HotelName =  (getTextHotelName().get(0)).getText();
				 scrollDown(getTextHotelPrice());
			     HotelPrice = (getTextHotelPrice().get(0)).getText();
			     scrollDown(getBtnContinue());
			     elementClick(getBtnContinue().get(0));
			     
			}
			/**
			 * @author Sithara
		     * @see This method used to confirm booking
		     * @since 03-07-2023
			 */
			public void confirmHotel() {
				elementClick(getOkBtn());
			}
			
			public String searchHotelSuccessMsg() {
				visibilityOfElement(getSelectHotelSuccessMsg());
				String text = elementGetText(getSelectHotelSuccessMsg());
				return text;
			}
			
 }
