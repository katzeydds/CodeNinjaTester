package codeninja;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Random;

public class RegisterLoginLogoutTest extends BaseTest{

    RegisterLoginLogout action;

    @Test
    void CreateAccount() throws InterruptedException {
        action = new RegisterLoginLogout(driver);
        action.clickCreateAccount();
        String URL = driver.getCurrentUrl();
        Assertions.assertEquals(URL, "http://localhost:5173/register");
        action.inputNameSurname("Petras Jorys");
        String createdEmail = "petras" + (new Random().nextInt(1000) + 100) +"@gmail.com";
        action.inputEmail(createdEmail);
        String createdPassword = "maryte"+ (new Random().nextInt(1000) + 100);
        action.inputPassword(createdPassword);
        action.clickConfirmCreateAccount();
        Thread.sleep(2000);
        action.inputLoginEmail(createdEmail);
        action.inputLoginPassword(createdPassword);
        action.clickLogin();
        Thread.sleep(2000);
        String currentURL = driver.getCurrentUrl();
        Assertions.assertEquals(currentURL, "http://localhost:5173/projects");
        action.clickLogout();
    }
}
