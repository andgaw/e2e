package Tests;

import Configuration.WaitForElements;
import PageObjects.SearchEngine;
import io.qameta.allure.Description;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SearchEngineTest extends TestBase {

    @Test
    @Description("Entering the product name into the search engine" +
            " and checking the correctness of the display")
    public void clickAndSearchAnyProducts() {

        SearchEngine searchEngine = new SearchEngine();
        searchEngine.searchProductOnMainPage();
        Assert.assertEquals(searchEngine.getPrefixBoxResultText().getText(), "Wyniki wyszukiwania dla: \"plecak\"");
        Assert.assertTrue(searchEngine.getNumberOfFindingProductsAfterSearch().isDisplayed());

    }
}

