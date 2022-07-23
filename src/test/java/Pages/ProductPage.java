package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductPage extends BasePage{

private final By BUTTON_ADD_TO_CART_SLBACKPACK = By.xpath("//button[@id='add-to-cart-sauce-labs-backpack']");
private final By PRICE_SLBACKPACK = By.xpath("//button[@id=\"add-to-cart-sauce-labs-backpack\"]//preceding-sibling::div");
private final By CART_BUTTON = By.xpath("//a[@class='shopping_cart_link']");

    public ProductPage(WebDriver driver) {
        super(driver);
    }

    public void addToCart () {
        driver.findElement(BUTTON_ADD_TO_CART_SLBACKPACK).click();
    }

    public void openTheShoppingCart (){
        driver.findElement(CART_BUTTON).click();
    }

    public String getProductPrice () {
       return driver.findElement(PRICE_SLBACKPACK).getText();
    }

}
