package pl.dominisz.springintroduction.model;

/**
 * http://dominisz.pl
 * 06.06.2018
 */
public class ChargeResult {

    private final boolean successful;
    private final String declineMessage;

    public ChargeResult(boolean successful, String declineMessage) {
        this.successful = successful;
        this.declineMessage = declineMessage;
    }

    public boolean isSuccessful() {
        return successful;
    }

    public String getDeclineMessage() {
        return declineMessage;
    }

}
