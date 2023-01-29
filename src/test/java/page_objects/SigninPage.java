package page_objects;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import webdriver_manager.DriverManager;

public class SigninPage {

	private static SigninPage loginPageInstance;
	
	public SigninPage() {
		PageFactory.initElements(DriverManager.getDriver(),this);
		
			}
	public static SigninPage getInstance()
	{
		
		if(loginPageInstance==null) {
			loginPageInstance = new SigninPage();		
		}
		
		return loginPageInstance;
		
	}
	
	@FindBy (linkText =("sign in"))WebElement Signinlink;
	@FindBy (id="id_username")private WebElement txt_username;
	@FindBy (id="id_password")WebElement txt_password;
	@FindBy (xpath="//input[@value=\"Login\"]")WebElement lin_login;
	
	public void StringinLinkbtn()
	{
		Signinlink.click();
	}
}
