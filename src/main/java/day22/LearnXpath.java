package day22;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v114.dom.model.ShadowRootPopped;
import org.openqa.selenium.interactions.Actions;

public class LearnXpath {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demoqa.com/radio-button");
//		driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
//		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
//		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
//		
//		Thread.sleep(5000);
//		driver.findElement(By.xpath(" //button[text()=' Login ']")).click();
//		driver.findElement(By.xpath("//p[contains(@class,\"login-forgot\")]")).click();
		
		List<WebElement> findElements = driver.findElements(By.xpath("//input[@type='radio']"));
		for(WebElement ele : findElements) {
			
			String text = ele.getAttribute("id");
			if(text.equals("yesRadio")) {
				Actions builder = new Actions(driver);
				builder.click(ele).perform();
			}
			System.out.println(text);
			
		}
//		
		
		
		

	}

}
