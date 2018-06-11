package pl.dominisz.springintroduction.model;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * http://dominisz.pl
 * 06.06.2018
 */
@Data
@NoArgsConstructor
public class CreditCard {

    private String number;
    private String owner;
    private String expiryDate;
    private int ccv;

    public CreditCard(String number, String owner, String expiryDate, int ccv) {
        this.number = number;
        this.owner = owner;
        this.expiryDate = expiryDate;
        this.ccv = ccv;
    }

}
