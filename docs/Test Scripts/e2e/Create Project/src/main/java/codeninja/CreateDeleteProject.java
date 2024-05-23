package codeninja;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class CreateDeleteProject extends Base{
    public CreateDeleteProject(WebDriver driver){
        super(driver);
    }

    @FindBy(css = "._createFirstProjectButton_1ggda_64")
    WebElement createYourFirstProject;
    @FindBy(css = "._createFirstProjectButton_1bzjc_97")
    WebElement createYourProject;
    @FindBy(css = "#exampleForm\\.ControlInput1")
    WebElement projectName;
    @FindBy(css = "._projectIcons_vqd69_1 > img:nth-of-type(1)")
    WebElement projectIcon;
    @FindBy(css = "#exampleForm\\.ControlTextarea1")
    WebElement projectDescription;
    @FindBy(css = "._createBtnContent_1d6dp_117")
    WebElement create;
    @FindBy(css = "._projectPopUp_i8za0_11 div:nth-of-type(4) ._editIcon_r6y8n_37")
    WebElement editIcon;
    @FindBy(css = "._menuTrash_r6y8n_45")
    WebElement delete;
    @FindBy(css = "._createBtn_1d6dp_107")
    WebElement confirmDelete;
    @FindBy(css = "#formBasicEmail")
    WebElement enterLoginEmail;
    @FindBy(css = "#formBasicPassword")
    WebElement enterLoginPassword;
    @FindBy(css = "._loginButton_btrvf_10-primary")
    WebElement Login;

    public void clickCreateYourFirstProject(){
        createYourFirstProject.click();
    }
    public void clickCreateYourProject(){
        createYourProject.click();
    }
    public void inputProjectName(String name){
        projectName.sendKeys(name);
    }
    public void clickProcjectIcon(){
        projectIcon.click();
    }
    public void inputProjectDescription(String desc){
        projectDescription.sendKeys(desc);
    }
    public void clickCreate(){
        create.click();
    }
    public void clickEditIcon(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.elementToBeClickable(editIcon)).click();
    }
    public void clickDelete(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(delete)).click();
    }
    public void clickConfirmDelete(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(confirmDelete)).click();
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
}
