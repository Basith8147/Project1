package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.Passworderrorpage;

public class Passworderrortest {
	
	WebDriver driver;
	String baseurl="https://www.facebook.com/login/identify/?ctx=recover&ars=facebook_login&from_login_screen=0";
	
	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();
	}
	
	@BeforeMethod
	public void url()
	{
		driver.get(baseurl);
	}
	
	@Test
	public void pswrderror()
	{
		Passworderrorpage ob=new Passworderrorpage(driver);
		ob.setvalues("basi@124");
		ob.search();
	}
	
	

}
