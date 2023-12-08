package day20;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AutomationTestStore {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		//driver.get("");
		driver.navigate().to("https://automationteststore.com/");
		
		driver.manage().window().maximize();
		
		driver.findElement(By.linkText("Login or register")).click();
		driver.findElement(By.xpath("(//button[@type=\"submit\"])[1]")).click();
		
		driver.findElement(By.id("AccountFrm_firstname")).sendKeys("Leema");
		driver.findElement(By.id("AccountFrm_lastname")).sendKeys("Josephine");
		
		driver.findElement(By.id("AccountFrm_email")).sendKeys("leema123@gmail.com");
		driver.findElement(By.id("AccountFrm_telephone")).sendKeys("987654321");
		
		driver.findElement(By.id("AccountFrm_company")).sendKeys("Guvi");
		
		driver.findElement(By.id("AccountFrm_address_1")).sendKeys("Guindy");
		
		driver.findElement(By.id("AccountFrm_city")).sendKeys("Chennai");
		
		WebElement select = driver.findElement(By.id("AccountFrm_zone_id"));
		
		Select options = new Select(select);
		
		List<WebElement> opt = options.getOptions();
		
		for(WebElement a: opt) {
			
			System.out.println(a.getText());
		}
		
		
		options.selectByVisibleText("North Lanarkshire");
		
		
		//options.selectByValue("3575");
		
		//options.selectByIndex(2);
		
		
		
		
		

		
		
		
		
	}
}
