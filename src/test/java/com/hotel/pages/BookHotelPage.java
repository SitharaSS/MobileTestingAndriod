package com.hotel.pages;

import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.hotel.base.BaseClass;


/**
 * @author Sithara
 * @see Thius class is used to perform the BookHotel function
 * @since  30-06-2023
 */
    public class BookHotelPage extends BaseClass{
	public static String generatedId;
	 
	public BookHotelPage() {
		PageFactory.initElements(driver,this);
	}	
	
//	    @FindBy(xpath="")
//	    private WebElement selectHotelSuccessMsg;
	//    @FindBy(xpath="//h2[contains(text(),'Book Hotel')]")
	//    private WebElement bookHotelMsg;
	    
	    @FindBy(xpath="")
	    private WebElement expBookHotelSuccessMsg;
	    
		@FindBy(xpath="(//*[@resource-id='book_hotel_booking_for'])[2]")
		private List<WebElement> rdoBtnMySlf;
		
		@FindBy(xpath="//*[@resource-id='book_hotel_salutation']")	
		private WebElement ddnSelectSalutation;
		
		@FindBy(xpath="//*[@resource-id='book_hotel_first_name']")	
		private List<WebElement> textFirstName;
		
		@FindBy(xpath="//*[@resource-id='book_hotel_last_name']")
		private List<WebElement> textLastName;
		
		@FindBy(xpath="//*[@resource-id='book_hotel_mobile_no']")
		private List<WebElement> txtmblNo;
		
		@FindBy(xpath="//*[@resource-id='book_hotel_email']")	
		private List<WebElement> textEmail;
		
		@FindBy(xpath="//*[@resource-id='book_hotel_enter_gst']")
		private List<WebElement> chkBox;
		
	//	@FindBy(id="gst")
	//	private WebElement btnGst;

		
		@FindBy(xpath="//*[@resource-id='book_hotel_registration']")	
		private WebElement textEnterRegistrationNo;
		
		@FindBy(xpath="//*[@resource-id='book_hotel_company_name']")
		private List<WebElement> textEnterCompanyName;
		
		@FindBy(xpath="//*[@resource-id='book_hotel_company_address']")
		private List<WebElement> textEnterAddress;
		
		@FindBy(xpath="//*[@resource-id='book_hotel_next_button']")
		private WebElement nextBtn;
		
		@FindBy(xpath="(//*[@resource-id='filter_option_early'])[1]")
		private WebElement clickEarlyChkBox;
		
		@FindBy(xpath="(//*[@resource-id='book_hotel_any_other_request'])[2]")
		private WebElement textSpecialRequest;
		
		@FindBy(xpath="//*[@resource-id='book_hotel_next_button']")
		private WebElement btnNext1;
		
		@FindBy(xpath="")
		private WebElement errorMgSelectSalutation ;
		
		@FindBy(xpath="")
		private WebElement errorMsgFirstName;
		
		@FindBy(xpath="")
		private WebElement errorMsgLastName;
		
		@FindBy(xpath="")
		private WebElement errorMsgMblno;
		
		@FindBy(xpath="")
		private WebElement errorMsgEmail;
		
	//	@FindBy(id="invalid-registration")	
	//	private WebElement errorMsgRegistrstionNo;
		
	//	@FindBy(id="invalid-company_name")	
	//	private WebElement errorMsgCompanyName;
		

	//	@FindBy(id="invalid-company_address")	
	//	private WebElement errorCompanyAddress;
		
//		@FindBy(xpath="//div[@class='credit-card pm']")
//		private WebElement clickPaymentOption;
		
		//div//h5[text() ='Credit/Debit/ATM Card']
		@FindBy(xpath="//*[@bounds='[301,1750][1197,1939]']")
		private WebElement clickPaymentOption;
		
		@FindBy(xpath="//*[@resource-id='payment_type']")
		private WebElement ddnSelectCardType;
		
		@FindBy(xpath="//*[@resource-id='card_type']")
		private List<WebElement> ddnSelectCard;
//		//div[@class='row']//child::div[@class='inout-control col-md-4 checkbox-upi-input']//descendant::select[@id = 'payment_type']
		
//		@FindBy(xpath="//div[@class='row']//child::div[@class='inout-control col-md-4 checkbox-upi-input']//descendant::select[@id = 'payment_type']")
//		private WebElement ddnSelectCard;
		
		
		@FindBy(xpath="//*[@resource-id='card_no']")
		private List<WebElement> txtCardNumber;
		
		@FindBy(xpath="//*[@resource-id='card_name']")
		private WebElement textNameOnCard;
		
		@FindBy(xpath="//*[@resource-id='card_month']")
		private WebElement txtCardMonth;
		
		@FindBy(xpath="//*[@resource-id='card_year']")
		private WebElement txtCardYear;
		
		@FindBy(xpath="//*[@resource-id='cvv']")
		private WebElement txtCardCVV;
		
		@FindBy(xpath="//*[@resource-id='submitBtn']")
		private List<WebElement> btnSubmit;
		
		@FindBy(xpath="")
		private WebElement bookHotelGeneratedId;
		
		@FindBy(xpath="//*[@resource-id='book_hotel_text']")
		private WebElement bookHotelSuccessMsg;
		
		public static String getGeneratedId() {
			return generatedId;
		}
		public WebElement getExpBookHotelSuccessMsg() {
			return expBookHotelSuccessMsg;
		}
		public WebElement getBookHotelSuccessMsg() {
			return bookHotelSuccessMsg;
		}

		@FindBy(xpath="")
		private WebElement errorMsgMyself ;
		
//		public WebElement getSelectHotelSuccessMsg() {
//			return selectHotelSuccessMsg;
//		}

		public WebElement getErrorMsgMyself() {
			return errorMsgMyself;
		}
	//	public WebElement getBookHotelMsg() {
	//		return bookHotelMsg;
	//	}
        public WebElement getexpBookHotelSuccessMsg() {
			return expBookHotelSuccessMsg;
		}
        public List<WebElement> getRdoBtnMySlf() {
			return rdoBtnMySlf;
		}
        public WebElement getDdnSelectSalutation() {
			return ddnSelectSalutation;
		}

        public List<WebElement> getTextFirstName() {
			return textFirstName;
		}
        public List<WebElement> getTextLastName() {
			return textLastName;
		}

        public List<WebElement> getTxtmblNo() {
			return txtmblNo;
		}
        public List<WebElement> getTextEmail() {
			return textEmail;
		}
        public List<WebElement> getChkBox() {
			return chkBox;
		}


	//	public WebElement getBtnGst() {
//			return btnGst;
	//	}


		public WebElement getTextEnterRegistrationNo() {
			return textEnterRegistrationNo;
		}


		public List<WebElement> getTextEnterCompanyName() {
			return textEnterCompanyName;
		}


		public List<WebElement> getTextEnterAddress() {
			return textEnterAddress;
		}


		public WebElement getNextBtn() {
			return nextBtn;
		}


		public WebElement getClickEarlyChkBox() {
			return clickEarlyChkBox;
		}


		public WebElement getTextSpecialRequest() {
			return textSpecialRequest;
		}


		public WebElement getBtnNext1() {
			return btnNext1;
		}


		public WebElement getErrorMgSelectSalutation() {
			return errorMgSelectSalutation;
		}


		public WebElement getErrorMsgFirstName() {
			return errorMsgFirstName;
		}


		public WebElement getErrorMsgLastName() {
			return errorMsgLastName;
		}


		public WebElement getErrorMsgMblno() {
			return errorMsgMblno;
		}


		public WebElement getErrorMsgEmail() {
			return errorMsgEmail;
		}

		public WebElement getClickPaymentOption() {
			return clickPaymentOption;
		}


		public WebElement getDdnSelectCardType() {
			return ddnSelectCardType;
		}


		public List<WebElement> getDdnSelectCard() {
			return ddnSelectCard;
		}


		public List<WebElement> getTxtCardNumber() {
			return txtCardNumber;
		}


		public WebElement getTextNameOnCard() {
			return textNameOnCard;
		}


		public WebElement getTxtCardMonth() {
			return txtCardMonth;
		}


		public WebElement getTxtCardYear() {
			return txtCardYear;
		}


		public WebElement getTxtCardCVV() {
			return txtCardCVV;
		}


		public List<WebElement> getBtnSubmit() {
			return btnSubmit;
		}


		public WebElement getBookHotelGeneratedId() {
			return bookHotelGeneratedId;
		}
		


		public void setBookHotelSuccessMsg(WebElement bookHotelSuccessMsg) {
			this.bookHotelSuccessMsg = bookHotelSuccessMsg;
		}
		
		
		public String bookHotelSuccessMsg() {
			String text = elementGetText(getBookHotelSuccessMsg());
			return text;
		}
		/**
		 * @author Sithara
		 * @see this method is to add Guest details without gst fields
		 * @param salutation should be passed as the argument in String
		 * @param firstname should be passed as the argument in String
		 * @param lastname should be passed as the argument in String
		 * @param mobNo should be passed as the argument in String
		 * @param email should be passed as the argument in String
		 * @throws InterruptedException for handling the InterruptedException
		 * @since 03-07-2023
		 */
		public void addGuestDetails(String salutation, String firstname, String lastname,String mobNo, String email) throws InterruptedException {
			
			scrollDown(getRdoBtnMySlf());
		    elementClick(getRdoBtnMySlf().get(0));
		    
		    elementClick(getDdnSelectSalutation());
		    
		    
		    elementClick(findLocatorByText(salutation));
		    
		    Thread.sleep(3000);
		    scrollDown(getTextFirstName());
		    elementSendKeys(getTextFirstName().get(0),firstname);
		    
		    scrollDown(getTextLastName());
		    elementSendKeys(getTextLastName().get(0),lastname);
		    
		    scrollDown(getTxtmblNo());
		    elementSendKeys(getTxtmblNo().get(0) ,mobNo);
		    
		    scrollDown(getTextEmail());
		    elementSendKeys(getTextEmail().get(0) ,email);
		    
		}
  
		/**
		 * @author Sithara
		 * @see this method used to add data to the Gst fields
		 * @param registrationNo should be passed as the argument in String
		 * @param companyName should be passed as the argument in String
		 * @param companyAddress should be passed as the argument in String
		 * @since 03-07-2023
		 */
		public void addGstDetails(String registrationNo, String companyName, String companyAddress ) {
			
			scrollDown(getChkBox());
			elementClick(getChkBox().get(0));
			
			elementSendKeys(getTextEnterRegistrationNo(),registrationNo);
			
			scrollDown(getTextEnterCompanyName());
			elementSendKeys(getTextEnterCompanyName().get(0),companyName);
			scrollDown(getTextEnterAddress());
			elementSendKeys(getTextEnterAddress().get(0),companyAddress);
		    	
		}
		
		/**
		 * @author Sithara
		 * @see this method used to click the next button below guest details
		 * @since 03-07-2023
		 */
		public void clickNextBtn() {
			elementClick(getNextBtn());
		}
		/**
		 * @author Sithara
		 * @see this method used to add Guest details without Gst
		 * @param salutation should be passed as the argument in String
		 * @param firstname should be passed as the argument in String
		 * @param lastname should be passed as the argument in String
		 * @param mobNo should be passed as the argument in String
		 * @param email should be passed as the argument in String
		 * @throws InterruptedException for handling the InterruptedException
		 * @since 03-07-2023
		 */
		public void addGuestDetailsWithoutGst(String salutation, String firstname, String lastname,String mobNo, String email) throws InterruptedException {
			addGuestDetails(salutation,firstname, lastname, mobNo ,email);
			elementClick(getNextBtn());
		}
		
		/**
		 * @author Sithara
		 * @see this method used to add Guest details with Gst
		 * @param salutation should be passed as the argument in String
		 * @param firstname should be passed as the argument in String
		 * @param lastname should be passed as the argument in String
		 * @param mobNo should be passed as the argument in String
		 * @param email should be passed as the argument in String
		 * @param registrationNo should be passed as the argument in String
		 * @param companyName should be passed as the argument in String
		 * @param companyAddress should be passed as the argument in String
		 * @throws InterruptedException for handling the InterruptedException
		 * @since 03-07-2023
		 */
		public void addGuestDetailsWithGst(String salutation, String firstname, String lastname,String mobNo, String email,String registrationNo, String companyName, String companyAddress) throws InterruptedException {
			addGuestDetails(salutation,firstname, lastname, mobNo ,email);
			addGstDetails(registrationNo, companyName, companyAddress );
			elementClick(getNextBtn());
		}
		
		/**
		 * @author Sithara
		 * @see this method used to add Special Request
		 * @param otherRequest should be passed as the argument in String
		 * @throws InterruptedException for handling the InterruptedException
		 * @since 03-07-2023
		 */
		public void addSpecialRequest(String otherRequest) throws InterruptedException {
			
			elementClick(getClickEarlyChkBox());
			
			elementSendKeys(getTextSpecialRequest(),otherRequest);   
		    Thread.sleep(3000);
		    elementClick(getBtnNext1());
		   
		}
		
		/**
		 * @author Sithara
		 * @see this method used to add Payment Details
		 * @param paymentTypeVal should be passed as the argument in String
		 * @param card should be passed as the argument in String
		 * @param dataTable should be passed as the argument in String
		 * @throws InterruptedException InterruptedException for handling the InterruptedException
		 * @since 03-07-2023
		 */
		public void addPaymentDetails(String paymentTypeVal, String card, io.cucumber.datatable.DataTable dataTable) throws InterruptedException {
			elementClick(getClickPaymentOption());
			
			elementClick(getDdnSelectCardType());
			elementClick(findLocatorByText(paymentTypeVal));
			
			 
			List<Map<String,String>> cardDetails = dataTable.asMaps();
			
	        switch(card)
	           {
	           	case "Debit Card":
					        	   Map<String, String> m = cardDetails.get(0);
					        	   
					        	   scrollDown(getDdnSelectCard());
					   			   elementClick(getDdnSelectCard().get(0));
					   			   elementClick(findLocatorByText(m.get("card")));
					   			   
					   			   scrollDown(getTxtCardNumber());
					   			   elementSendKeys(getTxtCardNumber().get(0),m.get("cardNumber"));
					 		    
						 		   elementSendKeys(getTextNameOnCard(),m.get("nameOnCard"));
						 		    
						 		   elementClick(getTxtCardMonth());
						 		   elementClick(findLocatorByText(m.get("month")));
						 		    
						 		   elementClick(getTxtCardYear());
						 		   elementClick(findLocatorByText(m.get("year")));
						 		    
						 		   elementSendKeys(getTxtCardCVV(),m.get("cvv"));
						 	
						 		   scrollDown(getBtnSubmit());
						 		   elementClick(getBtnSubmit().get(0));
				   			   
						 		   break;
					           
	           	case "Credit Card":
					        	   Map<String, String> m1 = cardDetails.get(1);
					        	   Thread.sleep(3000);
					        	   
					        	   scrollDown(getDdnSelectCard());
					   			   elementClick(getDdnSelectCard().get(0));
					   			   elementClick(findLocatorByText(m1.get("card")));
					   			   
					   			   scrollDown(getTxtCardNumber());
					   			   elementSendKeys(getTxtCardNumber().get(0),m1.get("cardNumber"));
					 		    
						 		   elementSendKeys(getTextNameOnCard(),m1.get("nameOnCard"));
						 		    
						 		   elementClick(getTxtCardMonth());
						 		   elementClick(findLocatorByText(m1.get("month")));
						 		    
						 		   elementClick(getTxtCardYear());
						 		   elementClick(findLocatorByText(m1.get("year")));
						 		    
						 		   elementSendKeys(getTxtCardCVV(),m1.get("cvv"));
						 	
						 		   scrollDown(getBtnSubmit());
						 		   elementClick(getBtnSubmit().get(0));
					       		   break;
       		
	           	default:
	               		break;
       	}
       
     }
}
	
		
		
		
		