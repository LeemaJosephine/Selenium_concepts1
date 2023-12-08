package day28;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class LearnAttributes {
	
  @Test(enabled  = false)
  public void createLead() {
	  
	  System.out.println("Create Lead");
	  
  }
  
 
  @Test(invocationCount = 3, invocationTimeOut = 3000, threadPoolSize = 2, enabled  = false)
  public void editLead() throws InterruptedException {
	  
	  //Thread.sleep(3000);
	  System.out.println("Edit Lead");
	  
  }
  
  @Test(priority = 1, enabled  = false)
  public void deleteLead() {
	  
	  System.out.println("Delete Lead");
	  
  }
  
  
  @Test(timeOut = 3000)
  public void loginFb() throws InterruptedException {
	  
	  Thread.sleep(3000);
	  System.out.println("Login");
	  //throw new RuntimeException("Exception occured");
	  
  }
  
  @Test(dependsOnMethods = {"loginFb"}, alwaysRun = true)
  public void feedFb() {
	  
	  System.out.println("Feed");
	  
  }
  
  
  
  
  
  
}
