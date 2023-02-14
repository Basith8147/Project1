package pkg;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Junitdemo {
      ChromeDriver driver;
	@Before
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
	}
	
	@Test
	public void test1()
	{
	String title=driver.getTitle();
	System.out.println(title);
	
	driver.findElement(By.name("//*[@type='text']")).sendKeys("ba_sith");
	driver.findElement(By.name("pass")).sendKeys("basith@12345");
	driver.findElement(By.name("login")).click();
	
	
	
	}
	
	//@After
	public void browserclose()
	{
		driver.quit();
	}
	
	
}
