package page_objects;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import webdriver_manager.DriverManager;

public class SigninPage {

	private static SigninPage loginPageInstance;
	
	@FindBy (xpath="//a[@href='/login']" )WebElement Signinlink;
	@FindBy (id="id_username")private WebElement txt_username;
	@FindBy (id="id_password")WebElement txt_password;
	@FindBy (xpath="//input[@value=\"Login\"]")WebElement lin_login;
	
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
	

	
	public void StringinLinkbtn(String username, String password)
	{
		Signinlink.click();
		
		System.out.println("Im in Sigin page");
	}
	
	public void doLogin(String username, String password) {

		txt_username.clear();
		txt_username.sendKeys("userkoki");
		 txt_password.clear();
		 txt_password.sendKeys("egret@123");
			lin_login.click();

		
	}
	public void login()
	{
		lin_login.click();
		
		System.out.println("Im in Sigin page");
	}
	
}
