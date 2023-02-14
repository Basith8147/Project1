package testngpkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Testngdemo {
	WebDriver driver;
	
	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();
	}

	@BeforeMethod
	public void urlloading()
	{
		driver.get("https://www.google.co.in/");
	}
	
	@Test(priority=1,invocationCount=3)
	public void titleverification()
	{
		String title=driver.getTitle();
		String exp="google";
	
	
	if(title.equalsIgnoreCase(exp))
	{
		System.out.println("pass");
	}
	else
	{
		System.out.println("fail");
	}


	}
	@Test(priority=2,invocationCount=2)
	public void pagesource()
	{
String source=driver.getPageSource();
		
		if(source.contains("Images"))
		{
			System.out.println("text is present");
			
		}
		else
		{
			System.out.println("text is not present");
		}
	}
}
