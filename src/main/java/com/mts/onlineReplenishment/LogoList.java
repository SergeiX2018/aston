package com.mts.onlineReplenishment;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.util.List;
import java.util.ArrayList;
public class LogoList {
    private WebDriver driver;
    public LogoList(WebDriver driver) {
        this.driver = driver;
    }
    public List<WebElement> getLogos() {
        return driver.findElements(By.cssSelector(".cards-brands  img"));
    }
    public List<String> getLogoUrls() {
        List<String> logoUrls = new ArrayList<>();
        List<WebElement> logos = getLogos();
        for (WebElement logo : logos) {
            String url = logo.getAttribute("src");
            logoUrls.add(url);
        }
        return logoUrls;
    }
}



