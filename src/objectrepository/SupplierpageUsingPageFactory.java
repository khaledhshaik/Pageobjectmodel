package objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SupplierpageUsingPageFactory {
	
	WebDriver driver;
	public  SupplierpageUsingPageFactory(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
		 
	
	    @FindBy(id="mi_a_suppliers")
	    WebElement supplier;
	    
	    @FindBy(xpath="//*[@id=\"ewContentColumn\"]/div[2]/div[2]/div/button/span")
	    WebElement searchicon;
	    
	    @FindBy(id="psearch")
	    WebElement searchbox;
	    
	    @FindBy(id="btnsubmit")
	    WebElement search;
	    
		
		public WebElement supplier()
		{
			return supplier;	
		}
		public WebElement searchicon()
		{
			return searchicon;
		}
		public WebElement searchbox()
		{
			return searchbox;
		}
		public WebElement search()
		{
			return search;
		}

}
