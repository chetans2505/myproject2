package test.chet;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TC09 {
public static void main(String[] args) {
	System.setProperty("webdriver.gecko.driver","D:\\chet1\\MyProject_Practice1\\drivers\\geckodriver.exe");
	System.out.println("sample");
	WebDriver driver=new FirefoxDriver();
	driver.get("http://www.google.com");
	driver.close();
}
}
