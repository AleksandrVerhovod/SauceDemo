package Pages;

import org.openqa.selenium.WebDriver;

public class BasePage {

    public BasePage(WebDriver driver) {
        this.driver = driver;
    }

    public WebDriver driver;

    public BasePage() {
    }
}
