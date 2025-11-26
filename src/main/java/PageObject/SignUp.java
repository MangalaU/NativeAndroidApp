package PageObject;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.pagefactory.AndroidBy;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import java.time.Duration;

public class SignUp {
        AppiumDriver driver;

        public SignUp(AppiumDriver driver) {
            this.driver = driver;
            PageFactory.initElements(new AppiumFieldDecorator(driver, Duration.ofSeconds(10)), this);
        }

        @AndroidBy(xpath = "//android.widget.TextView[@text=\"Sign up\"]")
        private WebElement signupform;

        @AndroidFindBy(xpath = "//android.widget.EditText[@content-desc='input-name']")
        private WebElement nameField;

        @AndroidFindBy(xpath = "//android.widget.EditText[@content-desc='input-email']")
        private WebElement emailField;

        @AndroidFindBy(xpath = "//android.widget.EditText[@content-desc='input-password']")
        private WebElement passwordField;

        @AndroidFindBy(xpath = "//android.widget.EditText[@content-desc='input-repeat-password']")
        private WebElement confirmPasswordField;

        @AndroidFindBy(xpath = "//android.view.ViewGroup[@content-desc='button-SIGN UP']")
        private WebElement signupButton;

        @AndroidFindBy(xpath = "//android.widget.TextView[@resource-id=\"android:id/alertTitle\"]")
        private WebElement alertTitle;

       public void signup_form(){
           signupform.click();
       }

        public void enterName(String name) {
            nameField.sendKeys(name);
        }

        public void enterEmail(String email) {
            emailField.sendKeys(email);
        }

        public void enterPassword(String pass) {
            passwordField.sendKeys(pass);
        }

        public void enterConfirmPassword(String pass) {
            confirmPasswordField.sendKeys(pass);
        }

        public void clickSignup() {
            signupButton.click();
        }
        public WebElement alert_popup(){
           return alertTitle;
        }
    }




