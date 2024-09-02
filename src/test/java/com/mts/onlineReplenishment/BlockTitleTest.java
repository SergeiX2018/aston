package com.mts.onlineReplenishment;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BlockTitleTest {
    WebDriver driver;
    BlockPage blockPage;
    @BeforeMethod
    public void setup() {
        System.setProperty("webdriver.chrome.driver", "D:/chromeDriver/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.mts.by/");
        blockPage = new BlockPage(driver);
    }
    @Test
    public void testBlockTitle() {
        String expectedTitle = "Онлайн пополнение без комиссии";
        String actualTitle = blockPage.getBlockTitle();
        System.out.println("Ожидаемое значение: " + expectedTitle);
        System.out.println("Фактическое значение: " + actualTitle);
        Assert.assertEquals(actualTitle, expectedTitle, "Название блока не совпадает с ожидаемым!");
    }
    @AfterMethod
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
