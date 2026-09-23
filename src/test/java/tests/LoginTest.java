
package tests;

import org.testng.annotations.Test;

import base.BaseTest;
import pages.LoginPage;
import pages.ProfilePage;

public class LoginTest extends BaseTest {

@Test
public void loginTest() {

setUp();

LoginPage login = new LoginPage(page);
login.login("TestUser", "Test@123");

ProfilePage profile = new ProfilePage(page);

System.out.println(profile.getPageTitle());
System.out.println(profile.isLogoutDisplayed());

tearDown();
}
}