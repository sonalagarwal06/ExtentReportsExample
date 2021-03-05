package tests;

import java.lang.reflect.Method;
import org.testng.annotations.Test;
import utils.ExtentReports.ExtentTestManager;

public class LoginTests extends BaseTest {

    // Extra information:
    // 1) @BeforeClass we declared driver variable.
    // 2) We send driver variable to the page class with below declaration.
    //    Homepage homepage = new HomePage(driver);
    // 3) super () method in page class transfer the driver variable value to the BasePage class.

   /* @Test(priority = 0, description = "Invalid Login Scenario with wrong username and password.")
    public void invalidLoginTest_InvalidUserNameInvalidPassword(Method method) {
        //ExtentReports Description
        ExtentTestManager.startTest(method.getName(), "Invalid Login Scenario with invalid username and password.");

        homePage
            .goToN11()
            .goToLoginPage()
            .loginToN11("asdasdas", "111")
            .verifyLoginUserName("Lütfen geçerli bir e-posta adresi girin.")
            .verifyLoginPassword("Girilen değer en az 6 karakter olmalıdır.");
    }*/

    @Test(priority = 0, description = "Invalid Login Scenario with wrong username and password.")
    public void testMethod(Method method) {
        //ExtentReports Description
        ExtentTestManager.startTest(method.getName(), "Navigating to login page");

        homePage
                .goToN11()
                .goToLoginPage();

    }

  /*  @Test(priority = 1, description = "Invalid Login Scenario with empty username and password.")
    public void invalidLoginTest_EmptyUserEmptyPassword(Method method) {
        //ExtentReports Description
        ExtentTestManager.startTest(method.getName(), "Invalid Login Scenario with empty username and password.");

        homePage
            .goToN11()
            .goToLoginPage()
            .loginToN11("", "")
            .verifyLoginUserName("Lütfen e-posta adresinizi girin.")
            .verifyLoginPassword("WRONG MESSAGE FOR FAILURE!");
    }*/
}