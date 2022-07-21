package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CartPage extends BasePage {

    private final By INVENTORY_PRICE_SLBACKPACK = By.xpath("//div[@class=\"inventory_item_price\"]");
    public CartPage (WebDriver driver) {
        super(driver);
    }

    public String isPriceOfSLB() {
       return driver.findElement(INVENTORY_PRICE_SLBACKPACK).getText();
    }
}
