package day26;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WindowHandles {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.navigate().to("https://chercher.tech/practice/explicit-wait-sample-selenium-webdriver");
		
		driver.manage().window().maximize();
		
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
//		
//		driver.findElement(By.xpath("(// button[@class='btn btn-info'])[1]")).click();
//		
//		//String windowHandle = driver.getWindowHandle();
//		//System.out.println(windowHandle);
//		
//		Set<String> windowHandles = driver.getWindowHandles();
//		
//		List<String> lstwindow = new ArrayList<>(windowHandles);
//		
//		System.out.println(lstwindow.size());
//		driver.switchTo().window(lstwindow.get(1));
//		
//		System.out.println(driver.getTitle());
		
		driver.findElement(By.id("alert")).click();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		//wait.until(ExpectedConditions.elementToBeClickable(null));
		
		driver.switchTo().alert().accept();
		
		//driver.quit();
	}

}
