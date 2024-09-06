package com.mts.onlineReplenishment;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PlaceholderDebt {
    private WebDriver driver;
    public PlaceholderDebt(WebDriver driver) {
        this.driver = driver;
    }
    public WebElement getSelectDebt() {
        try {
            return driver.findElement(By.className("select-header"));
        } catch (NoSuchElementException e) {
            System.err.println("Селект не найден: " + e.getMessage());
            return null;
        }
    }
    public WebElement getNumberDept() {
        try {
            return driver.findElement(By.xpath("//input[@id='score-arrears']"));
        } catch (NoSuchElementException e) {
            System.err.println("Элемент не найден: " + e.getMessage());
            return null;
        }
    }
    public WebElement getSumDept() {
        try {
            return driver.findElement(By.xpath("//input[@id='arrears-sum']"));
        } catch (NoSuchElementException e) {
            System.err.println("Элемент не найден: " + e.getMessage());
            return null;
        }
    }
    public WebElement getEmailDept() {
        try {
            return driver.findElement(By.xpath("//input[@id='arrears-email']"));
        } catch (NoSuchElementException e) {
            System.err.println("Элемент не найден: " + e.getMessage());
            return null;
        }
    }
    public String getPlaceholder(WebElement element) {
        return (element != null) ? element.getAttribute("placeholder") : "";
    }
}

