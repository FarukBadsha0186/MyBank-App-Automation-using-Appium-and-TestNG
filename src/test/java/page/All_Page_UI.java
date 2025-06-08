package page;

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

public class All_Page_UI extends Setup {


    @FindBy(xpath ="(//android.widget.ImageView[@resource-id=\"cf.projectspro.bank:id/navigation_bar_item_icon_view\"])[2]")
    public WebElement transectionBtn;
    @FindBy(xpath = "//android.widget.TextView[@resource-id='cf.projectspro.bank:id/navigation_bar_item_small_label_view' and @text='Profile']")
    public WebElement profileTab;
    @FindBy(id = "cf.projectspro.bank:id/signout")
    public WebElement SignoutBtn;

    public All_Page_UI(AndroidDriver driver) {
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }
    public void transection(){
        transectionBtn.click();
        String expectedText = "Send money to someone and transactions will show up here!";
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement transactionHint = wait.until(ExpectedConditions.presenceOfElementLocated(
                By.xpath("//android.widget.TextView[@text='Send money to someone and transactions will show up here!']")));
        Assert.assertEquals(transactionHint.getText(), expectedText, "Transaction hint text does not match!");

    }

    public void profile(){
        profileTab.click();
        String expectedText = "Faruk";
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement transactionHint = wait.until(ExpectedConditions.presenceOfElementLocated(
                By.id("cf.projectspro.bank:id/name_profile")));
        Assert.assertEquals(transactionHint.getText(), expectedText, "Profile does not match!");

    }
}
