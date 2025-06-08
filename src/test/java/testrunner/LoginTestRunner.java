package testrunner;

import org.testng.annotations.Test;
import page.HomeScreen;
import page.LoginPage;
import setup.Setup;

public class LoginTestRunner extends Setup {

    LoginPage loginPage;

    @Test
    public void testSignupClick() throws InterruptedException {
        loginPage = new LoginPage(getDriver());
        Thread.sleep(5000);
        loginPage.loginwithInvaliddata();
        loginPage.login();
    }
}
