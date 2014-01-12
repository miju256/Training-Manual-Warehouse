package com.bit.bluefly.page;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HomePage 

{
	private FirefoxDriver driver;
	
	public HomePage(FirefoxDriver driver)
	{
		this.driver = driver;
		driver.get("http://www.bluefly.com");
	}
	
	public WomenPage clickWomanLink() throws Exception
	{
		driver.findElement(By.xpath("//li[@id='main-nav-woman']/a")).click();
		Thread.sleep(3000);
		return new WomenPage(driver);
	}
}
