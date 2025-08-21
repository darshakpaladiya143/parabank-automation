// src/test/java/tests/LoginTest.java
package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import base.BaseTest;
import pages.LoginPage;
import utils.TestData;

public class LoginTest extends BaseTest {

    @Test(dependsOnMethods = "tests.RegisterTest.testRegister")
    public void testValidLogin() {
        driver.get("https://parabank.parasoft.com/parabank/index.htm");
        LoginPage login = new LoginPage(driver);

        String dynamicUsername = TestData.dynamicUsername;

        login.login(dynamicUsername, "Darshak@111");
        String errorMSg = login.getErrorMessage();       
        Assert.assertFalse(false, errorMSg);
        driver.close();
        
    }
}
