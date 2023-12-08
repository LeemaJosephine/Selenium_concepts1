package day19;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Pattern {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();

	    // Maximize the browser window
	    driver.manage().window().maximize();

	    // Navigate to Snapdeal website
	    driver.get("https://www.snapdeal.com/");

	    // Wait for elements to load
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	    // Locate and hover over the Sign In button
	    WebElement signInButton = driver.findElement(By.className("accountInner"));
	    Actions actions = new Actions(driver);
	    actions.moveToElement(signInButton).build().perform();

	    // Click on the Sign In button
	    signInButton.click();

	    // Enter a valid Email Id
	    WebElement emailField = driver.findElement(By.id("userName"));
	    emailField.sendKeys("your_dummy_email@example.com");

	    // Click on the Continue button
	    WebElement continueButton = driver.findElement(By.id("checkUser"));
	    continueButton.click();

	    // Enter a valid password
	    WebElement passwordField = driver.findElement(By.id("j_password_login_uc"));
	    passwordField.sendKeys("your_dummy_password");

	    // Click on the Login button
	    WebElement loginButton = driver.findElement(By.id("submitLoginUC"));
	    loginButton.click();

	    // Wait for the user to be logged in (you may need to adjust this wait time)
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	    // Verify that the user is logged in successfully
	    if (driver.getTitle().contains("My Account")) {
	        System.out.println("Login successful. Verification message: User is logged in.");
	    } else {
	        System.out.println("Login failed. Verification message: User is not logged in.");
	    }

	    // Close the browser
	    driver.quit();

	       }


	

}
