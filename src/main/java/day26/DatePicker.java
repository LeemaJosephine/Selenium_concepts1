package day26;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePicker {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		String month = null;
		String expMonth ="June 2024";
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.phptravels.net/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.id("departure")).click();
		
		
		while(true) {
	
			month = driver.findElement(By.xpath("((//table)[7]//tr//th[2])[1]")).getText();
			if(month.equals(expMonth)) {
				
				break;
			} else {
				
				driver.findElement(By.xpath("((//table)[7]//tr//th[3])[1]")).click();
			}
			
		}
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("((//table)[7]//tr//td[text()='1'])[1]")).click();
		
	}

}
