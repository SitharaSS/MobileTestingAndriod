package com.omrbranch.pagemanager;

import com.hotel.pages.BookHotelPage;
import com.hotel.pages.BookingConfirmPage;
import com.hotel.pages.ExploreHotelPage;
import com.hotel.pages.LoginPage;
import com.hotel.pages.MyBookingPage;
import com.hotel.pages.SelectHotelPage;

/**
 * @author Sithara
 * @see This class is used as the object repository
 * @since 30-06-2023
 */
public class PageObjectManager {
	
	private LoginPage loginpage;
	private ExploreHotelPage exploreHotelPage;
	private BookHotelPage bookHotelPage;
	private SelectHotelPage selectHotelPage;
	private BookingConfirmPage bookingConfirmPage;
	private MyBookingPage myBookingPage;
	
	/**
	 * @author Sithara
	 * @see This method is used to get object for Loginpage class
	 * @return this method returns object for Loginpage class
	 * @since 30-06-2023
	 */
	public LoginPage getLoginpage() {
		return (loginpage==null)? loginpage=new LoginPage():loginpage;
	}
	/**
	 * @author Sithara
	 * @see This method is used to get object for ExploreHotelPage class
	 * @return this method returns object for ExploreHotelPage class
	 * @since 30-06-2023
	 */
	public ExploreHotelPage getExploreHotelPage() {
		return( exploreHotelPage ==null)?exploreHotelPage= new ExploreHotelPage():exploreHotelPage;
	}
	/**
	 * @author Sithara
	 * @see This method is used to get object for SelectHotelPage class
	 * @return this method returns object for SelectHotelPage class
	 * @since 30-06-2023
	 */
	public SelectHotelPage getSelectHotelPage() {
		return(selectHotelPage==null)? selectHotelPage= new SelectHotelPage(): selectHotelPage;
	}
	/**
	 * @author Sithara
	 * @see This method is used to get object for BookHotelPage class
	 * @return this method returns object for BookHotelPage class
	 * @since 30-06-2023
	 */
	public BookHotelPage getBookHotelPage() {
		return (bookHotelPage ==null)?bookHotelPage=new BookHotelPage():bookHotelPage;
	}
	/**
	 * @author Sithara
	 * @see This method is used to get object for BookingConfirmPage class
	 * @return this method returns object for BookingConfirmPage class
	 * @since 30-06-2023
	 */
	public BookingConfirmPage getBookingConfirmPage() {
		return (bookingConfirmPage==null)? bookingConfirmPage= new BookingConfirmPage():bookingConfirmPage;
	}
	/**
	 * @author Sithara
	 * @see This method is used to get object for MyBookingPage class
	 * @return this method returns object for MyBookingPage class
	 * @since 30-06-2023
	 */
	public MyBookingPage getMyBookingPage() {
		return( myBookingPage ==null)? myBookingPage= new MyBookingPage():myBookingPage;
	}
	
	
	
}
