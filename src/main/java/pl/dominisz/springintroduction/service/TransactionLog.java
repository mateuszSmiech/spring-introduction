package pl.dominisz.springintroduction.service;

import pl.dominisz.springintroduction.exception.UnreachableException;
import pl.dominisz.springintroduction.model.ChargeResult;

/**
 * http://dominisz.pl
 * 06.06.2018
 */
public interface TransactionLog {
    void logChargeResult(ChargeResult result);

    void logConnectException(UnreachableException e);
}
