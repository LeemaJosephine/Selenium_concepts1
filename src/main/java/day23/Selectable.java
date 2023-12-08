package day23;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Selectable {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.navigate().to("https://jqueryui.com/selectable/");
		
		driver.manage().window().maximize();
		
		driver.switchTo().frame(0);
		
		WebElement item1 =driver.findElement(By.xpath("//li[text()='Item 1']"));
		WebElement item2 =driver.findElement(By.xpath("//li[text()='Item 2']"));
		WebElement item3 =driver.findElement(By.xpath("//li[text()='Item 3']"));
		WebElement item4 =driver.findElement(By.xpath("//li[text()='Item 4']"));
		WebElement item5 =driver.findElement(By.xpath("//li[text()='Item 5']"));
		WebElement item6 =driver.findElement(By.xpath("//li[text()='Item 6']"));
		WebElement item7 =driver.findElement(By.xpath("//li[text()='Item 7']"));
		
		Actions builder = new Actions(driver);
		//builder.clickAndHold(item1).moveToElement(item4).release().perform();
		
		builder.keyDown(Keys.CONTROL).click(item1).click(item3).click(item5).keyUp(Keys.CONTROL).perform();
		
		
	

	}

}
