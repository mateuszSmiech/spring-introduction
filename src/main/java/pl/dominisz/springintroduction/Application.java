package pl.dominisz.springintroduction;

import pl.dominisz.springintroduction.factory.CreditCardProcessorFactory;
import pl.dominisz.springintroduction.factory.TransactionLogFactory;
import pl.dominisz.springintroduction.model.CreditCard;
import pl.dominisz.springintroduction.model.PizzaOrder;
import pl.dominisz.springintroduction.model.Receipt;
import pl.dominisz.springintroduction.service.*;

import java.math.BigDecimal;

public class Application {

    public static void main(String[] args) {
        CreditCardProcessor creditCardProcessor = new PaypalCreditCardProcessor();
        TransactionLog transactionLog = new DatabaseTransactionLog();

        BillingService billingService = new CreditCardBillingService(creditCardProcessor, transactionLog);

        PizzaOrder pizzaOrder = new PizzaOrder("Pizza Margherita", new BigDecimal(25));
        CreditCard creditCard = new CreditCard();

        Receipt receipt = billingService.chargeOrder(pizzaOrder, creditCard);

        System.out.println(receipt);
    }

}
