package codeninja;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegisterLoginLogout extends Base{
    public RegisterLoginLogout(WebDriver driver){
        super(driver);
    }

    @FindBy(css = "._newAccountBtn_btrvf_14-primary")
    WebElement createAccount;
    @FindBy(css = "#formBasicName")
    WebElement enterNameSurname;
    @FindBy(css = "#formBasicEmail")
    WebElement enterEmail;
    @FindBy(css = "#formBasicPassword")
    WebElement enterPassword;
    @FindBy(css = "#formBasicConfirmPassword")
    WebElement enterConfirmPassword;
    @FindBy(css = "._registerButton_qjisk_58")
    WebElement confirmCreateAccount;
    @FindBy(css = "#formBasicEmail")
    WebElement enterLoginEmail;
    @FindBy(css = "#formBasicPassword")
    WebElement enterLoginPassword;
    @FindBy(css = "._loginButton_btrvf_10-primary")
    WebElement Login;
    @FindBy(css = "._headerLogOutButton_r7wvc_43")
    WebElement Logout;


    public void clickCreateAccount(){
        createAccount.click();
    }
    public void inputNameSurname(String nameSurname){
        enterNameSurname.sendKeys(nameSurname);
    }
    public void inputEmail(String email){
        enterEmail.sendKeys(email);
    }
    public void inputPassword(String password){
        enterPassword.sendKeys(password);
        enterConfirmPassword.sendKeys(password);
    }
    public void clickConfirmCreateAccount(){
        confirmCreateAccount.click();
    }
    public void inputLoginEmail(String email){
        enterLoginEmail.sendKeys(email);
    }
    public void inputLoginPassword(String password){
        enterLoginPassword.sendKeys(password);
    }
    public void clickLogin(){
        Login.click();
    }
    public void clickLogout(){
        Logout.click();
    }

}
