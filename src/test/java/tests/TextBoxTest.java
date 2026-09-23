
package tests;

import org.testng.annotations.Test;

import base.BaseTest;
import pages.LoginPage;
import pages.ProfilePage;
import pages.TextboxPage;

public class TextBoxTest extends BaseTest{
 @Test
 
 public void testboxTest() {
	 setUp();
 

LoginPage login = new LoginPage(page);
login.login("TestUser", "Test@123");
ProfilePage profile = new ProfilePage(page);
profile.clickElement();
profile.clickTextBox();
TextboxPage textboxpage = new TextboxPage(page);
textboxpage.enterFullname("Komal");
textboxpage.enterEmail("komal@gmail.com");

// page.waitForTimeout(10000);
textboxpage.submitbutton();

// Assertions
textboxpage.verifyFullnameDisplayed("Komal");

tearDown();
}

}
