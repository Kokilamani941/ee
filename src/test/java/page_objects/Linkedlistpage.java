package page_objects;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import constants.Constants;
import constants.Loggerload;
import webdriver_manager.DriverManager;

public class Linkedlistpage {
	
	//common_utils initWebElements=new common_utils();
	private static Linkedlistpage loginPageInstance;

	@FindBy(xpath = "//a[@href='linked-list']")WebElement getstart_linkedlist;
	@FindBy(linkText = "Get Started")WebElement getStarted;
	
public Linkedlistpage() {
		
		PageFactory.initElements(DriverManager.getDriver(), this);	
		
	}
		public static Linkedlistpage getInstance() {
			
				
				if(loginPageInstance==null) {
					loginPageInstance = new Linkedlistpage();		
				}
				
				return loginPageInstance;
				
			}

//	
	@FindBy(xpath = "//a[@class='nav-link dropdown-toggle']")WebElement dropDown;

	
	@FindBy(xpath="//a[@href='introduction']")WebElement introductionLink;
	
	@FindBy(xpath = "//a[@href='/tryEditor']")WebElement tryHereLink;
	@FindBy(xpath = "//*[@class=' CodeMirror-line ']")WebElement editorpythonInput; 
	@FindBy(id = "output")WebElement output;
	@FindBy(xpath = "//*[@id='answer_form']/button")WebElement runButton;
	
	
	@FindBy (xpath="//a[@href='creating-linked-list']")WebElement creating_linked_list;
	@FindBy (xpath="//a[@href='implement-linked-list-in-python']")WebElement implementLLInPythonLink; 
	@FindBy (xpath="//a[@href='types-of-linked-list']")WebElement typesOfLLLink;  
	@FindBy (xpath="//a[@href='traversal']")WebElement traversalLink; 
	@FindBy (xpath="//a[@href='insertion-in-linked-list']")WebElement insertionLink; 
	@FindBy (xpath="//a[@href='deletion-in-linked-list']")WebElement deletionLink; 
	@FindBy (xpath="//a[@href='/linked-list/practice']")WebElement practiceQuestionLink; 

	
		
	//Homepage
      //  @FindBy(linkText = "Get Started")WebElement getStarted;
		//@FindBy(xpath = "//a[@class='nav-link dropdown-toggle']")WebElement dropDown;
		//@FindBy(xpath = "//a[@href='/linked-list']")WebElement dropdown_linkedlist;
		
		public void navigateToLinkedlistpage() throws InterruptedException {
			DriverManager.getDriver().get(Constants.LinkedListpage);
			Thread.sleep(1000);
			Loggerload.info("user is in LL");
		}
		public void getstart() throws InterruptedException {
			getStarted.click();
			Loggerload.info("user clicked on Get started button");
			Thread.sleep(1000);
		}	
		
		public void dropdown() throws InterruptedException {
			dropDown.click();
			Loggerload.info("user clicked on Get started button");
			Thread.sleep(1000);
		}	
		
		public void getstart_linkedlist() throws InterruptedException {
			Thread.sleep(1000);
			getstart_linkedlist.click();
			Loggerload.info("user clicked on Get started button");
			Thread.sleep(1000);
		}	
		
		public String getLinkedlistPageTitle() {
			String title = DriverManager.getDriver().getTitle();
			return title;
		}
		public void introductionLLLink() throws InterruptedException {
			
			Loggerload.info("click " + introductionLink.getText() + " in Linkedlist page");
		    Thread.sleep(1000);
		    introductionLink.click();
			Loggerload.info("User clicked on Introduction Link ");
		}
		
		public void clickOnTryHereLink() throws InterruptedException {
			tryHereLink.click();
			Thread.sleep(1000);
			Loggerload.info("User clicked on Try here link");

		}
		public void EnterPhytonCode(String validPhytonCode )
		{
			
			editorpythonInput.sendKeys(validPhytonCode);
			
		}
		
		public void clickOnRunButton() {
			runButton.click();
			Loggerload.info("User clicked on Run Button");
		}
		
		public String getActualResult1() {

			return output.getText();
		}
		
		
		public void InvalidPhytonCode(String enterinvalidCode ) throws InterruptedException
		{
			Thread.sleep(2000);
			editorpythonInput.sendKeys(enterinvalidCode);
			
		}
		
		public String getErrorText() throws InterruptedException {
			Thread.sleep(2000);
			String errorMsg = DriverManager.getDriver().switchTo().alert().getText();
			DriverManager.getDriver().switchTo().alert().accept();
			return errorMsg;
		}
		
		public void navigateToEditorUrl() {
			//DriverManager.getDriver().get(Constants.EDITORURL);
			System.out.println("EDITURL");
			DriverManager.getDriver().get(Constants.EDITORURL);
			Loggerload.info("User is in editor page");
		}
		
		public void navigateToLinkedlistPage() throws InterruptedException {
			Thread.sleep(2000);
			DriverManager.getDriver().get(Constants.Introductionurl);
			Loggerload.info("User is in Linkedlist page");
		}
		
		public void creating_linked_listpage() {
			Loggerload.info("click " + creating_linked_list.getText() + "On creating linkedlist page");
			creating_linked_list.click();
			Loggerload.info("User clicked on creating linkedlist link ");
		}
		
		public void implementLLInPythonLinkpage() {
			implementLLInPythonLink.click();
			Loggerload.info("User clicked on ImplementationLLpythonLinkedlist using  link");
		}
		
		public void typesOfLLLinkpage() {
			typesOfLLLink.click();
			Loggerload.info("User clicked on typesoflink page");
		}
		public void traversalLinkpage() {
			DriverManager.getDriver().get(Constants. traversalLink);
		}
		
		
		public void  insertionLinkpage() {
			insertionLink.click();
			Loggerload.info("User clicked on insertion link");
			
		}
		
		public void  deletionLinkpage() {
			deletionLink.click();
			Loggerload.info("User clicked on deletion link");
			
		}
		public void  practiceQuestionLinkpage() {
			 practiceQuestionLink.click();
			Loggerload.info("User clicked on  practiceQuestion Link");
			
		}
		
}

		





