package com.mts.onlineReplenishment;
import io.qameta.allure.Allure;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;
public class FormTest extends BeforeAfterTest {
    @Test(description = "Проверка отображения всех текстов и плейсхолдеров на странице формы")
    @Epic("Тесты формы")
    @Feature("Проверка отображения информации в модальном окне")
    @Story("Проверка текста и плейсхолдеров в модальном окне после отправки формы")
    @Severity(SeverityLevel.CRITICAL)
    public void testFullTextDisplay() {
        Allure.step("Закрытие попапа с куками", () -> {
            try {
                WebElement cookieBanner = wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("cookie__wrapper")));
                Assert.assertTrue(cookieBanner.isDisplayed(), "Уведомление о куки не отображается!");
                WebElement acceptCookiesButton = wait.until(ExpectedConditions.elementToBeClickable(By.id("cookie-agree")));
                acceptCookiesButton.click();
                wait.until(ExpectedConditions.invisibilityOf(cookieBanner));
            } catch (TimeoutException e) {
                System.out.println("Попап с куками не был найден: " + e.getMessage());
            }
        });
        Allure.step("Ввод данных и отправка формы", () -> {
            form.enterNumber("297777777");
            form.enterSum("444");
            form.enterMessage("test@gmail.com");
            form.clickSubmitButton();
        });
        Allure.step("Проверка текста и плейсхолдеров в модальном окне", () -> {
            WebElement modal = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".bepaid-app")));
            WebElement iframe = modal.findElement(By.cssSelector(".bepaid-iframe"));
            driver.switchTo().frame(iframe);

            String expectedNumberText = "Оплата: Услуги связи Номер:375297777777";
            String expectedSumText = "444.00 BYN";
            String expectedSumBtnText = "Оплатить 444.00 BYN";
            String expectedPlaceholderNumberCard = "Номер карты";
            String expectedPlaceholderPeriodCard = "Срок действия";
            String expectedPlaceholderCodeCard = "CVC";
            String expectedPlaceholderHolderCard = "Имя держателя (как на карте)";

            WebElement descriptionNumberElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".pay-description__text")));
            WebElement descriptionSumElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".pay-description__cost")));
            WebElement descriptionSumBtnElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".colored.disabled")));
            WebElement descriptionPlaceholderNumberCard = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#cc-number + label")));
            WebElement descriptionPlaceholderPeriodCard = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".date-input + label")));
            WebElement descriptionPlaceholderCodeCard = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='verification_value']/following-sibling::label")));
            WebElement descriptionPlaceholderHolderCard = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@formcontrolname='holder']/following-sibling::label")));

            Assert.assertTrue(descriptionNumberElement.getText().contains(expectedNumberText), "Неверный номер в модальном окне");
            Assert.assertTrue(descriptionSumElement.getText().contains(expectedSumText), "Неверная сумма в модальном окне");
            Assert.assertTrue(descriptionSumBtnElement.getText().contains(expectedSumBtnText), "Неверный текст на кнопке суммы");
            Assert.assertEquals(descriptionPlaceholderNumberCard.getText(), expectedPlaceholderNumberCard, "Неверный плейсхолдер для номера карты");
            Assert.assertEquals(descriptionPlaceholderPeriodCard.getText(), expectedPlaceholderPeriodCard, "Неверный плейсхолдер для срока действия");
            Assert.assertEquals(descriptionPlaceholderCodeCard.getText(), expectedPlaceholderCodeCard, "Неверный плейсхолдер для CVC");
            Assert.assertEquals(descriptionPlaceholderHolderCard.getText(), expectedPlaceholderHolderCard, "Неверный плейсхолдер для имени держателя карты");

            driver.switchTo().defaultContent();
        });
    }
}
