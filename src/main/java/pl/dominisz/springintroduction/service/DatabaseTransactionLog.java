package pl.dominisz.springintroduction.service;

import pl.dominisz.springintroduction.exception.UnreachableException;
import pl.dominisz.springintroduction.model.ChargeResult;

/**
 * http://dominisz.pl
 * 06.06.2018
 */
public class DatabaseTransactionLog implements TransactionLog {

    public void logChargeResult(ChargeResult result) {
        //zapisz do bazy danych
    }

    public void logConnectException(UnreachableException e) {
        //zapisz informacje o błędzie do bazy danych
    }
}
