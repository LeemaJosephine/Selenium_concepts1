package day19;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SimpleScript {

	public static void main(String[] args) {
		
		//Driver initialization /Launch the browser
		WebDriver driver = new ChromeDriver();  //-- interact with chrome 
		
		//Load the URL
		driver.get("https://www.saucedemo.com/");
		
		//To maximize the browser
		driver.manage().window().maximize();  // manage the window by maximizing it. 
		
		//Username
		
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		
		driver.findElement(By.name("password")).sendKeys("secret_sauce");
		
		driver.findElement(By.id("login-button")).click();
		
		//Close the browser
		//driver.close();
		
		//user-name
		
		
		

	}

}
