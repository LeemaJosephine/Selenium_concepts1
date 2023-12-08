package day28;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

public class LaunchBrowser {

	public WebDriver driver;
	public String excelfile; 

	@Parameters({"browser","url"})
  @BeforeMethod
  public void lunchBroswer(String browser, String url) {
	  
	  // To launch the browser
	  
	  	ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		
		if(browser.equalsIgnoreCase("chrome")) {
			
		driver = new ChromeDriver(options);
		
		} else if (browser.equalsIgnoreCase("edge")) {
			
			driver = new EdgeDriver();
			
		} else if (browser.equalsIgnoreCase("firefox")) {
			
			driver= new FirefoxDriver();
			
		} else {
			
			driver = new ChromeDriver(options);
			
		}
		driver.manage().window().maximize();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	  
  }
	
	@DataProvider(name = "getData")
	public String[][] getData() throws IOException {
		
		String[][] data = ReadExcel.readExcel(excelfile);
		return data;
	}
  
  @AfterMethod   // To close the browser
  public void closeBrowser() {
	  
	  driver.close();
  }
  
  
  
 
 

}
