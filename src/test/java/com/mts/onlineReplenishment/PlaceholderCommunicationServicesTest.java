package com.mts.onlineReplenishment;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PlaceholderCommunicationServicesTest extends BeforeAfterTest {
    @Test
    public void testAllPlaceholders() {
        // Проверка placeholder для телефона
        String expectedPlaceholderPhone = "Номер телефона";
        String actualPlaceholderPhone = placeholderCommunicationServices.getPlaceholder(placeholderCommunicationServices.getPhoneInputElement());
        System.out.println("Ожидаемое значение: " + expectedPlaceholderPhone);
        System.out.println("Фактическое значение: " + actualPlaceholderPhone);
        Assert.assertEquals(actualPlaceholderPhone, expectedPlaceholderPhone, "Placeholder для телефона не совпадает!");
        String expectedPlaceholderSum = "Сумма";
        String actualPlaceholderSum = placeholderCommunicationServices.getPlaceholder(placeholderCommunicationServices.getSumInputElement());
        System.out.println("Ожидаемое значение: " + expectedPlaceholderSum);
        System.out.println("Фактическое значение: " + actualPlaceholderSum);
        Assert.assertEquals(actualPlaceholderSum, expectedPlaceholderSum, "Placeholder для суммы не совпадает!");
        String expectedPlaceholderEmail = "E-mail для отправки чека";
        String actualPlaceholderEmail = placeholderCommunicationServices.getPlaceholder(placeholderCommunicationServices.getEmailInputElement());
        System.out.println("Ожидаемое значение: " + expectedPlaceholderEmail);
        System.out.println("Фактическое значение: " + actualPlaceholderEmail);
        Assert.assertEquals(actualPlaceholderEmail, expectedPlaceholderEmail, "Placeholder для email не совпадает!");
    }
}
