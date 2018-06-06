package pl.dominisz.springintroduction.model;

import java.math.BigDecimal;

/**
 * http://dominisz.pl
 * 06.06.2018
 */
public class PizzaOrder {
    private BigDecimal amount;

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }
}
