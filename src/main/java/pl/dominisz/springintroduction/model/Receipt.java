package pl.dominisz.springintroduction.model;

import java.math.BigDecimal;

/**
 * http://dominisz.pl
 * 06.06.2018
 */
public class Receipt {
    public static Receipt forSuccessfulCharge(BigDecimal amount) {
        return null;
    }

    public static Receipt forDeclinedCharge(String declineMessage) {
        return null;
    }

    public static Receipt forSystemFailure(String message) {
        return null;
    }
}
