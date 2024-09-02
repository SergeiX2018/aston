package com.mts.onlineReplenishment;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import java.io.IOException;

public class LinkTest {
    private WebDriver driver;
    private Link linkChecker;
    @BeforeMethod
    public void setup() {
        System.setProperty("webdriver.chrome.driver", "D:/chromeDriver/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.mts.by");
        linkChecker = new Link();
    }
    @Test
    public void testLinkIsWorking() throws IOException {
        WebElement linkElement = driver.findElement(By.xpath("//a[text()='Подробнее о сервисе']"));
        String url = linkElement.getAttribute("href");
        Assert.assertNotNull(url, "Ссылка не содержит URL!");
        System.out.println("URL ссылки: " + url);
        int statusCode = linkChecker.getHttpResponseCode(url);
        System.out.println("Код статуса ответа для ссылки: " + statusCode);
        Assert.assertEquals(statusCode, 200, "Ссылка недоступна или вернула неверный код ответа!");
    }
    @AfterMethod
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}


