package page;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomeScreen {

    @FindBy(id = "cf.projectspro.bank:id/signup")
    WebElement signupBtn;


    public HomeScreen(AndroidDriver driver) {
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }


    public void signup() throws InterruptedException {

        signupBtn.click();
    }

}
