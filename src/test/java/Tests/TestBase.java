package Tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

public class TestBase {
    protected WebDriver driver;

    @BeforeMethod
    public void beforeTest() throws MalformedURLException {
        ChromeOptions capability = new ChromeOptions();
        capability.addArguments("--remote-allow-origins=*");
        // driver = new RemoteWebDriver(new URL("http://localhost:4444"), capability);
        System.setProperty("webdriver.chrome.driver", "C:/drivers/chromedriver.exe");
        driver = new ChromeDriver(capability);
        driver.navigate().to("https://militaria.pl/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @AfterMethod
    public void afterTest() {
        driver.close();
        driver.quit();
        driver = null;
    }
}

