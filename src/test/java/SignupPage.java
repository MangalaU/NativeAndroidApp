import PageObject.Login;
import PageObject.SignUp;

import Utils.BaseClass;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SignupPage extends BaseClass {


        @Test
        public void testSignup() throws Exception {
            Login login = new Login(driver);
            login.clickLoginForm();
            SignUp sign = new SignUp(driver);
            sign.signup_form();
            sign.enterEmailID(prop.getProperty("email"));
            sign.enterPassword(prop.getProperty("password"));
            sign.enterConfirmPassword(prop.getProperty("confirmPass"));
            sign.clickSignup();
            Assert.assertTrue(sign.alert_popup().isDisplayed(), "Signup successfully popup displayed after signup");
        }
    }


