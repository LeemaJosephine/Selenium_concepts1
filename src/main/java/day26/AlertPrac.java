package day26;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertPrac {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.navigate().to("https://demo.automationtesting.in/Alerts.html");
		
		driver.manage().window().maximize();
		
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

		driver.findElement(By.xpath("//button[@class='btn btn-danger']")).click();
		
		Alert alert = driver.switchTo().alert();
		System.out.println(alert.getText());
		alert.accept();
		
		//driver.switchTo().alert().accept(); 
		
		driver.findElement(By.xpath("//a[text()='Alert with OK & Cancel ']")).click();
		driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
		
		driver.switchTo().alert().dismiss();
		
		String text = driver.findElement(By.xpath("//p[@id='demo']")).getText();
		System.out.println(text);
		
		driver.findElement(By.xpath("//a[text()='Alert with Textbox ']")).click();
		driver.findElement(By.xpath("//button[@class='btn btn-info']")).click();
		
		String exepected ="This is sample";
		Alert alert2 = driver.switchTo().alert();
		alert2.sendKeys(exepected);
		alert2.accept();
		
		String actual = driver.findElement(By.xpath("//p[@id='demo1']")).getText();
		if(actual.contains(exepected)) {
			
			System.out.println("Alert handled");
			
		} else {
			
			System.out.println("Alert not handled");
			
		}
	}

}
