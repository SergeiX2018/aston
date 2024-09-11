package com.mts.onlineReplenishment;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PlaceholderInstalment {
    private WebDriver driver;
    public PlaceholderInstalment(WebDriver driver) {
        this.driver = driver;
    }
    public WebElement getAccountNumbers() {
        try {
            return driver.findElement(By.xpath("//input[@id='score-instalment']"));
        } catch (NoSuchElementException e) {
            System.err.println("Элемент не найден: " + e.getMessage());
            return null;
        }
    }
    public WebElement getSum() {
        try {
            return driver.findElement(By.xpath("//input[@id='instalment-sum']"));
        } catch (NoSuchElementException e) {
            System.err.println("Элемент не найден: " + e.getMessage());
            return null;
        }
    }
    public WebElement getEmail() {
        try {
            return driver.findElement(By.xpath("//input[@id='instalment-email']"));
        } catch (NoSuchElementException e) {
            System.err.println("Элемент не найден: " + e.getMessage());
            return null;
        }
    }
    public String getPlaceholder(WebElement element) {
        return (element != null) ? element.getAttribute("placeholder") : "";
    }
}

