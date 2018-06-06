package pl.dominisz.springintroduction.service;

import org.junit.Test;
import pl.dominisz.springintroduction.model.CreditCard;
import pl.dominisz.springintroduction.model.PizzaOrder;
import pl.dominisz.springintroduction.model.Receipt;

public class CreditCardBillingServiceTest {

    @Test
    void shouldCreateReceiptForProperOrder() {
        CreditCardBillingService creditCardBillingService = new CreditCardBillingService();
        PizzaOrder pizzaOrder = new PizzaOrder();
        CreditCard creditCard = new CreditCard();
        Receipt actualReceipt = creditCardBillingService.chargeOrder(pizzaOrder, creditCard);

        //TODO porównać actualReceipt z poprawnym rachunkiem
    }

}
