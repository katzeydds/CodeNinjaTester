package codeninja;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Random;

public class CreateDeleteProjectTest extends BaseTest{

    CreateDeleteProject action;

    @Test
    void CreateProject(){
        action = new CreateDeleteProject(driver);
        action.inputLoginEmail("aa@a.com");
        action.inputLoginPassword("aaaaaaaa");
        action.clickLogin();
        action.clickCreateYourFirstProject();
        action.inputProjectName("1");
        action.clickProcjectIcon();
        action.inputProjectDescription("1");
        action.clickCreate();
        for (int i = 0; i < 1; i++) {
            action.clickCreateYourProject();
            String projectName = String.valueOf((new Random().nextInt(1000000000) + 1000000000));
            action.inputProjectName(projectName);
            action.clickProcjectIcon();
            String projectDescription = String.valueOf((new Random().nextInt(1000000000) + 1000000000));
            action.inputProjectDescription(projectDescription);
            action.clickCreate();
        }
    }
    @Test
    void DeleteProject() throws InterruptedException {
        action = new CreateDeleteProject(driver);
        for (int i = 0; i < 8; i++) {
            action = new CreateDeleteProject(driver);
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
            action.clickEditIcon();
            action.clickDelete();
            action.clickConfirmDelete();
            wait.until(ExpectedConditions.invisibilityOf(action.confirmDelete));
        }
    }
}
