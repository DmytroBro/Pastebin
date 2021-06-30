package PageObjects;

import org.openqa.selenium.By;
import static com.codeborne.selenide.Selenide.$;
import org.openqa.selenium.WebElement;


public class MainPastebinPage {

    private static final By BUTTON_CREATE_NEW_PASTEBIN = By.xpath("//a[normalize-space()='paste']");

    public static final By TEXT_FIELD_NEW_PASTEBIN = By.xpath("//textarea[@id='postform-text']");

    public static final By DROPDOWN_LIST_PASTE_EXPIRATION = By.xpath("//span[@id='select2-postform-expiration-container']");

    public static final By TEN_MINUTES_PASTE_EXPIRATION = By.xpath("//div[@class='form-group field-postform-folder_key']//span[@role='combobox']");

    public static final By PASTE_NAME_TITLE_FIELD = By.xpath("//input[@id='postform-name']");

    public static final By CREATE_NEW_PASTE_BUTTON = By.xpath("//button[normalize-space()='Create New Paste']");

    public static void clickOnNewPastebinButton() {
        $(BUTTON_CREATE_NEW_PASTEBIN).click();
    }

    public void fillInTextForNewPastebin(){
        $(TEXT_FIELD_NEW_PASTEBIN).sendKeys("Hello from WebDriver");
    }

    public static void clickOnPasteExpirationDropDownList() {
        $(DROPDOWN_LIST_PASTE_EXPIRATION).click();
    }

    public static void chooseExpirationTenMinutes() {
        $(TEN_MINUTES_PASTE_EXPIRATION).click();
    }

    public void fillInNameForPaste(){
        $(PASTE_NAME_TITLE_FIELD).sendKeys("helloweb");
    }

    public static void clickOnCreateNewButton() {
        $(CREATE_NEW_PASTE_BUTTON).click();
    }

}