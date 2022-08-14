package verificationUsingTestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertTrueAndAssertFalse {
  @Test
  public void Mymethod()
  {
	  boolean a = true;
	  boolean b = false;
	  
	  //i want varify a value is true or not
	  
	//  Assert.assertTrue(b," TC is failed");
	    Assert.assertFalse(b, "TC is failed value is true");
	    
	    
	  
  }
}
