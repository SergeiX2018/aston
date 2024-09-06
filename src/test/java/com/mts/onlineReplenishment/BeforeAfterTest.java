package com.mts.onlineReplenishment;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BeforeAfterTest {
    WebDriver driver;
    public Form form;
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
