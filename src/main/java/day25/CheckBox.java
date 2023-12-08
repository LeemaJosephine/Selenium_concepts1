package day25;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class CheckBox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		
		driver.navigate().to("https://demoqa.com/automation-practice-form");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		List<WebElement> checkBox = driver.findElements(By.xpath("//input[@type='checkbox']"));
		
		for(WebElement check : checkBox) {
			
			String result = check.getAttribute("id");
			
			if(result.equals("hobbies-checkbox-2")) {
				
				Actions builder = new Actions(driver);
				builder.moveToElement(check).click().perform();
				//builder.click(check).perform();   //Selecting the option
				System.out.println("Selected");
				
				if(check.isSelected()) {  // whether the option is selected 
					
					builder.click(check).perform(); // if it's selected, then deselect
					System.out.println("Deselected");
				}
			}
			
		}
		
	}

}
