package pkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alertpgm {
	
   WebDriver driver;
	
	@Before
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("file:///C:/Users/abdul/OneDrive/Desktop/web.html");
	}
	
	@Test
	public void test4()
	{
		driver.findElement(By.xpath("//input[1]")).click();
	 Alert a=driver.switchTo().alert();
	String alerttext= a.getText();
	a.accept();
	//a.dismiss();
		driver.findElement(By.xpath("//input[2]")).sendKeys("abdul");
		driver.findElement(By.xpath("//input[3]")).sendKeys("basith");
	}
	


}
