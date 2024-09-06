package com.mts.onlineReplenishment;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PlaceholderCommunicationServices {
    private WebDriver driver;
    public PlaceholderCommunicationServices(WebDriver driver) {
        this.driver = driver;
    }
    public WebElement getSelectCommunicationServices() {
        try {
            return driver.findElement(By.className("select-header"));
        } catch (NoSuchElementException e) {
            System.err.println("Селект не найден: " + e.getMessage());
            return null;
        }
    }
    public WebElement getPhoneInputElement() {
        try {
            return driver.findElement(By.xpath("//input[@id='connection-phone']"));
        } catch (NoSuchElementException e) {
            System.err.println("Элемент не найден: " + e.getMessage());
            return null;
        }
    }
    public WebElement getSumInputElement() {
        try {
            return driver.findElement(By.xpath("//input[@id='connection-sum']"));
        } catch (NoSuchElementException e) {
            System.err.println("Элемент не найден: " + e.getMessage());
            return null;
        }
    }
    public WebElement getEmailInputElement() {
        try {
            return driver.findElement(By.xpath("//input[@id='connection-email']"));
        } catch (NoSuchElementException e) {
            System.err.println("Элемент не найден: " + e.getMessage());
            return null;
        }
    }
    public String getPlaceholder(WebElement element) {
        return (element != null) ? element.getAttribute("placeholder") : "";
    }
}
