package com.mts.onlineReplenishment;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Allure;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PlaceholderCommunicationServicesTest extends BeforeAfterTest {
    @Test(description = "Проверка всех плейсхолдеров на странице связи с абонентами")
    @Epic("Тесты плейсхолдеров")
    @Feature("Проверка плейсхолдеров для полей ввода")
    @Story("Проверка плейсхолдеров для полей телефона, суммы и email")
    @Severity(SeverityLevel.CRITICAL)
    public void testAllPlaceholders() {
        Allure.step("Проверка плейсхолдера поля 'Номер телефона'", () -> {
            String expectedPlaceholderPhone = "Номер телефона";
            String actualPlaceholderPhone = placeholderCommunicationServices.getPlaceholder(placeholderCommunicationServices.getPhoneInputElement());
            Allure.addAttachment("Ожидаемое значение для номера телефона", expectedPlaceholderPhone);
            Allure.addAttachment("Фактическое значение для номера телефона", actualPlaceholderPhone);
            Assert.assertEquals(actualPlaceholderPhone, expectedPlaceholderPhone, "Placeholder для телефона не совпадает!");
        });
        Allure.step("Проверка плейсхолдера поля 'Сумма'", () -> {
            String expectedPlaceholderSum = "Сумма";
            String actualPlaceholderSum = placeholderCommunicationServices.getPlaceholder(placeholderCommunicationServices.getSumInputElement());
            Allure.addAttachment("Ожидаемое значение для суммы", expectedPlaceholderSum);
            Allure.addAttachment("Фактическое значение для суммы", actualPlaceholderSum);
            Assert.assertEquals(actualPlaceholderSum, expectedPlaceholderSum, "Placeholder для суммы не совпадает!");
        });
        Allure.step("Проверка плейсхолдера поля 'E-mail для отправки чека'", () -> {
            String expectedPlaceholderEmail = "E-mail для отправки чека";
            String actualPlaceholderEmail = placeholderCommunicationServices.getPlaceholder(placeholderCommunicationServices.getEmailInputElement());
            Allure.addAttachment("Ожидаемое значение для email", expectedPlaceholderEmail);
            Allure.addAttachment("Фактическое значение для email", actualPlaceholderEmail);
            Assert.assertEquals(actualPlaceholderEmail, expectedPlaceholderEmail, "Placeholder для email не совпадает!");
        });
    }
}
