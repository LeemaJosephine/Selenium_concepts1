package day28;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Amazon {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//WebDriverManager.edgedriver().setup();
		EdgeDriver driver=new EdgeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.amazon.in/");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("oneplus 9 pro",Keys.ENTER);
		
		String price1 = driver.findElement(By.xpath("(//span[@class='a-price-whole'])[2]")).getText();
		System.out.println("Price of the second mobile: " +price1);
		
		String review = driver.findElement(By.xpath("(//span[@class='a-size-base s-underline-text'])[1]")).getText();
		System.out.println("Number of customer ratings: " +review);
		
		WebElement ratings = driver.findElement(By.xpath("(//i[contains(@class,'a-icon a-icon-star-small a-star-small')])[1]"));
		
		Actions mouse=new Actions(driver);
		mouse.moveToElement(ratings);
		ratings.click();
		
		
		
		String rate = driver.findElement(By.xpath("(//span[contains(text(),'out of 5 stars')])[1]")).getText();
		
		System.out.println("Rating percentage for 5 star: " +rate);
		
		driver.findElement(By.xpath("(//span[contains(@class,'a-size-medium a-color-base')])[2]")).click();
		
		Set<String> windowHandles = driver.getWindowHandles();
		List<String> wind=new ArrayList<String>(windowHandles);
		driver.switchTo().window(wind.get(1));
		
		File source = driver.getScreenshotAs(OutputType.FILE);
		File dest=new File("snap/amazonss.png");
		FileUtils.copyFile(source, dest);
		
		driver.findElement(By.id("add-to-cart-button")).click();
		
		String subtotal = driver.findElement(By.xpath("//span[contains(@id,'cart-subtotal')]")).getText();
		
		if(price1.contains(subtotal)) {
			System.out.println("--The price and the subtotal match--"  +"\n" +"Price: " +price1+ "\n" +"Subtotal: " +subtotal);
		} else {
			System.out.println("Sorry the Price and Subtotal don't match :( " +"\n" +"Price: " +price1+ "\n" +"Subtotal: " +subtotal);
		}
	}

}
