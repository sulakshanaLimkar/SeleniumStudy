package kiteUsingPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KitePinPage {
	
	
	//1.Data member should be declared globally with access level private using @FindBy Annotation
	
	@FindBy(id="pin")private WebElement pin;
	
	@FindBy(xpath="//button[@type='submit']")private WebElement continueButton;
	
	//Initilize within constructor with access level public using pageFactory
	
	public KitePinPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//3.utilize within a method with access level public
	
	public void sendpin()
	{
		pin.sendKeys("982278");
	}
	
	public void clickOnContinueButton()
	{
		continueButton.click();
		
	}
	

}
