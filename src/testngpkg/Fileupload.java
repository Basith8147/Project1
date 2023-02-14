package testngpkg;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Fileupload {
	
	WebDriver driver;
	
	@BeforeTest
	public void setup()
	{
		driver=new ChromeDriver();
	}
	
	@Test
	public void file() throws IOException
	{
		driver.get("https://www.ilovepdf.com/word_to_pdf");
		//driver.findElement(By.xpath("//*[@id=\"uploadfile_0\"]")).sendKeys("\"C:\\Users\\abdul\\Downloads\\Pramod's Resume 2021.pdf\"");
		driver.findElement(By.xpath("//*[@id=\"pickfiles\"]/span")).click();
		Runtime.getRuntime().exec("\"C:\\Users\\abdul\\OneDrive\\Documents\\T1.exe\"");
		
	}
	
	
	
	

}
