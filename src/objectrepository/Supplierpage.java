package objectrepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Supplierpage {
	
	WebDriver driver;
	public  Supplierpage(WebDriver driver) {
		this.driver=driver;
	}
		By supplier=By.id("mi_a_suppliers");
		By searchicon=By.xpath("//*[@id=\"ewContentColumn\"]/div[2]/div[2]/div/button/span");
		By searchbox=By.id("psearch");
		By search=By.id("btnsubmit");
		
		public WebElement supplier()
		{
			return driver.findElement(supplier);	
		}
		public WebElement searchicon()
		{
			return driver.findElement(searchicon);
		}
		public WebElement searchbox()
		{
			return driver.findElement(searchbox);
		}
		public WebElement search()
		{
			return driver.findElement(search);
		}

}
