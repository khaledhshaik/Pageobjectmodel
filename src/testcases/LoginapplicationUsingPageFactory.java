package testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import objectrepository.QedgeloginpageUsingPagefactory;
import objectrepository.SupplierpageUsingPageFactory;

public class LoginapplicationUsingPageFactory {
	
	@Test
	public  void Login() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Selenium softwares\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://webapp.qedgetech.com/login.php");
		
		QedgeloginpageUsingPagefactory qpf=new QedgeloginpageUsingPagefactory(driver);
		qpf.email().clear();
		qpf.email().sendKeys("admin");
		qpf.pwd().clear();
		qpf.pwd().sendKeys("master");
		qpf.clk().click();
		
		SupplierpageUsingPageFactory spf=new SupplierpageUsingPageFactory(driver);
		spf.supplier().click();
		spf.searchicon().click();
		Thread.sleep(3000);
		spf.searchbox().sendKeys("mobile");
		spf.search().click();
		
		driver.close();

	}

}
