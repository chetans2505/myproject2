package test.chet;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class TC01 {
	 WebDriver driver;

	@Test
	public void test2(){

		System.out.println("samp");
		System.setProperty("webdriver.chrome.driver","D:\\chet1\\MyProject_Practice1\\drivers\\chromedriver.exe");
		  driver = new ChromeDriver();
		   driver.get("http://www.monster.com");
		//driver=new FirefoxDriver();
		   driver.close();
	}
	
}
