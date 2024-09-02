package com.mts.onlineReplenishment;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import java.util.ArrayList;
import java.util.List;

public class LogoElementsTest {
    private WebDriver driver;
    private LogoElements logoElements;
    @BeforeMethod
    public void setup() {
        System.setProperty("webdriver.chrome.driver", "D:/chromeDriver/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://mts.by");
        logoElements = new LogoElements(driver);
    }
    @Test
    public void testLogosPresence() {
        List<String> expectedLogoUrls = new ArrayList<>();
        expectedLogoUrls.add("https://www.mts.by/local/templates/new_design/assets/html/images/pages/index/pay/visa.svg");
        expectedLogoUrls.add("https://www.mts.by/local/templates/new_design/assets/html/images/pages/index/pay/visa-verified.svg");
        expectedLogoUrls.add("https://www.mts.by/local/templates/new_design/assets/html/images/pages/index/pay/mastercard.svg");
        expectedLogoUrls.add("https://www.mts.by/local/templates/new_design/assets/html/images/pages/index/pay/mastercard-secure.svg");
        expectedLogoUrls.add("https://www.mts.by/local/templates/new_design/assets/html/images/pages/index/pay/belkart.svg");
        List<String> actualLogoUrls = logoElements.getLogoUrls();
        System.out.println("Ожидаемое значение: " + expectedLogoUrls);
        System.out.println("Фактическое значение: " + actualLogoUrls);
        Assert.assertTrue(actualLogoUrls.containsAll(expectedLogoUrls),
                "Не все ожидаемые логотипы найдены на странице!");
    }
    @AfterMethod
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}

