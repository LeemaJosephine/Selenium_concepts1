package day21;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserCommands {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String appURL ="https://www.google.co.in/";
		WebDriver driver= new ChromeDriver();
		driver.get(appURL);
		driver.manage().window().maximize();
		
		String title =driver.getTitle();
		int titlelength = title.length();
		
		System.out.println("Page Title is " + title);
		System.out.println("Length of the title is " + titlelength);
		
		String currentURL = driver.getCurrentUrl();
		
		if(currentURL.equals(appURL)) {
			
			System.out.println("Correct page displayed");
		} else {
			
			System.out.println("Page loaded incorrectly");
		}
		
		String pagesource = driver.getPageSource();
		int pagesourcelength = pagesource.length();
		
		//System.out.println(pagesource);
		System.out.println(pagesourcelength);
		
		driver.close();
	}

}
