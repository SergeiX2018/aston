package com.mts.onlineReplenishment;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FormTest {
    private WebDriver driver;
    private Form form;
    @BeforeMethod
    public void setup() {
        System.setProperty("webdriver.chrome.driver", "D:/chromeDriver/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.mts.by");
        form = new Form(driver);
    }
    @Test
    public void testFormSubmission() {
        form.enterNumber("297777777");
        form.enterSum("444");
        form.enterMessage("test@gmail.com");
        form.clickSubmitButton();
    }
    @AfterMethod
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
