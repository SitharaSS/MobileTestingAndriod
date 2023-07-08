package com.hotel.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.hotel.base.BaseClass;



/**
 *  @author Sithara
 *  @see This class is used to perform login function
 *  @since 30-06-2023
 */
public class LoginPage extends BaseClass {
	
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}	
	
	@FindBy(xpath="//*[@resource-id='login_email_input']")
	private WebElement txtuserName;
	
	@FindBy(xpath="//*[@resource-id='login_password_input']")	
	private WebElement txtpassword;
	
	@FindBy(xpath ="//*[@resource-id='login_button']")
	private WebElement btnLogin;
	
	@FindBy(xpath ="//*[@resource-id='login_error_message']")	
	private WebElement errorMsg;

	public WebElement getTxtuserName() {
		return txtuserName;
	}

	public WebElement getTxtpassword() {
		return txtpassword;
	}

	public WebElement getBtnLogin() {
		return btnLogin;
	}

	public WebElement getErrorMsg() {
		return errorMsg;
	}
	
	/**
	 * @author Sithara
	 * @see This method is used to login with valid credentials
	 * @param username should be passed as the argument in String
	 * @param password should be passed as the argument in String
	 * @since 03-07-2023
	 */
	public void loginWithValidCred(String username, String password) {
		elementSendKeys(getTxtuserName(),username);
		elementSendKeys(getTxtpassword(),password);
		elementClick(getBtnLogin());
	}
	

}
