package tests;

import constants.LoginAndPassword;
import constants.Urls;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.*;

public class AddProductToCart extends BaseTest{
    private void sendLogInAndPassword() {

        driver.findElement(By.xpath("//input[@class='input_error form_input' and @type='text']")).sendKeys(LoginAndPassword.LOGIN);
        driver.findElement(By.xpath("//input[@class='input_error form_input' and @type='password']")).sendKeys(LoginAndPassword.PASSWORD);
        driver.findElement(By.xpath("//input[@class=\"submit-button btn_action\"]")).click();
    }

    @Test
    public void addToCard() {
        driver.get(Urls.mainPage);
        sendLogInAndPassword();
        //Add product to cart
        driver.findElement(By.xpath("//button[@id=\"add-to-cart-sauce-labs-backpack\"]")).click();
        driver.findElement(By.xpath("//a[@class=\"shopping_cart_link\"]")).click();
        //Add check
        WebElement costElement = driver.findElement(By.xpath("//div[@class=\"inventory_item_price\"]"));
        String titleCost = costElement.getText();
        Assert.assertEquals(titleCost, "$29.99");
        WebElement nameElement = driver.findElement(By.xpath("//div[@class=\"inventory_item_name\"]"));
        String titleName = nameElement.getText();
        Assert.assertEquals(titleName, "Sauce Labs Backpack");
    }
}
