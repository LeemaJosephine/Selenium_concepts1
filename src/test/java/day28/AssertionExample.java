package day28;

import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class AssertionExample {

	public static void main(String[] args) {
		
		//Hard assert
//		Assert.assertTrue(false);
//		Assert.assertEquals("Welcome", "welcome");
//		Assert.assertEquals("Sample", "Sample");
//		System.out.println("Assert sucessful");
		
		//Soft Assert
		SoftAssert softassert = new SoftAssert();
		softassert.assertEquals("Welcome", "welcome");
		softassert.assertEquals("Sample", "Sample");
		softassert.assertAll();
		System.out.println("Assert sucessful");
		

	}

}
