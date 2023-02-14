package pkg;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		driver.findElement(By.xpath("//*[@name='field-keywords']")).sendKeys("mobiles",Keys.ENTER);
		driver.findElement(By.xpath("//*[@id='nav-xshop']/a[4]")).click();
		driver.findElement(By.xpath("//*[@id='nav-cart-count']")).click();
		driver.findElement(By.xpath("//*[@id='nav-link-accountList-nav-line-1']")).click();
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("basith@1355gmail.com",Keys.ENTER);
		driver.navigate().back();
		driver.navigate().back();
		driver.findElement(By.xpath("//*[@id='nav-hamburger-menu']")).click();
		
		
		
		
		
		

	}

}
