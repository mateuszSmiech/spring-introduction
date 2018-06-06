package pl.dominisz.springintroduction.service;

import org.junit.Assert;
import org.junit.Test;
import pl.dominisz.springintroduction.factory.CreditCardProcessorFactory;
import pl.dominisz.springintroduction.factory.TransactionLogFactory;
import pl.dominisz.springintroduction.model.CreditCard;
import pl.dominisz.springintroduction.model.PizzaOrder;
import pl.dominisz.springintroduction.model.Receipt;

import java.math.BigDecimal;

public class CreditCardBillingServiceTest {

    @Test
    public void shouldCreateReceiptForProperOrder() {
        CreditCardProcessorFactory.setInstance(new TestCreditCardProcessor());
        TransactionLogFactory.setInstance(new TestTransactionLog());

        CreditCardBillingService creditCardBillingService = new CreditCardBillingService();
        PizzaOrder pizzaOrder = new PizzaOrder("description", BigDecimal.TEN);
        CreditCard creditCard = new CreditCard();

        Receipt actualReceipt = creditCardBillingService.chargeOrder(pizzaOrder, creditCard);

        Assert.assertTrue(actualReceipt.isSuccessful());
        Assert.assertTrue(actualReceipt.getAmount().equals(BigDecimal.TEN));
    }

}
