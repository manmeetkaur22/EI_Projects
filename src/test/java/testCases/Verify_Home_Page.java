package testCases;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory; 
import org.testng.annotations.Test;

import browserFactory.Browser;
import dataProvider.config_Provider;
import pages.Home_Page;

public class Verify_Home_Page {
	@Test
	public void testHome_page() throws Exception
	{
		config_Provider config=new config_Provider();
		Browser browser=new Browser();
		WebDriver driver=browser.getBrowser("Firefox");
		driver.get(config.getApplicationURl());
		Home_Page home=PageFactory.initElements(driver, Home_Page.class);
		home.click_signin();
		//System.out.println(home.getTittle());
		//browser.close_Browser(driver);
		
				
	}
}