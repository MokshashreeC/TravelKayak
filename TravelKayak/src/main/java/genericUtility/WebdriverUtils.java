package genericUtility;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

public class WebdriverUtils {
	/**
	 * this method is used to maximize the browser window
	 * @param driver
	 */
	public void maximizeWindow(WebDriver driver)
	{
		driver.manage().window().maximize();
	}
	
	/**
	 * this method will wait until the page gets load
	 * @param driver
	 */
	public void waitTillPageGetsLoad(WebDriver driver)
	{
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	/**
	 * this method is used to switch to child window
	 * @param driver
	 * @param title
	 */
	public void switchWindow(WebDriver driver,String url)
	{
		Set<String> set = driver.getWindowHandles();
		for (String wdw : set) 
		{
			driver.switchTo().window(wdw);
			String text = driver.getCurrentUrl();
			if(text.contains(url))
			{
				break;
			}
		}
	}
}
