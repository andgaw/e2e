package PageObjects;


import Configuration.DriverManager;
import Configuration.WaitForElements;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class SearchEngine {
    @FindBy(css = "#search")
    private WebElement searchBar;
    @FindBy(css = ".prefixbox-result-text")
    private WebElement prefixBoxResultText;
    @FindBy(css = "#prefixbox-result-count-container")
    private WebElement numberOfFindingProductsAfterSearch;


    public SearchEngine() {
        PageFactory.initElements(DriverManager.getWebDriver(), this);
    }

    public void searchProductOnMainPage() {
        WaitForElements.waitUntilElementIsVisible(searchBar);
        searchBar.click();
        searchBar.sendKeys("plecak");
        searchBar.sendKeys(Keys.RETURN);
        WaitForElements.waitUntilElementIsVisible(getPrefixBoxResultText());

          }

    public WebElement getSearchBar() {
        return searchBar;
    }

    public WebElement getPrefixBoxResultText() {
        return prefixBoxResultText;
    }

    public WebElement getNumberOfFindingProductsAfterSearch() {
        return numberOfFindingProductsAfterSearch;
    }
}

