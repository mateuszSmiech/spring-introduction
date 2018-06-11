package pl.dominisz.springintroduction.model;

/**
 * http://dominisz.pl
 * 06.06.2018
 */
public class CreditCard {

    private final String number;
    private final String owner;
    private final String expiryDate;
    private final int ccv;

    public CreditCard(String number, String owner, String expiryDate, int ccv) {
        this.number = number;
        this.owner = owner;
        this.expiryDate = expiryDate;
        this.ccv = ccv;
    }

}
