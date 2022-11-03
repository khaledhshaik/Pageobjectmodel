package testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import objectrepository.Qedgeloginpage;
import objectrepository.Supplierpage;

public class Loginapplication {
	
	@Test
	public  void Login() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Selenium softwares\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://webapp.qedgetech.com/login.php");
		
		Qedgeloginpage qlp=new Qedgeloginpage(driver);
		qlp.email().clear();
		qlp.email().sendKeys("admin");
		qlp.pwd().clear();
		qlp.pwd().sendKeys("master");
		qlp.clk().click();
		
		Supplierpage sp=new Supplierpage(driver);
		sp.supplier().click();
		sp.searchicon().click();
		Thread.sleep(3000);
		sp.searchbox().sendKeys("mobile");
		sp.search().click();
		
		driver.close();

	}

}
