package pageObjectModel.pages;

import org.apache.xmlbeans.impl.xb.xsdschema.FieldDocument;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class PageEbayHome extends PageBase{

//    public final WebElement searchFields = driver.findElement(By.xpath(""));

//    OR

    @FindBy(xpath = "//input[@id='gh-ac']")
    public WebElement searchField;

    @FindBy(xpath = "//select[@id='gh-cat']")
    public WebElement categorySelector;

    @FindBy(xpath = "//input[@id='gh-btn']")
    public WebElement searchButton;

    @FindBy(xpath = "")
    private WebElement appleCheckBox;

    @FindBy(xpath = "")
    private WebElement samsungCheckBox;

    public PageEbayHome(WebDriver driver){
        super(driver);

    }

    public void typeOnSearchField(String typeValue){
        searchField.sendKeys(typeValue);

    }

    public void selectCategory(String visibleText){
        new Select(categorySelector).selectByVisibleText(visibleText);
    }

    public void clickOnSearchButton(){
        searchButton.click();
    }
}
