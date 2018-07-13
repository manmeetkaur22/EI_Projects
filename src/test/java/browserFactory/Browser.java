package browserFactory;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import dataProvider.config_Provider;

public class Browser {
	WebDriver driver;
	
	public WebDriver getBrowser(String browserName) throws Exception 
	{
		
		if(browserName.equalsIgnoreCase("chrome"))
		{
			config_Provider config=new config_Provider();
			System.setProperty(config.ChromeDriver(),config.ChromePath() );
			driver=new ChromeDriver();
			
		}
		if(browserName.equalsIgnoreCase("IE"))
		{
			config_Provider config=new config_Provider();
			System.setProperty(config.IeDriver(),config.IEPath());
			driver=new InternetExplorerDriver();
			driver.manage().window().maximize();
		}
		if(browserName.equalsIgnoreCase("firefox"))
		{	
			config_Provider config=new config_Provider();
			System.setProperty(config.FirFoxDriver(),config.firfoxPath());
			driver=new FirefoxDriver();
			driver.manage().window().maximize();
		}
		
		return driver;
	}
	public void close_Browser(WebDriver ldriver)
	{
		ldriver.quit();
	}
	

}
