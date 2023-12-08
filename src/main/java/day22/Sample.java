package day22;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Sample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		
		//driver.get("");
		//driver.navigate().to("https://demoqa.com/sortable");
		
		
		
//		WebElement drag = driver.findElement(By.id("draggable"));
//		
//		WebElement drop = driver.findElement(By.id("droppable"));
//		
//		Actions builder = new Actions(driver);
//		builder.dragAndDrop(drag, drop).perform();
//		
//		System.out.println(drop.getCssValue("background-color"));
		
//		WebElement drop = driver.findElement(By.id("dragBox"));
//	
//		Actions builder = new Actions(driver);
//		builder.dragAndDropBy(drop, 100, 100).perform();
		
		driver.get("https://jqueryui.com/selectable/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.switchTo().frame(0);
				

		WebElement item1 = driver.findElement(By.xpath("//li[text()='Item 1']"));
		WebElement item2 = driver.findElement(By.xpath("//li[text()='Item 2']"));
		WebElement item3 = driver.findElement(By.xpath("//li[text()='Item 3']"));
		WebElement item4 = driver.findElement(By.xpath("//li[text()='Item 4']"));
		WebElement item5 = driver.findElement(By.xpath("//li[text()='Item 5']"));

		Actions builder=new Actions(driver);
		
		builder.clickAndHold(item1).moveToElement(item5).release().perform();
		
		//builder.keyDown(Keys.CONTROL).click(item1).click(item2).click(item4).keyUp(Keys.CONTROL).perform();

		
		
	}

}
