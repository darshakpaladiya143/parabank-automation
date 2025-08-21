// src/test/java/tests/RegisterTest.java
package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import base.BaseTest;
import pages.HomePage;
import pages.RegisterPage;
import utils.TestData;

public class RegisterTest extends BaseTest {

    @Test
    public void testRegister() {
        RegisterPage register = new RegisterPage(driver);
        HomePage home = new HomePage(driver);
        register.openRegisterPage();

        String dynamicUsername = "Darshak" + System.currentTimeMillis();
        TestData.dynamicUsername = dynamicUsername;

        register.customerInfoandRegister(
            "Darshak", "Paladiya", "Bhakatinandan Society", "Surat", "Gujarat",
            "394101", "8866180955", "123456789",
            dynamicUsername, "Darshak@111", "Darshak@111"
        );

        String welcomeText = register.getWelcomeMessage();
        Assert.assertTrue(welcomeText.contains("Welcome " + dynamicUsername));
//        home.clickLogout();
    }
}
