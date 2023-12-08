package day28;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SpiceJetClass {

	@Test
	public void spicejet() {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.bestbuy.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[@class='us-link']")).click();
		driver.findElement(By.xpath("//span[text()='Account']")).click();
		
		driver.findElement(By.xpath("//a[text()='Create Account']")).click();
		driver.findElement(By.id("firstName")).sendKeys("leema");
		driver.findElement(By.id("lastName")).sendKeys("Josephine");
		driver.findElement(By.id("email")).sendKeys("leema123@gmail.com");
		driver.findElement(By.id("fld-p1")).sendKeys("Nine+one=10");
		driver.findElement(By.id("reenterPassword")).sendKeys("Nine+one=10");
		driver.findElement(By.id("phone")).sendKeys("9952923695");
		driver.findElement(By.xpath("//button[text()='Create an Account']")).click();
		//)
		//		driver.findElement(By.xpath("//a[text()='Sign In']")).click();
//		driver.findElement(By.id("fld-e")).sendKeys("leema@gmail.com");
//		driver.findElement(By.id("fld-p1")).sendKeys("Nine+one=10");
//		driver.findElement(By.xpath("//button[text()='Sign In']")).click();
		
//		driver.findElement(By.xpath("//div[text()='Login']")).click();
//		driver.findElement(By.xpath("//div[text()='Email']")).click();
//		driver.findElement(By.xpath("//div[text()='LOGIN']")).click();
		
	}
}
