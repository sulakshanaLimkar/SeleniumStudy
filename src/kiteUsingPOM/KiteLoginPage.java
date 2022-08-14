package kiteUsingPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteLoginPage {
	
	//1.Data member should be declared globally with access level private using @FindBy Annotation
	
	@FindBy(id="userid")private WebElement userId;
	
	@FindBy(id="password")private WebElement passward;
	@FindBy(xpath="//button[@type='submit']")private WebElement loginButton;
	
	//2.Initialize within constructor with access level public using pageFactory
	
	public KiteLoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//3.utilize within a method with access level public
	
	public void sendUserID()
	{
		userId.sendKeys("ELR321");
	}
	
	public void sendPassword()
	{
		passward.sendKeys("Dhana1111");
	}
	
	public void clickOnLoginButton()
	{
		loginButton.click();
	}
	
	
	
	

}
