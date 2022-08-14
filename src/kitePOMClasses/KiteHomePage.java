package kitePOMClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteHomePage {

	@FindBy(xpath="//span[@class='user-id']")private WebElement uID;
	@FindBy(xpath="//a[@target='_self']")private WebElement logOutButton;
	
	public KiteHomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	public String getActualUserID()
	{
		String actualUserID=uID.getText();
		return actualUserID;
	}
	
	public void clickOnLogOutButton() throws InterruptedException
	{
		uID.click();
		
		Thread.sleep(200);
		
		logOutButton.click();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
