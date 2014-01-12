package com.bit.bluefly.page;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WomenPage 
{
	FirefoxDriver driver;
	
	public WomenPage(FirefoxDriver driver)
	{
		this.driver = driver;
	}
	
	public ProductDetailPage clickAnyProduct()
	{
		driver.findElement(By.xpath("//div[@class='crosssellProd']//a[contains(@href,'323795501')]")).click();
		return new ProductDetailPage(driver);
	}

}
