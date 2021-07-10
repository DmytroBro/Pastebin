package TestScenarios.Steps;

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
        WebElement expirationValueFromDropDown = driver.findElement(By.xpath("//span[@id='select2-postform-expiration-container']"));
        expirationDropDownField.click();
    }
}