package objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class QedgeloginpageUsingPagefactory {
		
		WebDriver driver;
		public  QedgeloginpageUsingPagefactory(WebDriver driver)
		{
			this.driver=driver;
			PageFactory.initElements(driver,this);
		}
		
		@FindBy(xpath="//*[@id=\"username\"]")
		  WebElement username;
		
		@FindBy(xpath="//*[@id=\"password\"]")
		  WebElement password;
		
		@FindBy(xpath="//*[@id=\"btnsubmit\"]")
		WebElement click;
		
		public WebElement email() 
		{
			return username;
		}
		
		public WebElement pwd() 
		{
			return password;
		}
		
		public WebElement clk()
		{
			return click;
		}
		
	}
	
