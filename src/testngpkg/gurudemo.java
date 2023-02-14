package testngpkg;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class gurudemo {
	
	WebDriver driver;
	
	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();
	}
	@Test
	public void test3()
	{
		driver.get("https://demo.guru99.com/popup.php");
		String parentwindow=driver.getWindowHandle();
		driver.findElement(By.xpath("/html/body/p/a")).click();
		
		Set<String> allwindowhandles=driver.getWindowHandles();
		
		for(String handle :allwindowhandles)
		{
			System.out.println(handle);
			
			if(handle.equalsIgnoreCase(parentwindow))
			{
				driver.switchTo().window(handle);
				driver.findElement(By.xpath("/html/body/form/table/tbody/tr[5]/td[2]/input")).sendKeys("basith@4566gmail.com",Keys.ENTER);
				driver.close();
			}
			driver.switchTo().window(parentwindow);
		}
		
		
	}
	
	
	

}
