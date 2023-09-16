package com.firstcry.teststeps;

import org.openqa.selenium.chrome.ChromeDriver;

import pageFactory.AddToCartPage;
import utils.Tools;

public class Driver extends Tools{
	
	protected static AddToCartPage addToCartPage;
	
	public static void init() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\admin\\Downloads\\chromedriver-win32\\chromedriver.exe");
		driver = new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.get("https://www.firstcry.com/");
	    addToCartPage = new AddToCartPage(driver);
	}

}
