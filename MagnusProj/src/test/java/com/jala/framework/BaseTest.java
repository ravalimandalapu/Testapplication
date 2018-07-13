package com.jala.framework;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import com.jala.pageobjects.PageActions;
import com.jala.pageobjects.PageObjects;

public class BaseTest {
WebDriver driver;


public PageActions pageObj;
public String adminusername;
public String adminpassword;
public static String URL = "http://magnus2.jalatechnologies.com/";
public static String driverPath = "chromedriver.exe";
public Logger log = Logger.getLogger("devpinoyLogger");

	
	@BeforeClass
	public void setupApplication()
	{
		Reporter.log("=====Browser Session Started=====", true);
		
		System.setProperty("webdriver.chrome.driver", driverPath);
		driver = new ChromeDriver();
		
       //	driver.manage().window().maximize();
		
		driver.get(URL);
		
		Reporter.log("=====Application Started=====", true);
		
		System.out.println("Application launched successfully");

		// Page Object initilization
		pageObj = new PageActions(driver);
	}
	
	public void loginAdmin() {

		Properties prop= new Properties();
		
		InputStream input = null;

		try {

			input = new FileInputStream("config.properties");

			// load a properties file
			prop.load(input);
			System.out.println(prop.getProperty("adminusername"));
			System.out.println(prop.getProperty("adminpassword"));
			
			
			log.info("*************** Read values from config file **************");
		}
	catch (IOException ex) {
		ex.printStackTrace();
	
	}	
	}
	
	@AfterClass
	public void closeApplication()
	{
		//driver.quit();
		Reporter.log("=====Browser Session End=====", true);
		
	}
	
	
	

}
