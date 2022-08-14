package testNGKeyWords;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TimeOutUse {
  @Test(timeOut = 2000)
  public void a() throws InterruptedException 
  {
	  Thread.sleep(3000);
	  Reporter.log("a method is running", true);
  }
  
  @Test
  public void b()
  {
	  Reporter.log("b method is running", true);
  }
  
  @Test
  public void c()
  {
	  Reporter.log("c method is running", true);
  }
  
  @Test 
  public void d()
  {
	  Reporter.log("d method is running", true);
  }
  
  @Test
  public void e()
  {
	  Reporter.log("e method is running", true);
  }
  
  
  
  
  
  
}
