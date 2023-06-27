package sample;

import java.awt.AWTException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import genericUtility.WebdriverUtils;
import io.github.bonigarcia.wdm.WebDriverManager;
import objectRepository.HomePage;
import objectRepository.PricePage;

public class Kayaking {

	@Test
	public void main() throws InterruptedException, AWTException {
		WebDriverManager.chromedriver().setup();
	    WebDriver driver = new ChromeDriver();
		  
	    WebdriverUtils wLib = new WebdriverUtils();
	    
		 wLib.maximizeWindow(driver);
		 wLib.waitTillPageGetsLoad(driver);
		 
		 driver.get("https://www.kayak.co.in/");
		  
		 HomePage homePage = new HomePage(driver);
		 homePage.EnterInputFields("delhi", "Bengaluru");
		 
		 Thread.sleep(3000);
		 wLib.switchWindow(driver, "sort=bestflight_a");

		  PricePage pricePage = new PricePage(driver);
		  int ActualPrice = pricePage.selectPriceRange();
		  
	      Assert.assertTrue(ActualPrice < 20000, "Value is not less than 20000");
	      System.out.println("test case is pass");
	       
	      driver.quit();
	      
	}
}
