package com.techbeetraining.ebaytest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumDriver {
	
	private String type = "";
	private String path = "";
	private WebDriver driver = null;
	
	public SeleniumDriver(String type, String path) {
		
		setPath(path);
		setType(type);
		setDriver();
	}

	public void setType(String type) {
		this.type = type;
	}
	
	public String getType() {
		return type;
	}
	
	public void setPath(String path) {
		this.path = path;
	}
	
	public String getPath() {
		return path;
	}
	
	public void setDriver() {
		
		final String [] drivers = new String[] {
			"webdriver.edge.driver", "webdriver.firefox.driver", "webdriver.chrome.driver"
		};
		
		if (type.equals("edge")){
			System.setProperty(drivers[0], path);
			driver = new EdgeDriver();
		}
		else if (type.equals("firefox")) {
			System.setProperty(drivers[1], path);
			driver = new FirefoxDriver();
		}
		else if (type.equals("chrome")){
			System.setProperty(drivers[2], path);
			driver = new ChromeDriver();
		}
	}
	
	public WebDriver getDriver() {
		return driver;
	}
	
	public String goTo(String path) {
		
		driver.get(path);

		return driver.getTitle();
	}
}