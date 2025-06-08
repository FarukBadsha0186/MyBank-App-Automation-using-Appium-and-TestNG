package page;

import com.github.javafaker.Faker;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import setup.Setup;

import java.time.Duration;

public class SignUpPage extends Setup {

    @FindBy(id = "cf.projectspro.bank:id/name_signup")
  public   WebElement signupName;
    @FindBy(id = "cf.projectspro.bank:id/email_signup")
    public  WebElement signupemail;
    @FindBy(id = "cf.projectspro.bank:id/pass_signup")
    public   WebElement signuppass;
    @FindBy(id = "cf.projectspro.bank:id/signup_now")
    public  WebElement signupBtn;

    public SignUpPage(AndroidDriver driver) {
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }


    public void SignupFormWithMissingKeyWord(){

        Faker faker=new Faker();
        signupName.sendKeys(faker.name().firstName());
        signuppass.sendKeys("pass123");
        signupBtn.click();
        String toastMessage = "Fill All Details";
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        WebElement toastElement = wait.until(ExpectedConditions.presenceOfElementLocated(
                By.xpath("//android.widget.Toast[@text='" + toastMessage + "']")));
        Assert.assertEquals(toastElement.getText(), toastMessage, "Toast message mismatch!");


    }


    public void SignupForm(){

        Faker faker=new Faker();
        signupName.sendKeys(faker.name().firstName());
        signupemail.sendKeys(faker.internet().emailAddress());
        signuppass.sendKeys("pass123");
        signupBtn.click();
      //  Assert.assertTrue(signupName.isDisplayed(), "User name field is not visible!");

    }

}
