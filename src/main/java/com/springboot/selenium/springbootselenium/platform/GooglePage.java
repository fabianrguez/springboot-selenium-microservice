package com.springboot.selenium.springbootselenium.platform;

import com.springboot.selenium.springbootselenium.dto.SearchDto;
import com.springboot.selenium.springbootselenium.platform.browser.BrowserActions;
import com.springboot.selenium.springbootselenium.platform.pages.search.SearchActions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GooglePage {

	private static final Logger log = LoggerFactory.getLogger(GooglePage.class);
	private static final String GOOGLE_URL = "https://www.google.com";

	@Autowired
	private BrowserActions browserActions;

	@Autowired
	private SearchActions searchActions;

	public void performGoogleSearch(SearchDto search) throws InterruptedException {
		log.info("Abriendo navegador");
		browserActions.openBrowser(search.getBrowser());
		initElements();
		browserActions.navigateTo(GOOGLE_URL);
		searchActions.search(search.getSearch());
		log.info("buscando en google " + search.getSearch());
		Thread.sleep(5000);
		browserActions.closeBrowser();
		log.info("navegador cerrado");
	}

	private void initElements() {
		searchActions.initElements();
	}
}
