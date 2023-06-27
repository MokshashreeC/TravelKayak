package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PricePage {
	@FindBy(xpath = "//div[@class='c1wE_-label' and div[contains(.,'Other sort')]]")
	private WebElement otherSortDropdown;
	
	@FindBy(xpath = "//li[@aria-label='Less CO₂']")
	private WebElement selectLessCO2;
	
	@FindBy(xpath = "//div[@data-resultid='e1412cbfbcd9c1209aa3dad9db3a9a4e']//div[@class='nrc6-price-section']//div[@class='f8F1']")
	private WebElement selectFirstPrice;
	
	
	public PricePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	public int selectPriceRange()
	{
		otherSortDropdown.click();
		selectLessCO2.click();
		String text = selectFirstPrice.getText();
		String[] textPrice = text.toString().split(" ");
	      String ApPrice = textPrice[1];
	      String myPrice = ApPrice.replaceAll(",", "");
	     int ActualPrice = Integer.valueOf(myPrice);
		return ActualPrice;
	      
	}
	
}
