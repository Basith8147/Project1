package testngpkg;

import java.io.File;
import java.io.IOException;
import java.util.logging.FileHandler;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReport {
	
	WebDriver driver;
	String baseurl="https://www.facebook.com";
	ExtentHtmlReporter reporter;
	ExtentTest test;
	ExtentReports Extent;
	
	@BeforeTest
	public void bfrtest()
	{
		reporter=new ExtentHtmlReporter("/Webdriverproject/Reports/myreports1.html");
		reporter.config().setDocumentTitle("First test");
		reporter.config().setReportName("Regression test");
		reporter.config().setTheme(Theme.STANDARD);
		
		Extent=new ExtentReports();
		Extent.attachReporter(reporter);
		Extent.setSystemInfo("hostname", "Localhost");
		Extent.setSystemInfo("os", "windows 11");
		Extent.setSystemInfo("tester name", "basith");
		Extent.setSystemInfo("browser name", "Chrome");
		 
		driver=new ChromeDriver();
		
	}
			
	@BeforeMethod
	public void setup()
	{
		driver.get(baseurl);
	}
	
	@Test
	public void titleverification()
	{
		test=Extent.createTest("Fbtitleverification");
		String Exp="facebook";
		String actual=driver.getTitle();
		Assert.assertEquals(Exp, actual);
		System.out.println("hello");
	}
	
	@Test
	public void fbbuttontest() throws IOException
	{
		test=Extent.createTest("Fbbuttontest");
		String buttontext=driver.findElement(By.xpath("//*[@id=\"u_0_b\"]")).getText();
		Assert.assertEquals(buttontext, "register");
		
	}
	
	
	@Test
	public void fblogotest() throws IOException
	{
		test=Extent.createTest("Fblogotest");
		boolean b=driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/div/div[1]/div/img")).isDisplayed();
		Assert.assertTrue(b);
		
		

		
	}
	
	@AfterTest
	public void teardown() {
		Extent.flush();
	}
	
	@AfterMethod
	public void browserclose(ITestResult result)
	{
		if(result.getStatus()==ITestResult.FAILURE)
		{
			test.log(Status.FAIL, "test case failed is"+result.getName());
			test.log(Status.FAIL, "test case failed is"+result.getThrowable());
			//String screenshotpath=ExtentReports(driver,result.getName());
			//test.addScreenCaptureFromPath(screenshotpath);
			
		}else if(result.getStatus()==ITestResult.SKIP)
		{
			test.log(Status.SKIP, "test case skipped is"+result.getName());
		}
		else if(result.getStatus()==ITestResult.SUCCESS)
		{
			test.log(Status.PASS, "test case Passed is"+result.getName());
		}
		 
	}
	
	public static String screenshotMethod(WebDriver driver,String screenshotname) throws IOException
	{
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		String destination="./Screenshot/"+screenshotname +".png";
		File finaldestination=new File(destination);
		FileHandler.copy(src, finaldestination);
		FileHandler.copy(src, new File(destination));

		return destination;
	}
		
	}
	
	
	
	


