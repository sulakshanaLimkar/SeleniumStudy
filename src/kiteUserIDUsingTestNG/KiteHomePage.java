package kiteUserIDUsingTestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteHomePage
{
 //1.Data member should be declared globally with access level private using @findBy Annotation
	
    @FindBy(xpath="//span[text()='ELR321']")private WebElement uID;	
	@FindBy(xpath="//A[@target='_self']")private WebElement LogOutButton;
	
 //2.Initialize within constructor with access level public using pageFactory
	
	public KiteHomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
//3.methods	
//	
//	public void validateUserID(String expectedUID)
//	{
//		String actualUserID=uID.getText();
//		
//		if(actualUserID.equals(expectedUID))
//		{
//			System.out.println("Actual and excepted user id are matching TC is Passed");
//		}
//		else
//		{
//			System.out.println("Actual and excepted user id are not matching TC is Falled");
//		}
//	}
	
	public String getActualUserID()
	{
		String actualUserID=uID.getText();
		return actualUserID;
	}
	
	public void clickOnLoginButton() throws InterruptedException
	{
		uID.click();
		Thread.sleep(200);
		LogOutButton.click();
		
	}
	
	
	
	
	
	
	
	
	
	
}
