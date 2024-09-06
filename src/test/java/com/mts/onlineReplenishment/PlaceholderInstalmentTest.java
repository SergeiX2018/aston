package com.mts.onlineReplenishment;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PlaceholderInstalmentTest extends BeforeAfterTest {
    @Test
    public void testAllPlaceholders() {
        String expectedPlaceholderAccountNumber = "Номер счета на 44";
        String actualPlaceholderAccountNumber = placeholderInstalment.getPlaceholder(placeholderInstalment.getAccountNumbers());
        System.out.println("Ожидаемое значение: " + expectedPlaceholderAccountNumber);
        System.out.println("Фактическое значение: " + actualPlaceholderAccountNumber);
        Assert.assertEquals(actualPlaceholderAccountNumber, expectedPlaceholderAccountNumber, "Плейсхолдеры не совпадают!");
        String expectedPlaceholderSum = "Сумма";
        String actualPlaceholderSum = placeholderInstalment.getPlaceholder(placeholderInstalment.getSum());
        System.out.println("Ожидаемое значение: " + expectedPlaceholderSum);
        System.out.println("Фактическое значение: " + actualPlaceholderSum);
        Assert.assertEquals(actualPlaceholderSum, expectedPlaceholderSum, "Placeholder для суммы не совпадает!");
        String expectedPlaceholderEmail = "E-mail для отправки чека";
        String actualPlaceholderEmail = placeholderInternet.getPlaceholder(placeholderInstalment.getEmail());
        System.out.println("Ожидаемое значение: " + expectedPlaceholderEmail);
        System.out.println("Фактическое значение: " + actualPlaceholderEmail);
        Assert.assertEquals(actualPlaceholderEmail, expectedPlaceholderEmail, "Placeholder для email не совпадает!");
    }
}

