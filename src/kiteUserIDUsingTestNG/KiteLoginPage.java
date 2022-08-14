package kiteUserIDUsingTestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class KiteLoginPage 
{

 //1.Data Member should be declared globally with access level private using @findBy Annotation
	
	@FindBy(id = "userid")private WebElement userID;
	@FindBy(id = "password")private WebElement passward;
	@FindBy(xpath="//button[@type='submit']")private WebElement loginButton;
	
	
	//2.Initialise within constructor with access level public using PageFactory
	
	public KiteLoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	 //3.methods	
	
	public void sendUserID(String UN)
	{
		userID.sendKeys(UN);
	}
	
	public void sendPassword(String PWD)
	{
		passward.sendKeys(PWD);
	}
	
	public void clickOnLoginButton()
	{
		loginButton.click();
	}
	
	
	
	
}
