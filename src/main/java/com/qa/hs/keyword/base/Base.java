package com.qa.hs.keyword.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

/**
 * 
 * @author Anuradha
 * Code for driver execution
 * and initialization of driver and properties
 *
 */
public class Base {

	public WebDriver driver;
	public Properties prop;
	
	//code to initialize driver
	public WebDriver initDriver(String browserName) {
		if(browserName.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "D:\\chromedriver\\chromedriver.exe");
			if(prop.getProperty("headless").equals("yes")) {
				//headless mode:
				ChromeOptions options = new ChromeOptions();
				options.addArguments("--headless");
				driver = new ChromeDriver(options);
			} else {
				driver = new ChromeDriver();
			}
		}
		return driver;
	}
	
	//code to initialize properties
	public Properties initProperties() {
		prop = new Properties();
		try {
			FileInputStream ip = new FileInputStream("D:\\Selenium_workspace\\KeywordDrivenHubSpot\\"
									+ "src\\main\\java\\com\\qa\\hs\\keyword\\config\\config.properties");
			prop.load(ip);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		return prop;
	}

}
