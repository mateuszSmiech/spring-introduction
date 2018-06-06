package pl.dominisz.springintroduction.service;

import pl.dominisz.springintroduction.model.ChargeResult;
import pl.dominisz.springintroduction.model.CreditCard;

import java.math.BigDecimal;

/**
 * http://dominisz.pl
 * 06.06.2018
 */
public interface CreditCardProcessor {
    ChargeResult charge(CreditCard creditCard, BigDecimal amount);
}
