package com.seleniumFW.testBase;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestBase {
	
	WebDriver driver;
	
	public Properties OR;
	public File f1;
	public FileInputStream file;


	public void getBrowser(String browser) {
		
		System.out.println(System.getProperty("os.name"));
		if (System.getProperty("os.name").contains("Window")) {
			if (browser.equalsIgnoreCase("firefox")) {
				System.out.println(System.getProperty("user.dir"));
				System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"/drivers/geckodriver.exe");
				driver = new FirefoxDriver();
			}
			else if (browser.equalsIgnoreCase("chrome")) {
				System.out.println(System.getProperty("user.dir"));
				System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/drivers/chromedriver.exe");
				driver = new ChromeDriver();
			} 
		}
		
		else if (System.getProperty("os.name").contains("Mac")) {
			if (browser.equalsIgnoreCase("firefox")) {
				System.out.println(System.getProperty("user.dir"));
				System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"/drivers/geckodriver");
				driver = new FirefoxDriver();
			}
			else if (browser.equalsIgnoreCase("chrome")) {
				System.out.println(System.getProperty("user.dir"));
				System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/drivers/chromedriver");
				driver = new ChromeDriver();
				
			}
		}
	}
	
	public void loadPropertiesFile() throws IOException {
		OR = new Properties();
		
		//config.properties file loading
		f1 = new File(System.getProperty("user.dir")+"\\src\\main\\java\\com\\seleniumFW\\config\\config.properties");
		file = new FileInputStream(f1);
		OR.load(file);
		
		//OR.properties file loading
		f1 = new File(System.getProperty("user.dir")+"\\src\\main\\java\\com\\seleniumFW\\config\\OR.properties");
		file = new FileInputStream(f1);
		OR.load(file);
				
	}
	
	public void getScreenShot(String imageName) {
		
	}
	
	public void getpropertiesdata() {
		
	}
	
	public static void main(String[] args) throws IOException {
		TestBase test = new TestBase();
//		test.getBrowser("chrome");
		test.loadPropertiesFile();
		System.out.println(test.OR.getProperty("testname"));
		
	}

}
