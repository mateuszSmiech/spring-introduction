package pl.dominisz.springintroduction.service;

import org.springframework.stereotype.Component;
import pl.dominisz.springintroduction.model.ChargeResult;
import pl.dominisz.springintroduction.model.CreditCard;

import java.math.BigDecimal;

/**
 * http://dominisz.pl
 * 06.06.2018
 */

@Component
public class PaypalCreditCardProcessor implements CreditCardProcessor {

    public ChargeResult charge(CreditCard creditCard, BigDecimal amount) {
        return new ChargeResult(true, "");
    }
}
