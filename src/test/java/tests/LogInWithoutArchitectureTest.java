package tests;

import Pages.ProductPage;
import Pages.Service.RegistartionOnSite;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LogInWithoutArchitectureTest extends BaseWithoutArchitectureTest {

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
