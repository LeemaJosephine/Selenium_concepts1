package day23;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDrop {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://jqueryui.com/droppable/");
		driver.manage().window().maximize();
		
		driver.switchTo().frame(0);
		
		WebElement scource = driver.findElement(By.id("draggable"));
		WebElement dest = driver.findElement(By.id("droppable"));
		
		Actions builder = new Actions(driver);
		builder.dragAndDrop(scource, dest).perform();
		
		System.out.println(dest.getCssValue("width"));
		
		
		
		
		

	}

}
