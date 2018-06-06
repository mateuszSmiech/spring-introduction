package pl.dominisz.springintroduction.factory;

import pl.dominisz.springintroduction.service.CreditCardProcessor;

/**
 * http://dominisz.pl
 * 06.06.2018
 */
public class CreditCardProcessorFactory {

    private static CreditCardProcessor instance;

    public static void setInstance(CreditCardProcessor creditCardProcessor) {
        instance = creditCardProcessor;
    }

    public static CreditCardProcessor getInstance() {
        return instance;
    }
}
