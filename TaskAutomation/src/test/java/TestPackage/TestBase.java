package TestPackage;

import com.shaft.driver.SHAFT;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;

public class TestBase {

    public String URL = "https://staging.mazaady.com/login";
    public static SHAFT.GUI.WebDriver driver;

    @BeforeSuite
    public void SetupDriver() throws InterruptedException {
        System.setProperty("webdriver.http.factory", "jdk-http-client");
        driver = new SHAFT.GUI.WebDriver();
        driver.browser().navigateToURL(URL);
        driver.browser().maximizeWindow();
    }

}
