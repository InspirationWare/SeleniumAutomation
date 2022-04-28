package com.techbeetraining.ebaytest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import java.awt.Toolkit;

public class SeleniumDriverFunctionality {

	private SeleniumDriver seleniumDriver = null;
	private WebDriverWait wait = null;
	private WebElement element = null;
	private Actions action = null;
	
	public SeleniumDriverFunctionality() {
	}

	public SeleniumDriverFunctionality(SeleniumDriver seleniumDriver) {
	
		setSeleniumDriver(seleniumDriver);
	}
	
	public void setWait(WebDriverWait wait) {
		this.wait = wait;
	}
	
	public WebDriverWait getWait() {
		return wait;
	}
	
	public void setSeleniumDriver(SeleniumDriver seleniumDriver) {
		this.seleniumDriver = seleniumDriver;
	}
	
	public SeleniumDriver getSeleniumDriver() {
		return seleniumDriver;
	}
	
	public void setBrowserFullScreen() {	
		java.awt.Dimension dimension = Toolkit.getDefaultToolkit().getScreenSize();
		seleniumDriver.getDriver().manage().window().setSize(new org.openqa.selenium.Dimension((int)dimension.getWidth(), (int)dimension.getHeight()));
	}
	
	public void goToURL(String address) {
		seleniumDriver.getDriver().get(address);
	}

	public boolean findDisplayed(String xpath) {
		element = seleniumDriver.getDriver().findElement(By.xpath(xpath));
		return element.isDisplayed();
	}
	
	public void clickOn(String xpath) {
		element = seleniumDriver.getDriver().findElement(By.xpath(xpath));
		wait.until(ExpectedConditions.visibilityOf(element));
		element.click();
	}
	
	public void hover(String xpath) {
		action = new Actions(seleniumDriver.getDriver());
		element = seleniumDriver.getDriver().findElement(By.xpath(xpath));
		wait.until(ExpectedConditions.visibilityOf(element));
		action.moveToElement(element).perform();
	}
 }