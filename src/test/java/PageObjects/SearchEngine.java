package PageObjects;


import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchEngine {
    @FindBy(css = "#search")
    public WebElement searchBar;
    @FindBy(css = ".prefixbox-result-text")
    public WebElement prefixBoxResultText;
    @FindBy(css = "#prefixbox-result-count-container")
    public WebElement numberOfFindingProductsAfterSearch;


    public SearchEngine(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public void searchProductOnMainPage() {

        searchBar.click();
        searchBar.sendKeys("plecak");
        searchBar.sendKeys(Keys.RETURN);

    }

}

