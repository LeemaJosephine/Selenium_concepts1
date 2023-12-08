package day28;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class AddItem extends LaunchBrowser{
  @Test
  public void addItem() {

		driver.findElement(By.xpath("(//a[contains(text(),'Computers')])[3]")).click();
		driver.findElement(By.xpath("(//a[contains(text(),'Desktops')])[4]")).click();
		
		WebElement sort = driver.findElement(By.xpath("//select[@id='products-orderby']"));
		Select select = new Select(sort);
		select.selectByVisibleText("Price: High to Low");
		
		WebElement display = driver.findElement(By.xpath("//select[@id='products-pagesize']"));
		Select select1 = new Select(display);
		select1.selectByVisibleText("4");
		
		WebElement list = driver.findElement(By.xpath("//select[@id='products-viewmode']"));
		Select select2 = new Select(list);
		select2.selectByVisibleText("List");
		
		WebElement comp = driver.findElement(By.xpath("(//input[@value='Add to cart'])[3]"));
		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", comp);
		WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf(comp));
		comp.click();
		
		driver.findElement(By.xpath("//label[contains(text(),'Fast')]")).click();
		driver.findElement(By.xpath("//label[contains(text(),'4 GB')]")).click();
		driver.findElement(By.xpath("//label[contains(text(),'400 GB')]")).click();
		driver.findElement(By.xpath("//input[@id='add-to-cart-button-72']")).click();
		
		driver.findElement(By.xpath("//span[text()='Shopping cart']")).click();
		driver.findElement(By.xpath("//input[@id='termsofservice']")).click();
		
		driver.findElement(By.id("checkout")).click();
		
		WebElement newAdd = driver.findElement(By.id("billing-address-select"));
		Select add = new Select(newAdd);
		add.selectByVisibleText("New Address");
		WebElement coun = driver.findElement(By.id("BillingNewAddress_CountryId"));
		Select country= new Select(coun);
		country.selectByVisibleText("India");
		
		driver.findElement(By.id("BillingNewAddress_City")).sendKeys("Chennai");
		driver.findElement(By.id("BillingNewAddress_Address1")).sendKeys("101/A");
		driver.findElement(By.id("BillingNewAddress_ZipPostalCode")).sendKeys("600012");
		driver.findElement(By.id("BillingNewAddress_PhoneNumber")).sendKeys("987654321");
		driver.findElement(By.xpath("(//input[@value='Continue'])[1]")).click();
		driver.findElement(By.xpath("(//input[@value='Continue'])[2]")).click();
		driver.findElement(By.xpath("(//input[@value='Continue'])[3]")).click();
		driver.findElement(By.xpath("//label[text()='Purchase Order']")).click();
		driver.findElement(By.xpath("(//input[@value='Continue'])[4]")).click();
		driver.findElement(By.id("PurchaseOrderNumber")).sendKeys("123654789");
		driver.findElement(By.xpath("(//input[@value='Continue'])[5]")).click();
		driver.findElement(By.xpath("//input[@value='Confirm']")).click();
		
		driver.findElement(By.xpath("//a[text()='Log out']")).click();
	
	  
  }
  
}
