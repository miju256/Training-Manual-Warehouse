import org.testng.annotations.Test;


public class Demo2Test extends BaseTest 
{
	@Test
	public void upload()
	{
		driver.get("http://www.google.com");
		
	}
	@Test
	public void chat()
	{
		driver.get("http://www.aol.com");
		
	}

}
