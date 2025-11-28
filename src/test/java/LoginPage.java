import PageObject.Login;

import Utils.BaseClass;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

public class LoginPage extends BaseClass {

    @Test
    public void loginSetup() throws Exception {
        Login login = new Login(driver);
        login.clickLoginForm();
        login.enterEmail(prop.getProperty("email"));
        login.enterPassword(prop.getProperty("password"));
        login.clickLoginButton();


        Assert.assertTrue(login.login_popup_message().isDisplayed(),
                "Login success message is not displayed");
    }


}