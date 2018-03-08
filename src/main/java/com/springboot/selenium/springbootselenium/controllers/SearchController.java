package com.springboot.selenium.springbootselenium.controllers;

import com.springboot.selenium.springbootselenium.dto.SearchDto;
import com.springboot.selenium.springbootselenium.platform.GooglePage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SearchController {

	@Autowired
	private GooglePage googlePage;

	@PostMapping(path = "/search")
	public void launchChrome(@RequestBody SearchDto search) throws InterruptedException {
		googlePage.performGoogleSearch(search);
	}
}
