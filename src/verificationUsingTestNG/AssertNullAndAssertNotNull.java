package verificationUsingTestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertNullAndAssertNotNull {
  @Test
  public void myMethod()
  {
	  String a =null;
	  String b ="pune";
	  
	// Assert.assertNotNull(a,"Given value is null Tc is FAILED");
	  
	  Assert.assertNull(b, "Given value is not null hence TC is FAILED");
  }
}
