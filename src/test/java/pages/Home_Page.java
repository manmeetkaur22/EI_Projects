package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Home_Page {
	WebDriver driver;
	public Home_Page(WebDriver ldriver)
	{
		this.driver=ldriver;
	}
	@FindBy(xpath="/html/body/header/div/div/ul[1]/li[1]/a/span")WebElement SignIn;
	@FindBy(name="")WebElement JoinFree;
	public void click_signin()
	{
		SignIn.click();
	}
	public void joinFree_click()
	{
		JoinFree.click();
	}
	public String getTittle()
	{
		return driver.getTitle();
	}
	
	

}
