package testNGXML_Study;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class FailTCExecution2 {
  @Test(timeOut = 500)
  public void TC5() throws InterruptedException 
  {
	  Reporter.log("TC5 is running", true);
	 // Thread.sleep(700);
  }
  
  @Test
  public void TC6()
  {
	  Reporter.log("TC6 is running", true);
  }
  
  @Test
  public void TC7()
  {
	  Reporter.log("TC6 is running", true);
	//  Assert.fail();
  }
  
  @Test
  public void TC8()
  {
	  Reporter.log("TC6 is running", true);
  }
  
}
