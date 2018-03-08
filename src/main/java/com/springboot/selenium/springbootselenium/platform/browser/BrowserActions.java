package com.springboot.selenium.springbootselenium.platform.browser;

import com.springboot.selenium.springbootselenium.services.WebDriverService;
import com.springboot.selenium.springbootselenium.services.WebDriverWaitService;
import io.github.bonigarcia.wdm.DriverManagerType;
import org.openqa.selenium.WebElement;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BrowserActions {

	@Autowired
	private WebDriverService webDriverService;

	@Autowired
	private WebDriverWaitService webDriverWaitService;

	public void openBrowser(DriverManagerType browser) {
 		webDriverService.setupWebDriver(browser);
	}

	public void navigateTo(String url) {
		webDriverService.navigate(url);
	}

	public void closeBrowser() {
		webDriverService.closeDriver();
	}

	public void waitForElementToBeVisible(WebElement element) {
		webDriverWaitService.waitForVisible(element, 20);
	}
}
