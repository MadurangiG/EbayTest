package pageObjectModel.tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pageObjectModel.pages.PageBase;
import pageObjectModel.pages.PageEbayHome;

public class Ebay {

    WebDriver driver;
    @BeforeTest
    public void initBrowser(){
        driver = WebDriverManager.chromedriver().create();
        driver.manage().window();

    }

    @Test
    public void searchMobile(){
        PageBase pageBase = PageFactory.initElements(driver,PageBase.class);
        PageEbayHome pageEbayHome = pageBase.initApp("https://www.ebay.com");
        pageEbayHome.typeOnSearchField("Mobile Phone");
        pageEbayHome.selectCategory("Cell Phones & Accessories");
        pageEbayHome.clickOnSearchButton();
    }

    @AfterTest
    public void closeBrowser(){
        driver.quit();
    }


}
