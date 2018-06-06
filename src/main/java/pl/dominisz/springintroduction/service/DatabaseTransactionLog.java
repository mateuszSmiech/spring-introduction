package pl.dominisz.springintroduction.service;

import org.springframework.stereotype.Component;
import pl.dominisz.springintroduction.exception.UnreachableException;
import pl.dominisz.springintroduction.model.ChargeResult;

/**
 * http://dominisz.pl
 * 06.06.2018
 */
@Component
public class DatabaseTransactionLog implements TransactionLog {

    public DatabaseTransactionLog() {
        System.out.println("DatabaseTransactionLog");
    }

    public void logChargeResult(ChargeResult result) {
        //zapisz do bazy danych
    }

    public void logConnectException(UnreachableException e) {
        //zapisz informacje o błędzie do bazy danych
    }
}
