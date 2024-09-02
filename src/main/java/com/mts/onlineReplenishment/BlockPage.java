package com.mts.onlineReplenishment;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BlockPage {
    private WebDriver driver;
    public BlockPage(WebDriver driver) {
        this.driver = driver;
    }
    public WebElement getBlockTitleElement() {
        try {
            return driver.findElement(By.cssSelector(".homepage .pay h2"));
        } catch (NoSuchElementException e) {
            System.err.println("Элемент не найден: " + e.getMessage());
            return null;
        }
    }
    public String getBlockTitle() {
        WebElement element = getBlockTitleElement();
        return (element != null) ? element.getText() : "";
    }
}
