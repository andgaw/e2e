package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Newsletter {
    @FindBy(css = "#name")
    public WebElement newsletterTypeName;
    @FindBy(css = "#newsletter")
    public WebElement newsletterTypeEmail;
    @FindBy(css = "button.subscribe")
    public WebElement newsletterJoinInButton;
    @FindBy(css = "#agreement")
    public WebElement ruleNewsletterCheckbox;
    @FindBy(css = ".message-success > div:nth-child(1)")
    public WebElement succesMessage;

    public Newsletter(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public void userJoinToNewsletter() {
        newsletterTypeName.sendKeys("AutomationTest");
        newsletterTypeEmail.sendKeys("tester@militaria.pl");
        ruleNewsletterCheckbox.click();
        newsletterJoinInButton.click();

    }
}
