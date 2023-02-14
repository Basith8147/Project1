package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Passworderrorpage {
	
	WebDriver driver;
	
	By fbemail=By.id("identify_email");
	By fbsearch=By.name("did_submit");
	
	public Passworderrorpage(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void setvalues(String email)
	{
		driver.findElement(fbemail).sendKeys(email);
	}
	
	public void search()
	{
		driver.findElement(fbsearch).click();
	}
	
	
	
	
	

}
