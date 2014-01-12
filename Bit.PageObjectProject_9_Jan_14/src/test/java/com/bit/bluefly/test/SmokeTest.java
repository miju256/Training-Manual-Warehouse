package com.bit.bluefly.test;

import org.junit.Test;

import com.bit.bluefly.page.HomePage;

public class SmokeTest extends BaseTest

{

	@Test
	public void purchase()
	{
		HomePage homePage = new HomePage(driver);
		homePage.clickWomanLink();
		
	}
	
/*@Test
	public void addToCart()
	{
	HomePage homePage = new HomePage(driver);
	
	}*/
	
	
	
}
