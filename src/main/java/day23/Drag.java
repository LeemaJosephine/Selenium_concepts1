package day23;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Drag {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://jqueryui.com/draggable/");
		driver.manage().window().maximize();
		
		WebElement frame = driver.findElement(By.xpath("//iframe[@class=\"demo-frame\"]"));
		
		driver.switchTo().frame(0);  // By index
	
		WebElement drag = driver.findElement(By.xpath("//div[@id='draggable']"));
		
		System.out.println(drag.getLocation());
		
		Actions builder = new Actions(driver);
		builder.dragAndDropBy(drag, 100, 100).perform();
		
		System.out.println(drag.getLocation());
		
	}

}
