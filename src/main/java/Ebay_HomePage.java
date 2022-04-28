package com.techbeetraining.ebaytest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import java.awt.Toolkit;
import java.io.File;

public class Ebay_HomePage {

	public Ebay_HomePage() {
		
		String xpath_Home = "/html/body/div[5]/div[1]/ul/li[1]/a";
		String xpath_Saved = "/html/body/div[5]/div[1]/ul/li[2]/a";
		String xpath_Motors = "/html/body/div[5]/div[1]/ul/li[3]/a";
		String xpath_Motors_dropDown = "/html/body/div[5]/div[1]/ul/li[13]/div[2]/a[1]";
		String xpath_Fashion = "/html/body/div[5]/div[1]/ul/li[4]/a";
		String xpath_Fashion_dropDown = "/html/body/div[5]/div[1]/ul/li[13]/div[2]/a[2]";
		String xpath_Electronics = "/html/body/div[5]/div[1]/ul/li[5]/a";
		String xpath_Electronics_dropDown = "/html/body/div[5]/div[1]/ul/li[13]/div[2]/a[3]";
		String xpath_CollectiblesandArt = "/html/body/div[5]/div[1]/ul/li[6]/a";
		String xpath_CollectiblesandArt_dropDown = "/html/body/div[5]/div[1]/ul/li[13]/div[2]/a[4]";
		String xpath_HomeandGarden = "/html/body/div[5]/div[1]/ul/li[7]/a";
		String xpath_HomeandGarden_dropDown = "/html/body/div[5]/div[1]/ul/li[13]/div[2]/a[5]";
		String xpath_SportingGoods = "/html/body/div[5]/div[1]/ul/li[8]/a";
		String xpath_SportingGoods_dropDown = "/html/body/div[5]/div[1]/ul/li[13]/div[2]/a[6]";
		String xpath_Toys = "/html/body/div[5]/div[1]/ul/li[9]/a";
		String xpath_Toys_dropDown = "/html/body/div[5]/div[1]/ul/li[13]/div[2]/a[7]";
		String xpath_BusinessandIndustrial = "/html/body/div[5]/div[1]/ul/li[10]/a";
		String xpath_BusinessandIndustrial_dropDown = "/html/body/div[5]/div[1]/ul/li[13]/div[2]/a[8]";
		String xpath_Music = "/html/body/div[5]/div[1]/ul/li[11]/a";
		String xpath_Music_dropDown = "/html/body/div[5]/div[1]/ul/li[13]/div[2]/a[9]";
		String xpath_eBayRefurbished = "/html/body/div[5]/div[1]/ul/li[12]/a";
		String xpath_eBayRefurbished_dropDown = "/html/body/div[5]/div[1]/ul/li[13]/div[2]/a[10]";
		String xpath_More = "/html/body/div[5]/div[1]/ul/li[13]";

		SeleniumDriverFunctionality function = new SeleniumDriverFunctionality(new SeleniumDriver("edge", new File(SeleniumDriver.class.getResource("").getPath()).getParentFile().getParentFile().getParentFile().getParentFile().getParentFile().toString() + "/target/main/resources/" + "edgedriver.exe"));
		
		function.setWait(new WebDriverWait(function.getSeleniumDriver().getDriver(), 2000L));
		
		function.goToURL("https://www.ebay.com/");
			
		if (function.findDisplayed(xpath_Toys) == false) {
			function.hover(xpath_More);
			function.clickOn(xpath_Toys_dropDown);
		}
		else {
			function.clickOn(xpath_Toys);
		}	

		//function.getSeleniumDriver().getDriver().quit();
	}
 }