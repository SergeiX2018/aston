package com.mts.onlineReplenishment;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import io.qameta.allure.Story;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Allure;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PlaceholderDeptTest extends BeforeAfterTest {
    @Test(description = "Проверка всех плейсхолдеров на странице погашения задолженности")
    @Epic("Тесты плейсхолдеров")
    @Feature("Проверка плейсхолдеров для полей ввода")
    @Story("Проверка плейсхолдеров для полей номера счета, суммы и email")
    @Severity(SeverityLevel.CRITICAL)
    public void testPlaceholderDept() {
        Allure.step("Проверка плейсхолдера поля 'Номер счета'", () -> {
            String expectedPlaceholderNumberDept = "Номер счета на 2073";
            String actualPlaceholderNumberDept = placeholderDebt.getPlaceholder(placeholderDebt.getNumberDept());
            Allure.addAttachment("Ожидаемое значение", expectedPlaceholderNumberDept);
            Allure.addAttachment("Фактическое значение", actualPlaceholderNumberDept);
            Assert.assertEquals(actualPlaceholderNumberDept, expectedPlaceholderNumberDept, "Плейсхолдеры не совпадают!");
        });
        Allure.step("Проверка плейсхолдера поля 'Сумма'", () -> {
            String expectedPlaceholderSum = "Сумма";
            String actualPlaceholderSum = placeholderDebt.getPlaceholder(placeholderDebt.getSumDept());
            Allure.addAttachment("Ожидаемое значение", expectedPlaceholderSum);
            Allure.addAttachment("Фактическое значение", actualPlaceholderSum);
            Assert.assertEquals(actualPlaceholderSum, expectedPlaceholderSum, "Placeholder для суммы не совпадает!");
        });
        Allure.step("Проверка плейсхолдера поля 'E-mail для отправки чека'", () -> {
            String expectedPlaceholderEmail = "E-mail для отправки чека";
            String actualPlaceholderEmail = placeholderDebt.getPlaceholder(placeholderDebt.getEmailDept());
            Allure.addAttachment("Ожидаемое значение", expectedPlaceholderEmail);
            Allure.addAttachment("Фактическое значение", actualPlaceholderEmail);
            Assert.assertEquals(actualPlaceholderEmail, expectedPlaceholderEmail, "Плейсхолдеры не совпадают!");
        });
    }
}
