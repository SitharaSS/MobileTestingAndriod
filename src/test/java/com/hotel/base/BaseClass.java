package com.hotel.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.PointerInput;
import org.openqa.selenium.interactions.PointerInput.Kind;
import org.openqa.selenium.interactions.Sequence;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;



import io.appium.java_client.android.AndroidDriver;

/**
 * 
 * @author Sithara
 * @see This class is used for reusable codes
 * @since 30-06-2023
 *
 */
public class BaseClass {
	public static WebDriver driver;
	    //1.
	    /**
	     * @author Sithara
	     * @see This method is used to launch the Mobile browser (chrome)
	     * @param  deviceName should be passed as the parameter in String
		 * @param  platformName should be passed as the parameter in String
		 * @param  platformVersion should be passed as the parameter in String
		 * @param  browserName should be passed as the parameter in String
	     * @throws MalformedURLException
	     * @since 30-06-2023
	     */
	    public void launchMobileBrowser(String deviceName, String platformName, String platformVersion, String browserName) throws MalformedURLException {
			DesiredCapabilities caps = new DesiredCapabilities();
			caps.setCapability("platformName", platformName);
			caps.setCapability("deviceName", deviceName);
			caps.setCapability("platformVersion", platformVersion);
			caps.setCapability("automationName", "UiAutomator2");
			caps.setCapability("browserName", browserName);
			
			driver = new AndroidDriver(new URL("http://127.0.0.1:4723"),caps);
			implicitWait();
		}
	    
	  //2.
	    /**
	     * @author Sithara
	     * @see This method is used to launch the Mobile app 
	     * @param deviceName should be passed as the parameter in String
		 * @param platformName should be passed as the parameter in String
		 * @param platformVersion should be passed as the parameter in String
		 * @param appPackage should be passed as the parameter in String
	     * @param appActivity should be passed as the parameter in String
	     * @throws MalformedURLException
	     */
	    public void launchMobileApp(String deviceName, String platformName, String platformVersion, String appPackage,String appActivity) throws MalformedURLException {
			DesiredCapabilities caps = new DesiredCapabilities();
			caps.setCapability("platformName", platformName);
			caps.setCapability("deviceName", deviceName);
			caps.setCapability("platformVersion", platformVersion);
			caps.setCapability("automationName", "UiAutomator2");
			caps.setCapability("appPackage", appPackage);
			caps.setCapability("appActivity", appActivity);
			
			driver = new AndroidDriver(new URL("http://127.0.0.1:4723"),caps);
			implicitWait();
		}
	    
	    // 3. implicitWait
		/**
		 *@author Sithara 
	     *@see sets the implicit wait for the driver.	
	     *@since 30-06-2023
	     */
		public void implicitWait() {
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		}
		
		//4. Enter url/ Load url
		/**
		 *@author Sithara 
	     *@see sets the implicit wait for the driver.	
	     *@param url should be passed as the parameter in String
	     *@since 30-06-2023
		 */
		public void enterUrl(String url){
			driver.get(url);
		}
		
		//5. 
		 /**
         * @author Sithara 
         * @param element in which the value should be entered should be passed as the parameter in WebElement
         * @param text should be passed as the parameter in String, it will contain the value to be entered in the element
         * @since 30-06-2023 
         */
         public void elementSendKeys(WebElement element, String text) {
        	 
         element.sendKeys(text);
         }
         
         //6. 
	         /**
			 * *
			 * @author Sithara 
			 * @param element,The element to click
			 * @see it helps to click the element
			 * @since 30-06-2023
			 */
        public void elementClick(WebElement element) {
        	visibilityOfElement(element);
	        element.click();
         }
        
        //7.
        /**
         * @author Sithara 
	     * @see This method is used to make the element visible or wait till the element is visible
	     * @param element should be passed as the argument in WebElement
	     * @since 30-06-2023 
         */
         public void visibilityOfElement(WebElement element) {
         	WebDriverWait driverWait = new WebDriverWait(driver,Duration.ofSeconds(50));
         	driverWait.until(ExpectedConditions.visibilityOf(element));
  	   }
         
