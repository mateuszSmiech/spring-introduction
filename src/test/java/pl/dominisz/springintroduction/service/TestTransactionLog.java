package pl.dominisz.springintroduction.service;

import pl.dominisz.springintroduction.exception.UnreachableException;
import pl.dominisz.springintroduction.model.ChargeResult;

/**
 * http://dominisz.pl
 * 06.06.2018
 */
public class TestTransactionLog implements TransactionLog {
    public void logChargeResult(ChargeResult result) {

    }

    public void logConnectException(UnreachableException e) {

    }
}
