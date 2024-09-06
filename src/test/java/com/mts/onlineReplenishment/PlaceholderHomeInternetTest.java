package com.mts.onlineReplenishment;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PlaceholderHomeInternetTest extends BeforeAfterTest {
    @Test
    public void testAllPlaceholders() {
        String expectedPlaceholderSubscriber = "Номер абонента";
        String actualPlaceholderSubscriber = placeholderInternet.getPlaceholder(placeholderInternet.getSubscriberInputElement());
        System.out.println("Ожидаемое значение: " + expectedPlaceholderSubscriber);
        System.out.println("Фактическое значение: " + actualPlaceholderSubscriber);
        Assert.assertEquals(actualPlaceholderSubscriber, expectedPlaceholderSubscriber, "Placeholder для номера абонента не совпадает!");
        String expectedPlaceholderSum = "Сумма";
        String actualPlaceholderSum = placeholderInternet.getPlaceholder(placeholderInternet.getSumInputElement());
        System.out.println("Ожидаемое значение: " + expectedPlaceholderSum);
        System.out.println("Фактическое значение: " + actualPlaceholderSum);
        Assert.assertEquals(actualPlaceholderSum, expectedPlaceholderSum, "Placeholder для суммы не совпадает!");
        String expectedPlaceholderEmail = "E-mail для отправки чека";
        String actualPlaceholderEmail = placeholderInternet.getPlaceholder(placeholderInternet.getEmailInputElement());
        System.out.println("Ожидаемое значение: " + expectedPlaceholderEmail);
        System.out.println("Фактическое значение: " + actualPlaceholderEmail);
        Assert.assertEquals(actualPlaceholderEmail, expectedPlaceholderEmail, "Placeholder для email не совпадает!");
    }
}
