package testrunner;

import org.testng.annotations.Test;
import page.All_Page_UI;
import page.LoginPage;
import setup.Setup;

public class All_Page_Test_Runner extends Setup {

    All_Page_UI allPageUi;


    @Test(priority = 1)
    public void all_page_test_UI_Transection() throws InterruptedException {
        allPageUi=new All_Page_UI(getDriver());
        allPageUi.transection();
        Thread.sleep(5000);



    }
   @Test (priority = 2)
    public void all_page_test_UI_Profile() throws InterruptedException {
        allPageUi=new All_Page_UI(getDriver());
        allPageUi.profile();
        Thread.sleep(5000);
        allPageUi.SignoutBtn.click();

    }

}
