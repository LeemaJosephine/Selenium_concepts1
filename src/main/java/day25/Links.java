package day25;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Links {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.navigate().to("https://www.google.com/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		List<WebElement> links = driver.findElements(By.tagName("a"));
		int size = links.size();
		System.out.println(size);
		
		for(WebElement pagelink: links) {
			
			String linktext = pagelink.getText();
			String link = pagelink.getAttribute("href");
			System.out.println(linktext+  "-> " +link); 
			
		}

	}

}
