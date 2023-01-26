package page_objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import webdriver_manager.DriverManager;

public class HomePage {

private static HomePage loginPageInstance;
	
	//Dummy private constructor prevents the object create
	private HomePage() {
		
	}
	
	//this method prevents duplicate object creation, Singleton pattern lazy loading
	public static HomePage getInstance()
	{
		if(loginPageInstance==null) {
			loginPageInstance = new HomePage();		
		}
		
		return loginPageInstance;
		
	}
		
	
	@FindBy(xpath="//a[@href='/home']")WebElement btngetstarted;

	
	public void btn_getstartedclick() {
		
		btngetstarted.click();
		System.out.println("The user clicks Get started button");
	}
	
	
	public String redirectedToHomePage()
	
	{
		String title=DriverManager.getDriver().getTitle();
		return title;
		
	}
	
	
	//@FindBy(className="dropdown")
	//private WebElement drpdowntoggle;
	
	
	
}
