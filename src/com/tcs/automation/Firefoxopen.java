package com.tcs.automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Firefoxopen {
	public static void main(String args[]) throws InterruptedException {
		WebDriver driver;
		System.setProperty("webdriver.gecko.driver","/Users/tibbsr2020/Documents/workspace-spring-tool-suite-4-4.5.0.RELEASE/Firefox/geckodriver");
		driver = new FirefoxDriver();

		driver.get("https://www.google.com/");
		Thread.sleep(5000);
		
		driver.close();
		driver.quit();
	}
}
				