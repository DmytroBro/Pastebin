package TestScenarios.Steps;

import PageObjects.MainPastebinPage;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.WebDriverRunner;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.logging.Logger;


public class OpenManePageCreateNewPastebin {

    private WebDriver driver;
    private final MainPastebinPage mainPastebinPage = new MainPastebinPage();

    @BeforeMethod (alwaysRun = true)
    public void browserSetup(){
        driver = new ChromeDriver();
        Dimension dimension = new Dimension(1920, 1080);
        Selenide.open("https://pastebin.com/");
        WebDriverRunner.getWebDriver().manage().window().setSize(dimension);
    }

    @Test(description = "create a new Pastebin")
    public void createNewPastebinTest() {

        driver.get("https://pastebin.com/");
        System.out.println("Step1. Page is oppened. Driver successfully started.");

        mainPastebinPage.clickOnNewPastebinButton();
        System.out.println("Step2. Click on 'Create New Pastebin' button.");

        mainPastebinPage.fillInTextForNewPastebin();
        System.out.println("Step3. Fill in 'New Paste' field with code.");

        mainPastebinPage.clickOnPasteExpirationDropDownList();
        System.out.println("Step4. Open drop-down list in 'Expiration' field.");

        mainPastebinPage.chooseExpirationTenMinutes();
        System.out.println("Step5. Select '10 minutes' value in the 'Expiration' field.");

        mainPastebinPage.fillInNameForPaste();
        System.out.println("Step6. Fill in Name in the 'Paste Name / Title' field.");

        mainPastebinPage.clickOnCreateNewButton();
        System.out.println("Step7. Click on the 'Create New Paste' field.");


    }

    @AfterMethod(alwaysRun = true)
    public void browserTearDown(){
        driver.quit();
        driver=null;
    }
}
