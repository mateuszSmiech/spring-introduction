package pl.dominisz.springintroduction.service;

import pl.dominisz.springintroduction.model.ChargeResult;
import pl.dominisz.springintroduction.model.CreditCard;

import java.math.BigDecimal;

/**
 * http://dominisz.pl
 * 06.06.2018
 */
public class TestCreditCardProcessor implements CreditCardProcessor {
    public ChargeResult charge(CreditCard creditCard, BigDecimal amount) {
        return new ChargeResult(true, "");
    }
}
