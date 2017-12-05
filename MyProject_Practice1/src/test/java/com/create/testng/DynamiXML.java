package com.create.testng;


import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.TestListenerAdapter;
import org.testng.TestNG;
import org.testng.annotations.Test;
import org.testng.xml.XmlClass;
import org.testng.xml.XmlSuite;
import org.testng.xml.XmlTest;

public class DynamiXML {

 @Test
    public void TCase() throws IOException
     {
  /*System.setProperty("webdriver.chrome.driver","D:\\CSProject\\MyProject_Practice\\drivers\\chromedriver.exe");
   ChromeDriver f = new ChromeDriver();
   f.get("http://www.monster.com");*/
  /* f.findElementById("f_id").sendKeys("uname");
   f.findElementById("f_pwd").sendKeys("pass");
   f.findElementByClassName("signin");*/
   XmlSuite suite = new XmlSuite();
   suite.setName("Functions");
   XmlTest test1 = new XmlTest(suite);
   test1.setName("TCase1");
  // suite.addTest(test1);
   List<XmlClass> classes = new ArrayList<XmlClass>();
   classes.add(new XmlClass("test.chet.TC01"));
   test1.setXmlClasses(classes);
   List<XmlSuite> suite_a = new ArrayList<XmlSuite>();
   
   suite_a.add(suite);
   
   
   
   FileWriter writer=new FileWriter("testng.xml");
   try {
	writer.write(suite.toXml());
	writer.flush();
	writer.close();
} catch (IOException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
   
   TestNG tng = new TestNG();
   //tng.setXmlSuites(suite_a);
   tng.run();
   
   
   
   /*XmlSuite suite = new XmlSuite();
   suite.setName("");
   
   XmlTest test = new XmlTest(suite);
   test.setName("Case1");
   List<XmlClass> classes = new ArrayList<XmlClass>();
   classes.add(new XmlClass("org.nitin.TCase1"));
   test.setXmlClasses(classes) ;
   List<XmlSuite> suites = new ArrayList<XmlSuite>();
   suites.add(suite);
   TestNG tng = new TestNG();
   tng.setXmlSuites(suites);
   tng.run();
 */

  }

}