package day25;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class RadioButton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		
		driver.navigate().to("https://demoqa.com/radio-button");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		List<WebElement> radioOptions = driver.findElements(By.xpath("//input[@type='radio']"));
		
		for(WebElement ele : radioOptions) {
			
			String result = ele.getAttribute("id");
			
			if(result.equals("impressiveRadio")) {
				
				Actions builder = new Actions(driver);
				builder.click(ele).perform();
				
				boolean selected =ele.isSelected();
			
				if(selected==true) {
					
					System.out.println("Impressive is selected");
				} else {
					
					System.out.println("Impressive not selected");
				}
			}
			
		}
		
		
//		//Store in webelement
//		WebElement radio = driver.findElement(By.id("yesRadio"));
//		
//		//Declare Actions class
//		Actions builder = new Actions(driver);
//		
//		//click the element using Actions obj.
//		
//		builder.click(radio).perform();
//		
		
		driver.close();
//		//driver.findElement(By.xpath("//label[@for='yesRadio']")).click();
	}

}
