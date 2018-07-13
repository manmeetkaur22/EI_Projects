package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Sign_in {
	WebDriver driver;
	public Sign_in(WebDriver ldriver)
	{
		this.driver=ldriver;
	}
	@FindBy(xpath="//*[@id=\"cont-1\"]") WebElement Email;
	@FindBy(xpath="//*[@id=\"cont-2\"]") WebElement Mobile;
	@FindBy(name="email_login") WebElement Email_id;
	@FindBy(id="password")WebElement Passwrd;
	@FindBy(xpath="//*[@id=\"login_form\"]/ul/li[4]/button") WebElement Sign_in;
	public void click_Email()
	{
		Email.click();
	}
	public void click_Mobile()
	{
		Mobile.click();
	}
	public void Enter_email()
	{
		Email_id.sendKeys("manmeetkaur22@gmail.com");
	}
	public void Enter_Password()
	{
		Passwrd.sendKeys("123456");
	}
	
	public void Click_signIn()
	{
		Sign_in.click();
	}
	public void log(String uname,String pass)
	{
		Email_id.sendKeys(uname);
		Passwrd.sendKeys(pass);
		Sign_in.click();
	}
	
	

}
