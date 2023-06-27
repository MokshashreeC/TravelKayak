package objectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	@FindBy(xpath = "//div[@aria-label='Remove']")
	private WebElement removeBtn;
	
	@FindBy(xpath = "//input[@placeholder='From?']")
	private WebElement EnterfromTxt;
	
	@FindBy(xpath = "//span[.='New Delhi, National Capital Territory of India, India']")
	private WebElement selectNewDelhi;
	
	@FindBy(xpath = "//input[@placeholder='To?']")
	private WebElement EnterToTxt;
	
	@FindBy(xpath = "//span[.='Bengaluru, Karnataka, India']")
	private WebElement selectBengaluru;
	
	@FindBy(xpath = "//span[@aria-label='Start date calendar input']")
	private WebElement enterStartDate;
	
	@FindBy(xpath = "//div[@aria-label='Saturday 15 July, 2023']")
	private WebElement startDate;
	
	@FindBy(xpath = "//div[@aria-label='Monday 17 July, 2023']")
	private WebElement backDate;
	
	@FindBy(xpath = "//*[name()='svg' and @class='c8LPF-icon']")
	private WebElement serachBtn;
	
	
	
	public HomePage(WebDriver driver)
	{
	   PageFactory.initElements(driver, this);	
	}
	



	public void EnterInputFields(String from,String to)
	{   
		removeBtn.click();
		EnterfromTxt.sendKeys(from);
		selectNewDelhi.click();
		EnterToTxt.sendKeys(to);
		selectBengaluru.click();
		enterStartDate.click();
		startDate.click();
		backDate.click();
		serachBtn.click();
	}
	
}
