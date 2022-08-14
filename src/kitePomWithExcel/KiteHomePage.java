package kitePomWithExcel;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteHomePage {
	
	@FindBy(xpath="//span[@class='user-id']")private WebElement UID;
	@FindBy(xpath="//a[@target='_self']")private WebElement LogOutButton;
	
	public KiteHomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void ValidateuserID(String exceptedUID)
	{
	String actualUserID=UID.getText();
	
	
	
	if(actualUserID.equals(exceptedUID))
	{
		System.out.println("Actual and excepted userId's are matching , Tc is pass");
	}
	else
	{
		System.out.println("Actual and excepted userId's are not matching , Tc is Fail");
	
	}
	}
	
	public void ClickOnLogOutButton() throws InterruptedException
	{
		UID.click();
		
		Thread.sleep(1000);
		
		LogOutButton.click();
		
	}
	
	
	
	
	
	
	
	
	

}
