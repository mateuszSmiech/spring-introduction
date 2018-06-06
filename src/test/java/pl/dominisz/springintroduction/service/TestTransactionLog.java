package pl.dominisz.springintroduction.service;

import pl.dominisz.springintroduction.exception.UnreachableException;
import pl.dominisz.springintroduction.model.ChargeResult;

/**
 * http://dominisz.pl
 * 06.06.2018
 */
public class TestTransactionLog implements TransactionLog {

    private ChargeResult chargeResult;

    public void logChargeResult(ChargeResult result) {
        chargeResult = result;
    }

    public void logConnectException(UnreachableException e) {

    }
}
