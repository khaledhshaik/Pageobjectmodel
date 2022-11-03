package objectrepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Mycontactformpage {
	
	WebDriver driver;
	public Mycontactformpage(WebDriver driver) {
		this.driver=driver;
		
	}
	  By username=By.id("user");
	  By password=By.id("pass");
	  By login=By.className("btn_log");
	  
	  public WebElement username() {
		 return driver.findElement(username);
	  }
	  public WebElement pwd() {
		  return driver.findElement(password);
	  }
	  public WebElement login() {
		  return driver.findElement(login);
	  }
}
