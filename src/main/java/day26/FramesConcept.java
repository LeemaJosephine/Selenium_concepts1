package day26;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FramesConcept {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.navigate().to("https://demo.automationtesting.in/Frames.html");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(30));
		
		driver.findElement(By.xpath("//a[text()='Iframe with in an Iframe']")).click();
		
		WebElement parentFrame = driver.findElement(By.xpath("//iframe[@style='float: left;height: 300px;width:600px']"));

		driver.switchTo().frame(parentFrame);
		
		WebElement childFrame = driver.findElement(By.xpath("//iframe[@style='float: left;height: 250px;width: 400px']"));
		
		driver.switchTo().frame(childFrame);
		
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("sample");
		
		driver.switchTo().parentFrame();
		
		String text = driver.findElement(By.tagName("h5")).getText();
		System.out.println(text);
		
		driver.switchTo().defaultContent();
		
		driver.findElement(By.xpath("//a[text()='Single Iframe ']")).click();
		
		driver.close();
	}

}
