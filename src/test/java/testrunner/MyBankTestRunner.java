package testrunner;

import org.testng.annotations.Test;
import page.All_Page_UI;
import page.HomeScreen;
import page.SignUpPage;
import setup.Setup;

public class MyBankTestRunner extends Setup {

    HomeScreen homeScreen;
    SignUpPage signUpPage;
    All_Page_UI allPageUi;

    @Test(priority = 1)
    public void testSignupClick() throws InterruptedException {
        homeScreen = new HomeScreen(getDriver());
        Thread.sleep(5000);
        homeScreen.signup();
    }

    @Test(priority = 2)
    public void SignupForm() throws InterruptedException {
        signUpPage = new SignUpPage(getDriver());
        signUpPage.SignupFormWithMissingKeyWord();
        Thread.sleep(5000);
        signUpPage.SignupForm();
    }
    @Test(priority = 3)
    public void SignoutForm() throws InterruptedException {
        allPageUi = new All_Page_UI(getDriver());
        allPageUi.profileTab.click();
        Thread.sleep(5000);
        allPageUi.SignoutBtn.click();
    }



}
