package tests;
import base.BaseTest;
import pages.LoginPage;
import pages.ProfilePage;
public class LoginTest extends BaseTest {
    public static void main(String[] args) throws InterruptedException {
        LoginTest test = new LoginTest();
        test.setUp();
        LoginPage login = new LoginPage(test.page);
        login.login("TestUser", "Test@123");
         ProfilePage profile = new ProfilePage(test.page);
        System.out.println(profile.getPageTitle());
        System.out.println(profile.isLogoutDisplayed());
        test.tearDown();
    }
}
