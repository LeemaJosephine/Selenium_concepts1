package day23;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.internal.WebElementToJsonConverter;

public class MouseHover {

	public static void main(String[] args) throws IOException {
		
		WebDriver driver = new ChromeDriver();
		
		//driver.get("");
		driver.navigate().to("https://www.myntra.com/");
		
		driver.manage().window().maximize();
		
		
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		//WebElement ele =driver.findElement(By.xpath("(//a[text()='Men'])[1]"));
		
		WebElement ele1 = driver.findElement(By.xpath("//a[text()=' Contact Us ']"));
		
		Actions builder = new Actions(driver);
		//builder.moveToElement(ele).perform();  // To mouseHover
		
		//builder.moveToElement(ele1).perform();  // ScrollDown
		
		//Scroll using JavaScriptExecutor
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", ele1);
		
		
		
		
		//How to take Screenshot.
		
		//Convert webdriver object to take screenshot. 
		
		TakesScreenshot screenShot = ((TakesScreenshot) driver);
		
		//Call getScreenshotAs method to create image file
		
		File scource = screenShot.getScreenshotAs(OutputType.FILE);
		
		// Mention destination 
		File dest = new File("snap/myntra.png");  //myntra201020231135.png
		
		// Copy from source to destiny
		FileUtils.copyFile(scource, dest);
		
		
		
		
		

	}

}
