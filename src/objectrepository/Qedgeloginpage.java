package objectrepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Qedgeloginpage {
		
		WebDriver driver;
		public  Qedgeloginpage(WebDriver driver)
		{
			this.driver=driver;
		}

		By username=By.xpath("//*[@id=\"username\"]");
		By password=By.xpath("//*[@id=\"password\"]");
		By click=By.xpath("//*[@id=\"btnsubmit\"]");
		
		public WebElement email() 
		{
			return driver.findElement(username);
		}
		
		public WebElement pwd() 
		{
			return driver.findElement(password);
		}
		
		public WebElement clk()
		{
			return driver.findElement(click);
		}
		
	}
	