       //8. 
         /**
          * @author Sithara 
          * @return it returns the path
          * @see This method is used to get project path
          * @since 30-06-2023
          */
        public static String getProjectPath() {
	        String path = System.getProperty("user.dir");
	        return path;
		     }
        
        //9. 
	     /**
	      * @author Sithara 
		  * @see This method is used to find the property file value
		  * @param key should be passed as the argument in String
		  * @throws FileNotFoundException because the file specified by that path may not be found
		  * @throws IOException because there may be an error during input or output operations
		  * @since 30-06-2023
	      */
	     public static String getPropertyFileValue(String key) throws FileNotFoundException, IOException {
	   	  
		     Properties properties = new Properties();
		  	 properties.load(new FileInputStream(getProjectPath()+"\\Config\\Config.properties"));
		   	  
		     Object obj = properties.get(key);
		     String Value=(String)obj;
		     System.out.println(Value);
		     return Value;
	     }
		
	     //10.
	     /**
	      * @author Sithara 
          * @see This method is used to close the Mobile App
          * @since 30-06-2023
	     */
	    public void closeApp() {
			

		}
	    
	    //11. 
	    
	    /**
	     * @author Sithara 
         * @see This method is used to check the locator is present in the screen
         * @param elements should be present as the argument in List<WebElement>
         * @since 02-07-2023
	     */
//	    public void verifyLocator(List<WebElement> elements) {
//	    	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
//	    	while(elements.size()==0) {
//	    		scrollDown();
//	    	}
//	    	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
//		}
	    
	    
	  //12.
	       
	    /**
	     * @author Sithara 
         * @see This method is used to scroll down the screen
         * @param elements should be passed as the argument in List<WebElement>
         * @since 02-07-2023
	     */
		public void scrollDown(List<WebElement> elements){
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	    	while(elements.size()==0) {
	    		swipe();
	    	}	
	    	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
    	}
		
		//13.
	       
	    /**
	     * @author Sithara 
         * @see This method is used to swipe through the screen using one finger
         * @since 02-07-2023
	     */
		public void swipe() {
			
			Dimension size = driver.manage().window().getSize();
			
			int startY = (int)(size.height*0.7);
			int endY = (int)(size.height*0.3);
			int x = size.width /2;	
			
			PointerInput pointerInput = new PointerInput(Kind.TOUCH,"finger");
			
			Sequence sequence =  new Sequence(pointerInput,1);
			
			sequence.addAction(pointerInput.createPointerMove(Duration.ofMillis(0),PointerInput.Origin.viewport(),x,startY));
			sequence.addAction(pointerInput.createPointerDown(1));
			
			sequence.addAction(pointerInput.createPointerMove(Duration.ofMillis(700),PointerInput.Origin.viewport(),x,endY));
			sequence.addAction(pointerInput.createPointerUp(1));
			
			((RemoteWebDriver)driver).perform(Arrays.asList(sequence));
		}
		
		//14.
		   
	    /**
	     * @author Sithara 
         * @see This method is used to find locator using text.
         * @param text should be passed as the argument in String
         * @since 03-07-2023
	     */
		public  WebElement findLocatorByText(String text) {
			WebElement element = driver.findElement(By.xpath("//*[@text='"+text+"']"));
			visibilityOfElement(element);
			return element;
		}
		
		//15
		/**
		 * @author Sithara
		 * @param element should be passed as the argument in String
		 * @return it returns the text
		 * @since 03-07-2023
		 */
		public  String elementGetText(WebElement element) {
			String text = element.getText();
			return text;
		}
		//16
		/**
		 * @author Sithara
		 * @param element  the web element to set the value for
		 * @param data the data to be entered into the element
		 * @see This method is used to sets the value of javascript
		 * @since 03-07-2023
		 */
		public void elementSendKeysJs(WebElement element,String data) {
		JavascriptExecutor executor=(JavascriptExecutor) driver;
	    executor.executeScript("arguments[0].setAttribute('value', ' "+ data + " ')",element);
		}
		//17.
		
		public static void waitUsingFluentWait() {
			Wait<WebDriver> wait = new FluentWait<>(driver).withTimeout(Duration.ofSeconds(30))
				    .pollingEvery(Duration.ofSeconds(5)).ignoring(NoSuchElementException.class);
		}
	 	
		
}
