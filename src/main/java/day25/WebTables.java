package day25;

import java.time.Duration;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTables {

	public static void main(String[] args) {
		
WebDriver driver = new ChromeDriver();
		
		driver.navigate().to("https://www.chittorgarh.com/report/stock-nse-bulk-deals/119/");
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		// The coulumn count
		
//	List<WebElement> columnCount = driver.findElements(By.xpath("(//table)[1]//th"));
//		System.out.println("The column count is " + columnCount.size());
		
		List<WebElement> rowCount = driver.findElements(By.xpath("(//table)[2]//tr"));
		System.out.println("The row count is " + rowCount.size());
		
		int size = rowCount.size();
		
		List<WebElement> rowData = driver.findElements(By.xpath("(//table)[2]//tr//th"));
		
		for(int i =0; i < rowData.size();i++) {
						System.out.println(rowData.get(i).getText());
			
		}
		
		List<WebElement> names = driver.findElements(By.xpath("//table[contains(@class,'table table-bordered table')]//tr//td[1]"));
		System.out.println("Original list " +names.size());
		
		Set<WebElement> dup = new LinkedHashSet<>(names);
		
		System.out.println("Second list " +dup.size());
		
		if(names.size()== dup.size()) {
			
			System.out.println("No duplicates");
		} else {
			
			System.out.println("Duplicates present");
		}
		
			
		
		
	}

}
