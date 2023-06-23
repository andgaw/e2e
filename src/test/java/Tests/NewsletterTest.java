package Tests;

import PageObjects.Newsletter;
import io.qameta.allure.Description;
import org.testng.Assert;
import org.testng.annotations.Test;

public class NewsletterTest extends TestBase {

    @Test
    @Description("The user has subscribed to the newsletter")
    public void userJoinToNewsletter() {


        Newsletter newsletter = new Newsletter();
        newsletter.userJoinToNewsletter();
        Assert.assertTrue(newsletter.getSuccesMessage().isDisplayed());
        Assert.assertEquals(newsletter.getSuccesMessage().getText(), "DZIĘKUJEMY ZA ZAPISANIE SIĘ NA NASZ NEWSLETTER. POTWIERDŹ ZAPIS KLIKAJĄC W LINK W OTRZYMANEJ WIADOMOŚCI.");
    }
}
