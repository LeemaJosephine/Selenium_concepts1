package day23;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ContextClick {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		
		driver.navigate().to("https://demo.guru99.com/test/simple_context_menu.html");
		
		driver.manage().window().maximize();
		
		WebElement ele = driver.findElement(By.xpath("//span[text()='right click me']"));
		
		Actions builder = new Actions(driver);
		builder.contextClick(ele).perform();
		
		WebElement ele1 = driver.findElement(By.xpath("//button[contains(text(),'Double-Click Me')]"));
		
		builder.doubleClick(ele1).perform();
		
	}

}
