package test.chet;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class TC02 {
	
	@Test
	public void test2(){
		System.out.println("TC02");
		System.setProperty("webdriver.chrome.driver","D:\\chet1\\MyProject_Practice1\\drivers\\chromedriver.exe");
		  ChromeDriver driver = new ChromeDriver();
		   driver.get("http://www.monster.com");
		//driver=new FirefoxDriver();
		   driver.close();
	}

}
