package com.mts.onlineReplenishment;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Allure;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PlaceholderHomeInternetTest extends BeforeAfterTest {
    @Test(description = "Проверка всех плейсхолдеров на странице интернет-пополнения")
    @Epic("Тесты плейсхолдеров")
    @Feature("Проверка плейсхолдеров для полей ввода")
    @Story("Проверка плейсхолдеров для полей абонента, суммы и email")
    @Severity(SeverityLevel.CRITICAL)
    public void testAllPlaceholders() {
        Allure.step("Проверка плейсхолдера поля 'Номер абонента'", () -> {
            String expectedPlaceholderSubscriber = "Номер абонента";
            String actualPlaceholderSubscriber = placeholderInternet.getPlaceholder(placeholderInternet.getSubscriberInputElement());
            Allure.addAttachment("Ожидаемое значение", expectedPlaceholderSubscriber);
            Allure.addAttachment("Фактическое значение", actualPlaceholderSubscriber);
            Assert.assertEquals(actualPlaceholderSubscriber, expectedPlaceholderSubscriber, "Placeholder для номера абонента не совпадает!");
        });
        Allure.step("Проверка плейсхолдера поля 'Сумма'", () -> {
            String expectedPlaceholderSum = "Сумма";
            String actualPlaceholderSum = placeholderInternet.getPlaceholder(placeholderInternet.getSumInputElement());
            Allure.addAttachment("Ожидаемое значение", expectedPlaceholderSum);
            Allure.addAttachment("Фактическое значение", actualPlaceholderSum);
            Assert.assertEquals(actualPlaceholderSum, expectedPlaceholderSum, "Placeholder для суммы не совпадает!");
        });
        Allure.step("Проверка плейсхолдера поля 'E-mail для отправки чека'", () -> {
            String expectedPlaceholderEmail = "E-mail для отправки чека";
            String actualPlaceholderEmail = placeholderInternet.getPlaceholder(placeholderInternet.getEmailInputElement());
            Allure.addAttachment("Ожидаемое значение", expectedPlaceholderEmail);
            Allure.addAttachment("Фактическое значение", actualPlaceholderEmail);
            Assert.assertEquals(actualPlaceholderEmail, expectedPlaceholderEmail, "Placeholder для email не совпадает!");
        });
    }
}
