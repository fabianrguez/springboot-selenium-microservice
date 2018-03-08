package com.springboot.selenium.springbootselenium.platform;

import com.springboot.selenium.springbootselenium.dto.SearchDto;
import com.springboot.selenium.springbootselenium.platform.browser.BrowserActions;
import com.springboot.selenium.springbootselenium.platform.pages.search.SearchActions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GooglePage {

	private static final String GOOGLE_URL = "https://www.google.com";

	@Autowired
	private BrowserActions browserActions;

	@Autowired
	private SearchActions searchActions;

	public void performGoogleSearch(SearchDto search) throws InterruptedException {
		browserActions.openBrowser(search.getBrowser());
		initElements();
		browserActions.navigateTo(GOOGLE_URL);
		searchActions.search(search.getSearch());
		Thread.sleep(5000);
		browserActions.closeBrowser();
	}

	private void initElements() {
		searchActions.initElements();
	}
}
