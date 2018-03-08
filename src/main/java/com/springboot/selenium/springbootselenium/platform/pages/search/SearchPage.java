package com.springboot.selenium.springbootselenium.platform.pages.search;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchPage {

	@FindBy(id = "lst-ib")
	public WebElement searchInput;
}
