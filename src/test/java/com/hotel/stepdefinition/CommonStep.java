package com.hotel.stepdefinition;

import org.junit.Assert;

/**
 * @author Sithara
 * @see This class is used to perform the common actions
 * @since 05-07-2023
 */
public class CommonStep {
	
	/**
	 * @author Sithara
	 * @see This method is to verify the success message
	 * @param expSuccessMsg should be passed as the argument in String
	 * @param actSuccessMsg 
	 * @since 05-07-2023
	 */
	public void verifySuccessMsg(String expSuccessMsg, String actSuccessMsg) {
		String[] split= expSuccessMsg.split(" ");
		for (String v : split) {
			Assert.assertTrue("verify the message",actSuccessMsg.contains(v));
		}

	}
}
