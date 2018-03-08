package com.springboot.selenium.springbootselenium.platform.pages.search;

import com.springboot.selenium.springbootselenium.platform.browser.BrowserActions;
import com.springboot.selenium.springbootselenium.services.WebDriverService;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;


@Component
public class SearchActions {

	@Autowired
	private WebDriverService webDriverService;

	@Autowired
	private BrowserActions browserActions;

	private SearchPage searchPage;

	public void initElements() {
		searchPage = PageFactory.initElements(webDriverService.getDriver(), SearchPage.class);
	}

	public void search(String search) {
		browserActions.waitForElementToBeVisible(searchPage.searchInput);
		searchPage.searchInput.sendKeys(search);
		searchPage.searchInput.sendKeys(Keys.ENTER);
	}
}
