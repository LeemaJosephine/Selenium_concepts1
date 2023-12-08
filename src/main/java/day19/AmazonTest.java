package day19;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonTest {

	public static void main(String[] args) {
		
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.linkText("Best Sellers")).click();
		
		String actual = driver.getTitle();
		
		System.out.println(actual);
		String expected="Bestsellers";
		
		if(actual.contains(expected)) {
			
			System.out.println("Bestseller page loaded");
		}  else {
			
			System.out.println("Bestseller page not loaded");
		}
		
		driver.close();
		
	

	}

}
