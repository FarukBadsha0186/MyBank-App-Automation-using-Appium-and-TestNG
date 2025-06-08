package page;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import setup.Setup;

public class LoginPage extends Setup {


    @FindBy(id = "cf.projectspro.bank:id/email")
    public WebElement loginemail;
    @FindBy(id = "cf.projectspro.bank:id/pass")
    public   WebElement loginpass;
    @FindBy(id = "cf.projectspro.bank:id/login")
    public  WebElement loginBtn;

    public LoginPage(AndroidDriver driver) {
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }


    public void loginwithInvaliddata(){
        loginemail.sendKeys("Faruk0005@gmail.com");
        loginpass.sendKeys("pass123");
        loginBtn.click();
    }
    public void login(){
        loginemail.sendKeys("Faruk03@gmail.com");
        loginpass.sendKeys("pass123");
        loginBtn.click();
    }
}
