package day21;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementCommands {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Samsung S23",Keys.ENTER);
		
		boolean eledisplayed = driver.findElement(By.linkText("Get It Today")).isDisplayed();
		System.out.println(eledisplayed);
		
		Point point = driver.findElement(By.linkText("Get It Today")).getLocation();
		System.out.println(point);

		WebElement serach = driver.findElement(By.id("nav-search-submit-button"));
		
		System.out.println(serach.getCssValue("color"));

	
		// Browser navigates
		
		driver.navigate().back();
		
		driver.navigate().forward();
		
		driver.navigate().refresh();
	
	}

}
