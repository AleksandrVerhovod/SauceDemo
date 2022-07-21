package tests;

import Base.BaseTest;
import Pages.CartPage;
import Pages.ProductPage;
import Pages.Service.RegistartionOnSite;
import org.testng.Assert;
import org.testng.annotations.*;

public class AddProductToCartTest extends BaseTest {


    @Test
    public void addToCardTest () {
        RegistartionOnSite sentRegistartion = new RegistartionOnSite(driver);
        sentRegistartion.registration();
        ProductPage productPage = new ProductPage(driver);
        String productPrice = productPage.getProductPrice();
        productPage.addToCart();
        productPage.openTheShoppingCart();
        CartPage cartPage = new CartPage(driver);
        Assert.assertEquals(cartPage.isPriceOfSLB(), productPrice);
    }
}
