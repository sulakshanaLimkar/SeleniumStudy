package TestNGlistener;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(TestNGlistener.listener.class)
public class DemoClass2 {
  @Test
  public void myMethod4() 
  {
	  Reporter.log("myMethod4-->TC execution is started", true);
  }
  
  @Test
  public void myMehod5()
  {
	  Assert.fail();
	  Reporter.log("myMehod5 -->TC execution is started", true);
  }
  
  
  @Test(dependsOnMethods = {"myMehod5"})
  public void myMehod6()
  {
	  Reporter.log("myMehod6 -->TC execution is started", true);
  }
  
  
  
  
  
}
