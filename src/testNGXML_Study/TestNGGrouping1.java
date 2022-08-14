package testNGXML_Study;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestNGGrouping1 {
  @Test(groups = {"sanity","functional"})
  public void a()
  {
	  Reporter.log("a method is running", true);
  }
  
  @Test(groups = {"regression"})
  public void b()
  {
	  Reporter.log("bmethod is running", true);
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
}
