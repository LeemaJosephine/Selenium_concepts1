package day27;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitPrac {

	public static void main(String[] args) {
		
		
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--disable-notifications");
		WebDriver driver = new ChromeDriver(option);
		
		driver.navigate().to("https://chercher.tech/practice/explicit-wait-sample-selenium-webdriver");
		
		
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.id("alert")).click();
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
		wait.until(ExpectedConditions.alertIsPresent());
		
		driver.switchTo().alert().accept();
		
		WebElement enable = driver.findElement(By.xpath("//button[text()='Enabled']"));
		driver.findElement(By.id("display-other-button")).click();
		wait.until(ExpectedConditions.visibilityOf(enable));
		
		System.out.println(enable.getText());
		
		driver.findElement(By.id("enable-button")).click();
		
		WebElement click = driver.findElement(By.xpath("//button[text()='Button']"));
		//wait.until(ExpectedConditions.elementToBeClickable(click));
		
		
		
		
		Wait<WebDriver> wait1 = new FluentWait<>(driver)
				.withTimeout(Duration.ofSeconds(2))
				.pollingEvery(Duration.ofMillis(100));
		
		wait1.until(ExpectedConditions.elementToBeClickable(click));
		System.out.println(click.getText());
		

	}

}
