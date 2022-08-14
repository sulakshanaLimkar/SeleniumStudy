package kiteUsingPOM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class KiteHomePage {
	
	
	
	@FindBy(xpath="//span[@class='user-id']")private WebElement UID;
	
	@FindBy(xpath="//a[@target='_self']")private WebElement logoutButton;
	
	
	public KiteHomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void ValiteUserID() 
	{
	      String ExceptedUserD ="ELR321";
	      String ActualUserID=UID.getText();
	      
	      if(ExceptedUserD.equals(ActualUserID))
	      {
	    	  System.out.println("actual and excepted user id are matching , TC is Passed");
	    	  
	      }
	      else
	      {
	    	  System.out.println("actual and excepted user id are not matching , TC is Failed ");
	      }
	}
	      
	   public void LogOut() throws InterruptedException
	   {
		   UID.click();
		   
		   Thread.sleep(500);
		   
		   logoutButton.click();
		   
		   
		   
	   }
	      
	      }
