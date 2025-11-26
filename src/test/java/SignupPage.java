import PageObject.SignUp;

import Utils.BaseClass;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SignupPage extends BaseClass {


        @Test
        public void testSignup() throws Exception {

            SignUp sign = new SignUp(driver);
            sign.signup_form();

            sign.enterName(prop.getProperty("email"));
            sign.enterEmail(prop.getProperty("password"));
            sign.enterPassword(prop.getProperty("confirmPass"));
            sign.clickSignup();
            Assert.assertTrue(sign.alert_popup().isDisplayed(), "Signup successfully popup displayed after signup");


        }
    }


