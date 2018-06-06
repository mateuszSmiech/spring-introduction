package pl.dominisz.springintroduction.factory;

import pl.dominisz.springintroduction.service.TransactionLog;

/**
 * http://dominisz.pl
 * 06.06.2018
 */
public class TransactionLogFactory {

    private static TransactionLog instance;

    public static void setInstance(TransactionLog transactionLog) {
        instance = transactionLog;
    }

    public static TransactionLog getInstance() {
        return instance;
    }
}
