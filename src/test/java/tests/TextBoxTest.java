package tests;
import base.BaseTest;
import pages.LoginPage;
import pages.ProfilePage;
import pages.TextboxPage;

public class TextBoxTest extends BaseTest{
	 public static void main(String[] args) {
	     LoginTest test = new LoginTest();
	        test.setUp();
	        LoginPage login = new LoginPage(test.page);
	        login.login("TestUser", "Test@123");
	        ProfilePage profile = new ProfilePage(test.page);
	        profile.clickElement();
	        profile.clickTextBox();
	        TextboxPage TextboxPage = new TextboxPage(test.page);
	        TextboxPage.enterFullname("Komal");
	        TextboxPage.enterEmail("komal@gmail.com");
	            
	        TextboxPage.submitbutton();
	       
	     // Assertions
		      TextboxPage.verifyFullnameDisplayed("Komal");
		       
	        test.tearDown();
	 }
}
