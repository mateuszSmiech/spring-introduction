package pl.dominisz.springintroduction.model;

/**
 * http://dominisz.pl
 * 06.06.2018
 */
public class ChargeResult {

    private final boolean successful;
    private final String declinedMessage;

    public ChargeResult(boolean successful, String declinedMessage) {
        this.successful = successful;
        this.declinedMessage = declinedMessage;
    }

    public boolean isSuccessful() {
        return successful;
    }

    public String getDeclinedMessage() {
        return declinedMessage;
    }

}
