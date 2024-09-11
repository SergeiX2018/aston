package com.mts.onlineReplenishment;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class Form {
    private WebDriver driver;
    private WebDriverWait wait;
    public Form(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(20));
    }
    public void enterNumber(String number) {
        WebElement numberField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("connection-phone")));
        numberField.sendKeys(number);
    }
    public void enterSum(String sum) {
        WebElement sumField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("connection-sum")));
        sumField.sendKeys(sum);
    }
    public void enterMessage(String message) {
        WebElement messageField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("connection-email")));
        messageField.sendKeys(message);
    }
    public void clickSubmitButton() {
        WebElement submitButton = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(".button.button__default")));
        submitButton.click();
    }
}
