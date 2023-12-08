package day28;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;



public class SignUp extends LaunchBrowser{

	@BeforeTest
	public void setup() {
		
		excelfile="DemoBlazeSignup";
		
	}
	
	@Test(dataProvider = "getdata")
	public void signUpTest() {
		
		driver.findElement(By.xpath("//a[text()='Register']")).click();
		driver.findElement(By.xpath("//label[text()='Female']")).click();
		driver.findElement(By.id("FirstName")).sendKeys("Leema");
		driver.findElement(By.id("LastName")).sendKeys("Josephine");
		driver.findElement(By.id("Email")).sendKeys("leema123@gmail.com");
		driver.findElement(By.id("Password")).sendKeys("Leema.123");
		driver.findElement(By.id("ConfirmPassword")).sendKeys("Leema.123");
		driver.findElement(By.id("register-button")).click();

	}
	
	
}
