package day27;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.sukgu.Shadow;

public class SalesForce {

	public static void main(String[] args) throws IOException, InterruptedException {
		
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--disable-notifications");
		
		
		ChromeDriver driver=new ChromeDriver(option);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		Shadow obj = new Shadow(driver);
		obj.findElementByXPath("//span[text()='Learning']").click();
		
		
		
		driver.get("https://guvi5-dev-ed.develop.my.salesforce.com/");
		driver.findElement(By.id("username")).sendKeys("leema.jose@guvi.com");
		driver.findElement(By.id("password")).sendKeys("Leema@1234");
		driver.findElement(By.id("Login")).click();
		
		driver.findElement(By.xpath("(//span[text()='Home'])[1]")).click();
		driver.findElement(By.xpath("//span[text()='Learn More']")).click();
		
		Set<String> windowHandles = driver.getWindowHandles();
		List<String> window1= new ArrayList<String>(windowHandles);
		driver.switchTo().window(window1.get(1));
		
		driver.findElement(By.xpath("//button[text()='Confirm']")).click();
		
		
		Shadow shadow=new Shadow(driver);
		shadow.findElementByXPath("//span[text()='Learning']").click();
		
		//Thread.sleep(3000);
		Actions mouse=new Actions(driver);
		WebElement findElementByXPath = shadow.findElementByXPath("//span[text()='Learning on Trailhead']");
		mouse.moveToElement(findElementByXPath).perform();
		
		
		WebElement findElementByXPath2 = shadow.findElementByXPath("//a[text()='Salesforce Certification']");
		mouse.click(findElementByXPath2).perform();
		
		//driver.executeScript("arguments[0].click();", findElementByXPath2);
		
		System.out.println(driver.getTitle());
		
		List<WebElement> findElements = driver.findElements(By.xpath("//div[@class='credentials-card_title']"));
		for (int i = 0; i < findElements.size(); i++) {
			System.out.println(findElements.get(i).getText());
		}
		
		WebElement findElements2 = driver.findElement(By.xpath("(//a[text()='Sched­ule Now'])[5]"));
		//mouse.scrollToElement(findElements2).perform();
		driver.executeScript("arguments[0].scrollIntoView(true);", findElements2);
		Thread.sleep(500);
		File source = driver.getScreenshotAs(OutputType.FILE);
		File dest=new File("snap/Cretification.png");
		FileUtils.copyFile(source, dest);
	
	}

}
