package Tests;

import PageObjects.SearchEngine;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SearchEngineTest extends TestBase {

    @Test
    public void clickAndSearchAnyProducts() {

        SearchEngine searchEngine = new SearchEngine(driver);
        searchEngine.searchProductOnMainPage();
        Assert.assertEquals(searchEngine.prefixBoxResultText.getText(), "Wyniki wyszukiwania dla: \"plecak\"");
        Assert.assertTrue(searchEngine.numberOfFindingProductsAfterSearch.isDisplayed());
    }
}

