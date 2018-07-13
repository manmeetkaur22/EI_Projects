package testCases;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.ITestResult;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.google.Helper;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import browserFactory.Browser;
import dataProvider.Read_data;
import dataProvider.config_Provider;
import pages.Home_Page;
import pages.Sign_in;

public class Verify_Login_Page
{
	
	WebDriver driver;
	Browser browser;
	ExtentReports report;
	ExtentTest logger;
	
	
		@BeforeTest()
		public void start() throws Exception
		{ 
			report=new ExtentReports(".\\reports\\Login_Page_Report.html",true);
			logger=report.startTest("Verify Login Page");
			config_Provider config=new config_Provider();
			browser=new Browser();
			driver=browser.getBrowser("Chrome");
			driver.get(config.getApplicationURl());
			logger.log(LogStatus.INFO,"ExporterIndia.com Open");
		}
		@Test()
		public void login() throws InterruptedException, IOException
		{
			Home_Page home=PageFactory.initElements(driver, Home_Page.class);
			Sign_in signin=PageFactory.initElements(driver, Sign_in.class);
			home.click_signin();
			logger.log(LogStatus.PASS,logger.addScreenCapture(Helper.Capture_ScreenShot(driver, "Signin")));
			logger.log(LogStatus.INFO,"Navigating to Sign_In Page");
			Read_data rdata=new Read_data();
			signin.log(rdata.get_data(0, 0, 0), rdata.get_data(0, 0, 1));
			logger.log(LogStatus.FAIL, "Login Fail");
			report.endTest(logger);
			report.flush();
			
			
		}
		
		@AfterTest()
		public void close(ITestResult result) throws IOException
		{
			if(result.getStatus()==ITestResult.FAILURE)
			{
				String Path=Helper.Capture_ScreenShot(driver, result.getName());
				logger.log(LogStatus.FAIL,logger.addScreenCapture(Path));
			}
			browser.close_Browser(driver);
			
			
		}
	}
	
