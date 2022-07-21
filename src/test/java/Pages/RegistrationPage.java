package Pages;

import constants.LoginAndPassword;
import constants.Urls;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegistrationPage extends BasePage{

    public RegistrationPage(WebDriver driver) {
        super(driver);
    }
    private final By LOGIN_INPUT = By.xpath("//input[@class='input_error form_input' and @type='text']");
    private final By PASSWORD = By.xpath("//input[@class='input_error form_input' and @type='password']");
    private final By SUBMIT_BUTTON = By.xpath("//input[@class=\"submit-button btn_action\"]");

    public void openRegistrationPage () {
        driver.get(Urls.mainPage);
    }
    public void loginInput (String login) {
        driver.findElement(LOGIN_INPUT).sendKeys(LoginAndPassword.LOGIN);
    }
    public void passwordInput (String password) {
        driver.findElement(PASSWORD).sendKeys(LoginAndPassword.PASSWORD);
    }
    public void buttonLoginClick () {
        driver.findElement(SUBMIT_BUTTON).click();
    }
}
