package day28;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class NewTest {
	
	SoftAssert softassert = new SoftAssert();
	SoftAssert softassert1 = new SoftAssert();
	
  @Test
  public void test1() {
	  
	  	softassert.assertEquals("Welcome", "welcome");
		softassert.assertEquals("Sample", "Sample");
		softassert.assertAll();
		System.out.println("Assert sucessful");
  }
  
  @Test
  public void test2() {
	  
	  	softassert1.assertEquals("Welcome", "Welcome");
		softassert1.assertEquals("Sample", "Sample");
		softassert1.assertAll();
		System.out.println("Assert sucessful");
	  
  }
}
