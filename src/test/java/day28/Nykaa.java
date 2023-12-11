package day28;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Nykaa {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		ChromeDriver driver=new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://www.nykaa.com/");
		
		Actions mouseHover= new Actions(driver);
		
		//MouseHover on Brands
		WebElement brands = driver.findElement(By.xpath("//a[text()='brands']"));
		mouseHover.moveToElement(brands).perform();
		
		//Search and click L'oreal
		driver.findElement(By.id("brandSearchBox")).sendKeys("L'Oreal Paris",Keys.ENTER);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[contains(text(),'Oreal Paris')]")).click();
		
		//Verify title
		String title = driver.getTitle();
		if(title.contains("'Oreal Paris")) {
			System.out.println("Title contains L 'Oreal Paris: " +title);
			} else {
				System.out.println("Invalid Title");
			}
		driver.findElement(By.xpath("//span[contains(text(),'Sort By')]")).click();
		driver.findElement(By.xpath("//span[text()='customer top rated']")).click();
		
		driver.findElement(By.xpath("//span[text()='Category']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()='Hair']")).click();
		driver.findElement(By.xpath("//span[text()='Hair Care']")).click();
		driver.findElement(By.xpath("//span[text()='Shampoo']")).click();
		
		WebElement color =driver.findElement(By.xpath("//span[text()='Concern']"));
		
		WebDriverWait wait=new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.visibilityOf(color));
		color.click();
		driver.findElement(By.xpath("//span[text()='Colour Protection']")).click();
		
		//verify Filters applied
		System.out.println("Filters applied: ");
		List<WebElement> filter = driver.findElements(By.xpath("//span[@class='filter-value']"));
		for (int i = 0; i < filter.size(); i++) {
			System.out.println(filter.get(i).getText());
		}
		
		driver.findElement(By.xpath("//div[contains(text(),'Oreal Paris Colour Protect')]")).click();
		
		Set<String> window = driver.getWindowHandles();
		List<String> wind=new ArrayList<String>(window);
		driver.switchTo().window(wind.get(1));
		
		driver.findElement(By.xpath("//span[text()='180ml']")).click();
		String text = driver.findElement(By.xpath("(//span[text()='MRP:'])[1]/following-sibling::span[1]")).getText();
		System.out.println("Price: " +text);
		
		driver.findElement(By.xpath("(//span[text()='Add to Bag'])[1]")).click();
		
		driver.findElement(By.xpath("(//button[@type='button'])[1]")).click();
		
		driver.switchTo().frame(0);
		
		String text2 = driver.findElement(By.xpath("(//div[contains(@class,'footer')]//span[1])[1]")).getText();
		System.out.println("Grand total: " +text2);
		
		driver.findElement(By.xpath("//span[text()='Proceed']")).click();
		
		driver.findElement(By.xpath("//button[text()='Continue as guest']")).click();
		
		
		//driver.switchTo().frame(0);
		
		driver.findElement(By.xpath("(//img[@alt='Image'])[7]")).click();
		
		String text3 = driver.findElement(By.xpath("(//div[contains(@class,'leftSelector')])[2]/p")).getText();	
		
		if(text2.contains(text3)){
			System.out.println("---Grand total matches during the chekout--- :) Final Grand total: " +text3);
		}
		else {
			System.out.println("Grand total dosen't match :( " +text3);
		}
		
		//driver.quit();
	}

}
