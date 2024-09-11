package com.mts.onlineReplenishment;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Allure;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PlaceholderInstalmentTest extends BeforeAfterTest {
    @Test(description = "Проверка всех плейсхолдеров на странице рассрочки")
    @Epic("Тесты плейсхолдеров")
    @Feature("Проверка плейсхолдеров для полей ввода")
    @Story("Проверка плейсхолдеров для полей номера счета, суммы и email")
    @Severity(SeverityLevel.CRITICAL)
    public void testAllPlaceholders() {
        Allure.step("Проверка плейсхолдера поля 'Номер счета'", () -> {
            String expectedPlaceholderAccountNumber = "Номер счета на 44";
            String actualPlaceholderAccountNumber = placeholderInstalment.getPlaceholder(placeholderInstalment.getAccountNumbers());
            Allure.addAttachment("Ожидаемое значение для номера счета", expectedPlaceholderAccountNumber);
            Allure.addAttachment("Фактическое значение для номера счета", actualPlaceholderAccountNumber);
            Assert.assertEquals(actualPlaceholderAccountNumber, expectedPlaceholderAccountNumber, "Плейсхолдеры не совпадают!");
        });
        Allure.step("Проверка плейсхолдера поля 'Сумма'", () -> {
            String expectedPlaceholderSum = "Сумма";
            String actualPlaceholderSum = placeholderInstalment.getPlaceholder(placeholderInstalment.getSum());
            Allure.addAttachment("Ожидаемое значение для суммы", expectedPlaceholderSum);
            Allure.addAttachment("Фактическое значение для суммы", actualPlaceholderSum);
            Assert.assertEquals(actualPlaceholderSum, expectedPlaceholderSum, "Placeholder для суммы не совпадает!");
        });
        Allure.step("Проверка плейсхолдера поля 'E-mail'", () -> {
            String expectedPlaceholderEmail = "E-mail для отправки чека";
            String actualPlaceholderEmail = placeholderInstalment.getPlaceholder(placeholderInstalment.getEmail());
            Allure.addAttachment("Ожидаемое значение для email", expectedPlaceholderEmail);
            Allure.addAttachment("Фактическое значение для email", actualPlaceholderEmail);
            Assert.assertEquals(actualPlaceholderEmail, expectedPlaceholderEmail, "Placeholder для email не совпадает!");
        });
    }
}
