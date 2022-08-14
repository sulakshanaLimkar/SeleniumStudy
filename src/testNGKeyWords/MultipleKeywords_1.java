package testNGKeyWords;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class MultipleKeywords_1 {
  @Test(dependsOnMethods = {"b"},priority = 1)
  public void a() 
  {
	  Reporter.log("a method is running", true);
  }
  @Test(dependsOnMethods = {"c"},invocationCount = 2,priority = -2)
  public void b()
  {
	  Reporter.log("b method is running", true);
  }
  @Test
  public void c()
  {
	  Reporter.log("c method is running", true);
  }
  @Test(timeOut = 500)
  public void d() throws InterruptedException
  {
	  Thread.sleep(1000);
	  Reporter.log("d method is running", true);
  }
  @Test
  public void e()
  {
	  Reporter.log("e method is running", true);
  }
  
}
