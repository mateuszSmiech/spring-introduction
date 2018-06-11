package pl.dominisz.springintroduction.service;

import org.springframework.stereotype.Service;
import pl.dominisz.springintroduction.exception.UnreachableException;
import pl.dominisz.springintroduction.model.ChargeResult;
import pl.dominisz.springintroduction.repository.ChargeResultRepository;

/**
 * http://dominisz.pl
 * 06.06.2018
 */
@Service
public class DatabaseTransactionLog implements TransactionLog {

    private final ChargeResultRepository chargeResultRepository;

    public DatabaseTransactionLog(ChargeResultRepository chargeResultRepository) {
        this.chargeResultRepository = chargeResultRepository;
    }

    public void logChargeResult(ChargeResult result) {
        chargeResultRepository.save(result);
    }

    public void logConnectException(UnreachableException e) {
        //zapisz informacje o błędzie do bazy danych
    }
}
