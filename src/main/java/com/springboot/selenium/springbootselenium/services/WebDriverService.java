package com.springboot.selenium.springbootselenium.services;

import com.springboot.selenium.springbootselenium.platform.browser.BrowserTypes;
import io.github.bonigarcia.wdm.ChromeDriverManager;
import io.github.bonigarcia.wdm.FirefoxDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.springframework.stereotype.Service;

@Service
public class WebDriverService {

	private WebDriver driver;

	public WebDriver setupWebDriver(BrowserTypes browserTypes) {
		switch (browserTypes) {
			case CHROME:
				ChromeDriverManager.getInstance().setup();
				driver = new ChromeDriver();
				break;
			case FIREFOX:
				FirefoxDriverManager.getInstance().setup();
				driver = new FirefoxDriver();
			case CHROME_HEADLESS:
				ChromeOptions options = new ChromeOptions();
				options.addArguments("headless");
				ChromeDriverManager.getInstance().setup();
				driver = new ChromeDriver(options);
				break;
		}
		return driver;
	}

	public void navigate(String url) {
		maximizeWindow(driver);
		driver.navigate().to(url);
	}

	private void maximizeWindow(WebDriver driver) {
		driver.manage().window().maximize();
	}

	public void closeDriver() {
		if (driver != null) {
			driver.quit();
		}
	}

	public WebDriver getDriver() {
		return driver;
	}
}
