package verificationUsingTestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertEqualsAndNotEquals {
  @Test
  public void myMethod() 
  {
	  String a="pune";
	  String b="pune"	;
	  String c="mumbai";
	  
	  
	  //1.if a and b are equal TC should be PASSED
	  // i want to verify a equals b,equals c we will be usingn Hard Assert to verify
	  
	  
	// Assert.assertEquals(a,b, "A is not equals B TC is failed");
	  
	  Assert.assertNotEquals(a,b,"A and B equals hence  TC is failed");
	  
  }
}
