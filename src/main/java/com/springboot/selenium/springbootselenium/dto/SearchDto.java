package com.springboot.selenium.springbootselenium.dto;

import com.springboot.selenium.springbootselenium.platform.browser.BrowserTypes;

public class SearchDto {

	private String search;
	private BrowserTypes browser;

	public String getSearch() {
		return search;
	}

	public void setSearch(String search) {
		this.search = search;
	}

	public BrowserTypes getBrowser() {
		return browser;
	}

	public void setBrowser(BrowserTypes browser) {
		this.browser = browser;
	}
}
