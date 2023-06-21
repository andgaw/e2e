package Tests;

import PageObjects.Newsletter;
import io.qameta.allure.Description;
import org.testng.Assert;
import org.testng.annotations.Test;

public class NewsletterTest extends TestBase {

    @Test

    public void userJoinToNewsletter() {


        Newsletter newsletter = new Newsletter(driver);
        newsletter.userJoinToNewsletter();
        Assert.assertTrue(newsletter.succesMessage.isDisplayed());
        Assert.assertEquals(newsletter.succesMessage.getText(), "DZIĘKUJEMY ZA ZAPISANIE SIĘ NA NASZ NEWSLETTER. POTWIERDŹ ZAPIS KLIKAJĄC W LINK W OTRZYMANEJ WIADOMOŚCI.");
    }
}
