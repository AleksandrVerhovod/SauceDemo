package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;
import java.util.List;

public class ProductPage extends BasePage {

    private final By BUTTON_ADD_TO_CART_SLBACKPACK = By.xpath("//button[@id='add-to-cart-sauce-labs-backpack']");
    private final By PRICE_SLBACKPACK = By.xpath("//button[@id=\"add-to-cart-sauce-labs-backpack\"]//preceding-sibling::div");
    private final By CART_BUTTON = By.xpath("//a[@class='shopping_cart_link']");
    private final By BUTTON_LINKEDIN = By.xpath("//a[@href=\"https://www.linkedin.com/company/sauce-labs/\"]");
    private final By LOGO_LINKEDIN = By.xpath("//icon[@data-test-id]");

    public ProductPage(WebDriver driver) {
        super(driver);
    }

    public void addToCart() {
        driver.findElement(BUTTON_ADD_TO_CART_SLBACKPACK).click();
    }

    public void openTheShoppingCart() {
        driver.findElement(CART_BUTTON).click();
    }

    public String getProductPrice() {
        return driver.findElement(PRICE_SLBACKPACK).getText();
    }

    public void clickLinkLinkedin() {
        driver.findElement(BUTTON_LINKEDIN).click();
    }

    public void switchToLinkedinPage() {
        ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));
    }

    public boolean logoLinkedin() {
        WebDriverWait webDriverWait = new WebDriverWait(driver, 15);
        webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(LOGO_LINKEDIN));
        return driver.findElement(LOGO_LINKEDIN).isDisplayed();
    }

}
