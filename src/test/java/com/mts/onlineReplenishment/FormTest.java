package com.mts.onlineReplenishment;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class FormTest extends BeforeAfterTest  {
    @Test
    public void testFullTextDisplay() {
        String expectedNumberText = "Оплата: Услуги связи Номер:375297777777";
        String expectedSumText = "444.00 BYN";
        String expectedSumBtnText = "Оплатить 444.00 BYN";
        String expectedPlaceholderNumberCard = "Номер карты";
        String expectedPlaceholderPeriodCard = "Срок действия";
        String expectedPlaceholderCodeCard = "CVC";
        String expectedPlaceholderHolderCard = "Имя держателя (как на карте)";
        form.enterNumber("297777777");
        form.enterSum("444");
        form.enterMessage("test@gmail.com");
        form.clickSubmitButton();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        WebElement modal = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".bepaid-app")));
        WebElement iframe = modal.findElement(By.cssSelector(".bepaid-iframe"));
        driver.switchTo().frame(iframe);
        WebElement descriptionNumberElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".pay-description__text")));
        WebElement descriptionSumElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".pay-description__cost")));
        WebElement descriptionSumBtnElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".colored.disabled")));
        WebElement descriptionPlaceholderNumberCard = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#cc-number + label")));
        WebElement descriptionPlaceholderPeriodCard = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".date-input + label")));
        WebElement descriptionPlaceholderCodeCard = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='verification_value']/following-sibling::label")));
        WebElement descriptionPlaceholderHolderCard = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@formcontrolname='holder']/following-sibling::label")));
        String actualNumberText = descriptionNumberElement.getText().trim();
        String actualSumText = descriptionSumElement.getText().trim();
        String actualSumBtnText = descriptionSumBtnElement.getText().trim();
        String actualPlaceholderNumberText = descriptionPlaceholderNumberCard.getText().trim();
        String actualPlaceholderPeriodText = descriptionPlaceholderPeriodCard.getText().trim();
        String actualPlaceholderCodeText = descriptionPlaceholderCodeCard.getText().trim();
        String actualPlaceholderHolderText = descriptionPlaceholderHolderCard.getText().trim();
        List<String> expectedLogoUrls = new ArrayList<>();
        expectedLogoUrls.add("https://checkout.bepaid.by/widget_v2/assets/images/payment-icons/card-types/visa-system.svg");
        expectedLogoUrls.add("https://checkout.bepaid.by/widget_v2/assets/images/payment-icons/card-types/mastercard-system.svg");
        expectedLogoUrls.add("https://checkout.bepaid.by/widget_v2/assets/images/payment-icons/card-types/belkart-system.svg");
        expectedLogoUrls.add("https://checkout.bepaid.by/widget_v2/assets/images/payment-icons/card-types/maestro-system.svg");
        List<String> actualLogoUrls = logoList.getLogoUrls();
        Assert.assertTrue(actualLogoUrls.containsAll(expectedLogoUrls), "Не все ожидаемые логотипы найдены на странице!");
        driver.switchTo().defaultContent();
        System.out.println("Ожидаемое значение: " + expectedNumberText);
        System.out.println("Фактическое значение: " + actualNumberText);
        System.out.println("Ожидаемое значение: " + expectedSumText);
        System.out.println("Фактическое значение: " + actualSumText);
        System.out.println("Ожидаемое значение: " + expectedSumBtnText);
        System.out.println("Фактическое значение: " + actualSumBtnText);
        System.out.println("Ожидаемое значение: " + expectedPlaceholderNumberCard);
        System.out.println("Фактическое значение: " + actualPlaceholderNumberText);
        System.out.println("Ожидаемое значение: " + expectedPlaceholderPeriodCard);
        System.out.println("Фактическое значение: " + actualPlaceholderPeriodText);
        System.out.println("Ожидаемое значение: " + expectedPlaceholderCodeCard);
        System.out.println("Фактическое значение: " + actualPlaceholderCodeText);
        System.out.println("Ожидаемое значение: " + expectedPlaceholderHolderCard);
        System.out.println("Фактическое значение: " + actualPlaceholderHolderText);
        System.out.println("Ожидаемое значение логотипов " + expectedLogoUrls);
        System.out.println("Фактическое значение логотипов" + actualLogoUrls);
        Assert.assertTrue(actualNumberText.contains(expectedNumberText), "Ожидаемый текст не найден в модальном окне");
        Assert.assertTrue(actualSumText.contains(expectedSumText), "Ожидаемый текст не найден в модальном окне");
        Assert.assertTrue(actualSumBtnText.contains(expectedSumBtnText), "Ожидаемый текст не найден в модальном окне");
        Assert.assertTrue(actualPlaceholderNumberText.contains(expectedPlaceholderNumberCard), "Ожидаемый текст не найден в модальном окне");
        Assert.assertTrue(actualPlaceholderPeriodText.contains(expectedPlaceholderPeriodCard), "Ожидаемый текст не найден в модальном окне");
        Assert.assertTrue(actualPlaceholderCodeText.contains(expectedPlaceholderCodeCard), "Ожидаемый текст не найден в модальном окне");
        Assert.assertTrue(actualPlaceholderHolderText.contains(expectedPlaceholderHolderCard), "Ожидаемый текст не найден в модальном окне");
    }


}
