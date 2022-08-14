package testNGAnnotations;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AnnotationStudy_1 {
  @Test(enabled = false)
  public void validatePin()
  {
	  Reporter.log("pin validation done", true);
  }
 
  @Test
  public void validateUserID()
  {
	  Reporter.log("UserId validation done", true);
  }
  
  @BeforeMethod
  public void EnterUserIdAndPassword()
  {
	  Reporter.log("User id and password entered done", true);
  }
  
  @AfterMethod
  public void LogOut()
  {
	  Reporter.log("LogOut done", true);
  }
  
  @BeforeClass
  public void LaunchBrowser()
  {
	  Reporter.log("Launch browser", true);
  }
  
  @AfterClass
  public void CloseBrowser()
  {
	  Reporter.log("closed Browser", true);
  }
  
  @BeforeTest
  
  public void beforeTest()
  {
	  Reporter.log("before test is running", true);
  }
  
  @AfterTest
  public void afterTest()
  {
	  Reporter.log("after test is running", true);
  }
}
