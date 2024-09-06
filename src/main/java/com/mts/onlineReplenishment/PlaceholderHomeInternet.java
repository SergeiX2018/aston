package com.mts.onlineReplenishment;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PlaceholderHomeInternet {
    private WebDriver driver;
    public PlaceholderHomeInternet(WebDriver driver) {
        this.driver = driver;
    }
    public WebElement getSubscriberInputElement() {
        try {
            return driver.findElement(By.xpath("//input[@id='internet-phone']"));
        } catch (NoSuchElementException e) {
            System.err.println("Элемент не найден: " + e.getMessage());
            return null;
        }
    }
    public WebElement getSumInputElement() {
        try {
            return driver.findElement(By.xpath("//input[@id='internet-sum']"));
        } catch (NoSuchElementException e) {
            System.err.println("Элемент не найден: " + e.getMessage());
            return null;
        }
    }
    public WebElement getEmailInputElement() {
        try {
            return driver.findElement(By.xpath("//input[@id='internet-email']"));
        } catch (NoSuchElementException e) {
            System.err.println("Элемент не найден: " + e.getMessage());
            return null;
        }
    }
    public String getPlaceholder(WebElement element) {
        return (element != null) ? element.getAttribute("placeholder") : "";
    }
}
