package pl.dominisz.springintroduction;

import pl.dominisz.springintroduction.factory.CreditCardProcessorFactory;
import pl.dominisz.springintroduction.factory.TransactionLogFactory;
import pl.dominisz.springintroduction.model.CreditCard;
import pl.dominisz.springintroduction.model.PizzaOrder;
import pl.dominisz.springintroduction.model.Receipt;
import pl.dominisz.springintroduction.service.BillingService;
import pl.dominisz.springintroduction.service.CreditCardBillingService;
import pl.dominisz.springintroduction.service.DatabaseTransactionLog;
import pl.dominisz.springintroduction.service.PaypalCreditCardProcessor;

public class Application {

    public static void main(String[] args) {
        CreditCardProcessorFactory.setInstance(new PaypalCreditCardProcessor());
        TransactionLogFactory.setInstance(new DatabaseTransactionLog());

        BillingService billingService = new CreditCardBillingService();

        PizzaOrder pizzaOrder = new PizzaOrder();
        CreditCard creditCard = new CreditCard();

        Receipt receipt = billingService.chargeOrder(pizzaOrder, creditCard);

        System.out.println(receipt);
    }

}
