package testNGXML_Study;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class FailTCExecution1 {
  @Test(timeOut = 100)
  public void TC1() throws InterruptedException 
  {
	  Reporter.log("TC1 is running", true);
	//  Thread.sleep(200);
  }
  
  @Test
  public void TC2()
  {
	  Reporter.log("TC2 is running", true);
  }
  
  @Test
  public void TC3()
  {
	  Reporter.log("TC3 is running", true);
	 // Assert.fail();
  }
  
  @Test
  public void TC4()
  {
	  Reporter.log("TC4 is running", true);
  }
}
