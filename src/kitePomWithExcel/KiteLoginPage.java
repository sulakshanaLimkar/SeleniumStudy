package kitePomWithExcel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteLoginPage {
	
	
	//1.deta member should be declared globally with access level private using @FindBy Annotation
	
	@FindBy(id="userid")private WebElement UserID;
	@FindBy(id="password")private WebElement Password;
	@FindBy(xpath="//button[@type='submit']")private WebElement loginButton;
	
	//2.Initialise within constructor with access level public using PageFactory
	
	public KiteLoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//3.utilise within a method with access level public
	
	public void sendUserID(String UN)
	{
		UserID.sendKeys(UN);
	}
	
	public void sendPassword(String PWD)
	{
		Password.sendKeys(PWD);
	}
	
	public void clickOnLoginButton()
	{
		loginButton.click();
	}
	
	}
