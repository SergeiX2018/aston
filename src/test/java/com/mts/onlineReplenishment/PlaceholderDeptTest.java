package com.mts.onlineReplenishment;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PlaceholderDeptTest extends BeforeAfterTest{
    @Test
    public void testPlaceholderDept() {
        String expectedPlaceholderNumberDept = "Номер счета на 2073";
        String actualPlaceholderNumberDept = placeholderDebt.getPlaceholder(placeholderDebt.getNumberDept());
        System.out.println("Ожидаемое значение: " + expectedPlaceholderNumberDept);
        System.out.println("Фактическое значение: " + actualPlaceholderNumberDept);
        Assert.assertEquals(actualPlaceholderNumberDept, expectedPlaceholderNumberDept, "Плейсхолдеры не совпадают!");
        String expectedPlaceholderSum = "Сумма";
        String actualPlaceholderSum = placeholderDebt.getPlaceholder(placeholderDebt.getSumDept());
        System.out.println("Ожидаемое значение: " + expectedPlaceholderSum);
        System.out.println("Фактическое значение: " + actualPlaceholderSum);
        Assert.assertEquals(actualPlaceholderSum, expectedPlaceholderSum, "Placeholder для суммы не совпадает!");
        String expectedPlaceholderEmail = "E-mail для отправки чека";
        String actualPlaceholderEmail = placeholderDebt.getPlaceholder(placeholderDebt.getEmailDept());
        System.out.println("Ожидаемое значение: " + expectedPlaceholderEmail);
        System.out.println("Фактическое значение: " + actualPlaceholderEmail);
        Assert.assertEquals(actualPlaceholderEmail, expectedPlaceholderEmail, "Плейсхолдеры не совпадают!");
    }
}

