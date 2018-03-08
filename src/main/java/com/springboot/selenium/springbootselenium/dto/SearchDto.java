package com.springboot.selenium.springbootselenium.dto;

import io.github.bonigarcia.wdm.DriverManagerType;

public class SearchDto {

	private String search;
	private DriverManagerType browser;

	public String getSearch() {
		return search;
	}

	public void setSearch(String search) {
		this.search = search;
	}

	public DriverManagerType getBrowser() {
		return browser;
	}

	public void setBrowser(DriverManagerType browser) {
		this.browser = browser;
	}
}
