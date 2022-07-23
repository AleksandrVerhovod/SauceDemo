package Pages.Service;

import Pages.BasePage;
import Pages.RegistrationPage;
import constants.LoginAndPassword;
import org.openqa.selenium.WebDriver;

public class RegistartionOnSite{

    private final WebDriver driver;
    public RegistartionOnSite(WebDriver driver) {
        this.driver=driver;
    }
    public void registration () {
        RegistrationPage registrationPage = new RegistrationPage(driver);
        registrationPage.openRegistrationPage();
        registrationPage.loginInput(LoginAndPassword.LOGIN);
        registrationPage.passwordInput(LoginAndPassword.PASSWORD);
        registrationPage.buttonLoginClick();
    }
}
