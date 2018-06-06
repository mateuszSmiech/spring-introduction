package pl.dominisz.springintroduction.model;

import java.math.BigDecimal;

/**
 * http://dominisz.pl
 * 06.06.2018
 */
public class PizzaOrder {

    private String description;
    private BigDecimal amount;

    public PizzaOrder(String description, BigDecimal amount) {
        this.description = description;
        this.amount = amount;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }
}
