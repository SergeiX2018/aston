package com.mts.onlineReplenishment;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import java.time.Duration;

public class BeforeAfterTest {
    WebDriver driver;
    public Form form;
    public WebDriverWait wait;
    public LogoList logoList;
    PlaceholderCommunicationServices placeholderCommunicationServices;
    PlaceholderDebt placeholderDebt;
    PlaceholderHomeInternet placeholderInternet;
    PlaceholderInstalment placeholderInstalment;
    @BeforeMethod
    public void setup() {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.mts.by");
        form = new Form(driver);
        logoList = new LogoList(driver);
        wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        placeholderCommunicationServices = new PlaceholderCommunicationServices(driver);
        placeholderDebt = new PlaceholderDebt(driver);
        placeholderInternet = new PlaceholderHomeInternet(driver);
        placeholderInstalment = new PlaceholderInstalment(driver);
    }
    @AfterMethod
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
