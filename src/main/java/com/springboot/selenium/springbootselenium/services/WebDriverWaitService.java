package com.springboot.selenium.springbootselenium.services;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class WebDriverWaitService {

	@Autowired
	private WebDriverService webDriverService;

	private WebDriverWait wait(int seconds) {
		return new WebDriverWait(webDriverService.getDriver(), seconds);
	}

	public void waitForVisible(WebElement element, int seconds) {
		wait(seconds).until(ExpectedConditions.visibilityOf(element));
	}
}
