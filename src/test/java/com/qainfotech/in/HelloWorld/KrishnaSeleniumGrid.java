package com.qainfotech.in.HelloWorld;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class KrishnaSeleniumGrid {
  //WebDriver driver ;
	//public static WebDriver driver1;
	RemoteWebDriver driver;
  String hubUrl ,baseUrl;
 
  @BeforeTest
  public void SetUp() throws MalformedURLException {
	  
/*
 * This is the code for firefox Browser only worked
 */

	  
	  
//	    baseUrl="http://www.java.com";
//	    URL server = new URL("http://172.17.0.1:24/wd/hub");
//	    DesiredCapabilities capabilities = DesiredCapabilities.firefox();	 
//	    capabilities.setCapability("marionette",true);
//	    driver = new RemoteWebDriver(server, capabilities);
	

/*
* This is the code for chrome browser
*/
	    
	    baseUrl="http://www.java.com";
	    URL server = new URL("http://172.17.0.1:24/wd/hub");
        DesiredCapabilities capabilities = new DesiredCapabilities().chrome();
        driver = new RemoteWebDriver(server, capabilities);
	    
	
  
  }
  @Test
  public void LaunchApplication() {
	  driver.get(baseUrl);
	}
  
  @AfterTest
  public void closeBrowser() {
	  driver.close();
  }
}
