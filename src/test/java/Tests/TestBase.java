package Tests;

import Configuration.DriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

public class TestBase {

    @BeforeMethod
    public void beforeTest() throws MalformedURLException {
        WebDriver driver  = DriverManager.getWebDriver();
        WebDriverWait webDriverWait = new WebDriverWait(driver, Duration.ofSeconds(5));
        driver.navigate().to("https://militaria.pl/");
        driver.manage().window().maximize();


    }

    @AfterMethod
    public void afterTest() {
     DriverManager.disposeDriver();

    }
}

