package testNGKeyWords;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class dependsOnMethodsStudy {
  @Test(dependsOnMethods = {"c"})
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
	  Reporter.log("d methodis running", true);
  }
  @Test
  public void e()
  {
	  Reporter.log("e method is running", true);
  }
  @Test
  public void a()
  {
	  Reporter.log("a method is running", true);
  }
}
