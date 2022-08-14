package verificationUsingTestNG;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssesrStudy {
  @Test
  public void SoftAssertMethods() 
  {
	  
	  String a ="Sulakshana";
	  String b="Sulakshana";
	  String c="limkar";
	  String d=null;
	  boolean e=true;
	  boolean f=false;
	  
	  //create object of soft Assert
	  
	  SoftAssert soft =new SoftAssert();
	  
	  //Softassert Equals and NotEquals method
	  
	 soft.assertEquals(a,c,"value of A and c are not equals hence TC is failed");
	 soft.assertNotEquals(a,b," A and B Both values are equal hence TC is failed");
	 
	 //softAssert true And false method
	 
	 soft.assertTrue(f,"given value of f is false hence TC is failed");
	 soft.assertFalse(e, "given value of e is true hence TC is failed");
	 
	 //softAssert Null and NotNull method
	 
	 soft.assertNull(c, "given value of c is not null hence TC is failed");
	 soft.assertNotNull(d, "given value of d  is null hence TC is failed");
	 soft.assertAll();
	 
	  
	  
	  
	  
	  
	  
	  
  }
}
