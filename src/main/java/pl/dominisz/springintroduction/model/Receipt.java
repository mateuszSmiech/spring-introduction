package pl.dominisz.springintroduction.model;

import java.math.BigDecimal;

/**
 * http://dominisz.pl
 * 06.06.2018
 */
public class Receipt {

    private final BigDecimal amount;
    private final boolean successful;
    private final String message;

    public Receipt(BigDecimal amount, boolean successful, String message) {
        this.amount = amount;
        this.successful = successful;
        this.message = message;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public String getMessage() {
        return message;
    }

    public boolean isSuccessful() {
        return successful;
    }

    public static Receipt forSuccessfulCharge(BigDecimal amount) {
        return new Receipt(amount, true, "");
    }

    public static Receipt forDeclinedCharge(String declineMessage) {
        return new Receipt(BigDecimal.ZERO, false, declineMessage);
    }

    public static Receipt forSystemFailure(String message) {
        return new Receipt(BigDecimal.ZERO, false, message);
    }
}
