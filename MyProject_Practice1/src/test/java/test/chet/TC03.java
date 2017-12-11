package test.chet;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TC03 {
	
	 WebDriver driver;
	 @Parameters({"browser"})
	@Test
	public void test2(String browser){
		 if(browser.equalsIgnoreCase("firefox")){
			System.out.println(browser+" browser version is not compatible "); 
		 }
		 else{
		System.out.println("samp");
		System.setProperty("webdriver.chrome.driver","D:\\chet1\\MyProject_Practice1\\drivers\\chromedriver.exe");
		  driver = new ChromeDriver();
		   driver.get("http://www.monster.com");
		//driver=new FirefoxDriver();
		   driver.close();
		 }
	}
}
