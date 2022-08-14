package kiteUserIDUsingTestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KitePinPage
{
//1.data member should be declared globally with access level private using @findBy annotation
	
	@FindBy(id ="pin")private WebElement pin;
	@FindBy(xpath="//button[@type='submit']")private WebElement continueButton;
	
//2.Initialize within conctructor with access level public using pagefactory
	
	public KitePinPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
//3.methods
	
	public void sendPin(String PIN)
	{
		pin.sendKeys(PIN);
	}
	
	public void clickOnContinueButton()
	{
		continueButton.click();
	}
	
	
	
	
	
	
	
	
	

}
