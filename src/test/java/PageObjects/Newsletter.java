package PageObjects;

import static Configuration.DriverManager.getWebDriver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Newsletter {
    @FindBy(css = "#name")
    private WebElement newsletterTypeName;
    @FindBy(css = "#newsletter")
    private WebElement newsletterTypeEmail;
    @FindBy(css = "button.subscribe")
    private WebElement newsletterJoinInButton;
    @FindBy(css = "#agreement")
    private WebElement ruleNewsletterCheckbox;
    @FindBy(css = ".message-success > div:nth-child(1)")
    private WebElement succesMessage;

    public Newsletter() {
        PageFactory.initElements(getWebDriver(), this);
    }

    public void userJoinToNewsletter() {
        newsletterTypeName.sendKeys("AutomationTest");
        newsletterTypeEmail.sendKeys("tester@militaria.pl");
        ruleNewsletterCheckbox.click();
        newsletterJoinInButton.click();

    }

    public WebElement getSuccesMessage() {
        return succesMessage;
    }
}
