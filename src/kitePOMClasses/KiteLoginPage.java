package kitePOMClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteLoginPage {

	
	@FindBy(id="userid")private WebElement userID;
	@FindBy(id="password")private WebElement password;
	@FindBy(xpath="//button[@type='submit']")private WebElement loginButton;
	
	public KiteLoginPage(WebDriver driver)
	
	{
		PageFactory.initElements(driver, this);
	}
	
	
	public void sendUserID(String UN)
	{
		userID.sendKeys(UN);
	}
	
	public void sendPassword(String PWD)
	{
		password.sendKeys(PWD);
	}
	
	public void ClickOnLoginButton()
	{
		loginButton.click();
	}
	
	
	
	
	
	
	
	
	
}
