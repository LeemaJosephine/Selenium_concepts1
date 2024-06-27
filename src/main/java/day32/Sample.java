package day32;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Sample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver drive = new ChromeDriver();
		drive.get("https://www.spicejet.com/");
		drive.findElement(By.xpath("(//div[@class='r-1862ga2 r-1loqt21 r-1enofrn r-tceitz r-u8s1d css-76zvg2'])[1]")).sendKeys("Delhi");
		drive.findElement(By.xpath("(//div[@class='r-1862ga2 r-1loqt21 r-1enofrn r-tceitz r-u8s1d css-76zvg2'])[2]")).sendKeys("Chennai");
		
		
	}

}
