package day32;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoItDemo1 {

	public static void main(String[] args) throws IOException, InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://altoconvertpdftojpg.com/");
		
		driver.findElement(By.id("browse")).click();
		Thread.sleep(3000);
		Runtime.getRuntime().exec("D:\\AutoItScript\\firstscript.exe");
		
		
	}

}
