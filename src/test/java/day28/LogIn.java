package day28;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LogIn extends LaunchBrowser{

	@BeforeTest
	public void setup() {
		
		excelfile="DemoBlazeLogin";
		
	}
	
	@Test(dataProvider ="getData" )
	public void loginTest(String mail, String pass) {
		
			driver.findElement(By.xpath("//a[text()='Log in']")).click();
			WebElement email = driver.findElement(By.id("Email"));
			// checking for email input
			Assert.assertTrue(email.isDisplayed());
			email.sendKeys(mail);
			
			WebElement  password= driver.findElement(By.id("Password"));
			//checking password input 
			Assert.assertTrue(password.isDisplayed());
			password.sendKeys(pass);
			driver.findElement(By.id("RememberMe")).click();
			driver.findElement(By.xpath("//input[@value='Log in']")).click();
			
	}
	
	

}
