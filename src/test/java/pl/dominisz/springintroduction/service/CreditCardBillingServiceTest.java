package pl.dominisz.springintroduction.service;

import org.junit.Assert;
import org.junit.Test;
import pl.dominisz.springintroduction.model.CreditCard;
import pl.dominisz.springintroduction.model.PizzaOrder;
import pl.dominisz.springintroduction.model.Receipt;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class CreditCardBillingServiceTest {

    @Test
    public void shouldCreateReceiptForProperOrder() {
        CreditCardProcessor creditCardProcessor = new TestCreditCardProcessor();
        TransactionLog transactionLog = new TestTransactionLog();

        CreditCardBillingService creditCardBillingService = new CreditCardBillingService(creditCardProcessor, transactionLog);
        PizzaOrder pizzaOrder = new PizzaOrder(1L, LocalDateTime.now(), false, null, "description", BigDecimal.TEN);
        CreditCard creditCard = new CreditCard();

        Receipt actualReceipt = creditCardBillingService.chargeOrder(pizzaOrder, creditCard);

        Assert.assertTrue(actualReceipt.isSuccessful());
        Assert.assertTrue(actualReceipt.getAmount().equals(BigDecimal.TEN));
    }

}
