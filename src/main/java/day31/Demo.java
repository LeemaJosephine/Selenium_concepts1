package day31;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {

	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver(); 
		driver.manage().window().maximize();
		driver.get("https://www.filemail.com/share/upload-file");
		driver.findElement(By.id("addBtn")).click();
		Thread.sleep(3000);
		//Runtime.getRuntime().exec("C:\\Users\\Admin\\Documents\\check\\upload.exe");
		Runtime.getRuntime().exec("D:\\auto\\upload.exe");
	}

}
