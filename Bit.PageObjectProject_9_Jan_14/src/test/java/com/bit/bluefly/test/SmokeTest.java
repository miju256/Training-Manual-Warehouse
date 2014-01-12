package com.bit.bluefly.test;

import org.junit.Test;

import com.bit.bluefly.page.HomePage;
import com.bit.bluefly.page.ProductDetailPage;
import com.bit.bluefly.page.WomenPage;

public class SmokeTest extends BaseTest

{
	HomePage homePage;
	WomenPage womenPage;
	ProductDetailPage productDetailPage;

	@Test
	public void purchase() throws Exception
	{
		//Open any browser and go to www.bluefly.com
		homePage = new HomePage(driver);
		
		//Click Women link
		womenPage= homePage.clickWomanLink();
		
		//Click any product
		productDetailPage = womenPage.clickAnyProduct();
		
		
		
		
	}
	

	
	
	
}
