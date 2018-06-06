package pl.dominisz.springintroduction.service;

import pl.dominisz.springintroduction.exception.UnreachableException;
import pl.dominisz.springintroduction.factory.CreditCardProcessorFactory;
import pl.dominisz.springintroduction.factory.TransactionLogFactory;
import pl.dominisz.springintroduction.model.ChargeResult;
import pl.dominisz.springintroduction.model.CreditCard;
import pl.dominisz.springintroduction.model.PizzaOrder;
import pl.dominisz.springintroduction.model.Receipt;

public class CreditCardBillingService implements BillingService {

    private final CreditCardProcessor creditCardProcessor;
    private final TransactionLog transactionLog;

    public CreditCardBillingService(CreditCardProcessor creditCardProcessor, TransactionLog transactionLog) {
        this.creditCardProcessor = creditCardProcessor;
        this.transactionLog = transactionLog;
    }

    public Receipt chargeOrder(PizzaOrder order, CreditCard creditCard) {

        try {
            ChargeResult result = creditCardProcessor.charge(creditCard, order.getAmount());
            transactionLog.logChargeResult(result);

            return result.isSuccessful()
                    ? Receipt.forSuccessfulCharge(order.getAmount())
                    : Receipt.forDeclinedCharge(result.getDeclineMessage());
        } catch (UnreachableException e) {
            transactionLog.logConnectException(e);
            return Receipt.forSystemFailure(e.getMessage());
        }
    }

}
