package testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import objectrepository.Mycontactformpage;

public class Mycontactformlogin {

	@Test
	public void Login() {
		System.setProperty("webdriver.chrome.driver","C:\\Selenium softwares\\drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.mycontactform.com/");
		Mycontactformpage mcf=new Mycontactformpage(driver);
		mcf.username().sendKeys("admin");
		mcf.pwd().sendKeys("admin123");
		mcf.login().click();
		driver.close();
	}
        
}
