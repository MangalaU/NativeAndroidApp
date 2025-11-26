package PageObject;

import io.appium.java_client.AppiumDriver;

import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import java.time.Duration;

public class Login {

        private AppiumDriver driver;

        @AndroidFindBy(xpath = "//android.widget.TextView[@text='Login']")
        private WebElement loginBtnForm;

        @AndroidFindBy(xpath = "//android.widget.EditText[@content-desc='input-email']")
        private WebElement emailField;

        @AndroidFindBy(xpath = "//android.widget.EditText[@content-desc='input-password']")
        private WebElement passwordField;

        @AndroidFindBy(xpath = "//android.view.ViewGroup[@content-desc='button-LOGIN']/android.view.ViewGroup")
        private WebElement loginBtn;

        @AndroidFindBy(xpath = "//android.widget.TextView[@resource-id=\"android:id/message\"]")
        private WebElement loginpopup;

        public Login(AppiumDriver driver) {
            this.driver = driver;
            PageFactory.initElements(new AppiumFieldDecorator(driver, Duration.ofSeconds(10)), this);
        }

        public void clickLoginForm() {
            loginBtnForm.click();
        }
        public void enterEmail(String email) {
            emailField.sendKeys(email);
        }
        public void enterPassword(String password) {
            passwordField.sendKeys(password);
        }
        public void clickLoginButton() {
            loginBtn.click();
        }
        public WebElement login_popup_message(){
            return loginpopup;
        }
    }

