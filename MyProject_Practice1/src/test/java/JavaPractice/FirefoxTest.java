package JavaPractice;

import org.openqa.selenium.firefox.FirefoxDriver;

public class FirefoxTest {
	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","D:\\chet1\\MyProject_Practice1\\drivers\\geckodriver.exe");
		FirefoxDriver f=new FirefoxDriver();
		f.get("http://www.google.com");
		f.close();
	}

}
