package testngpkg;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class parametrization {
	WebDriver driver;
	
	@BeforeTest
	public void setip()
	{
		driver=new ChromeDriver();
	}
	@Parameters("searchvalue")
	@Test
	public void test1(String s)
	{
		driver.get("https://www.google.co.in/");
		driver.findElement(By.name("q")).sendKeys(s,Keys.ENTER);
	}

}
