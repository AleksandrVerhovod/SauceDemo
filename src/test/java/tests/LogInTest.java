package tests;

import Pages.ProductPage;
import Pages.RegistrationPage;
import Pages.Service.RegistartionOnSite;
import constants.LoginAndPassword;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LogInTest extends BaseTest {

    @Test
    public void logInTest() throws InterruptedException {
        RegistartionOnSite registartionOnSite = new RegistartionOnSite(driver);
        registartionOnSite.registration();
        ProductPage productPage = new ProductPage(driver);
        removeImplicitlyWait();
        productPage.clickLinkLinkedin();
        productPage.switchToLinkedinPage();
        Assert.assertTrue(productPage.logoLinkedin(), "Page not found");

    }
}
