package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenMainPageCreateNewPastebin {
    public static void mainPastebinPage(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://pastebin.com/");
        WebElement pasteBinInputCodeArea = driver.findElement(By.id("postform-text"));
        pasteBinInputCodeArea.sendKeys("Hello from WebDriver");
        WebElement expirationDropDownField = driver.findElement(By.xpath("//span[@id='select2-postform-expiration-container']"));
        expirationDropDownField.click();
        WebElement expirationValueFromDropDown = driver.findElement(By.id("select2-postform-expiration-result-lpg9-10M"));
        expirationValueFromDropDown.click();
        WebElement pasteNameTitleField = driver.findElement(By.id("postform-name"));
        pasteNameTitleField.sendKeys("helloweb");
        WebElement createNewPasteButton = driver.findElement(By.xpath("//button[normalize-space()='Create New Paste']"));
        createNewPasteButton.click();

        WebElement titleOnSummaryPastebinPage = driver.findElement(By.xpath("//h1[normalize-space()='helloWeb']"));
        titleOnSummaryPastebinPage.getText();
//        Assert.assertTrue(titleOnSummaryPastebinPage="helloweb", "ERROR! Title on summery page is not as expected");
        Thread.sleep(2000);
        driver.quit();
    }
}