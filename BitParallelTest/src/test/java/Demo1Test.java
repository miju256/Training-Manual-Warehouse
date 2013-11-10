import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;



public class Demo1Test extends BaseTest 
{

	
	@Test
	public void login()
	{
		driver.findElement(By.id("email")).sendKeys("asad@gmail.com");
	}
	
	@Test
	public void signup()
	{
		driver.findElement(By.id("u_0_0")).sendKeys("Asad");
		
	}

}
