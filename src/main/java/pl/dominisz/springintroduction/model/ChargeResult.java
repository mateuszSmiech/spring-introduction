package pl.dominisz.springintroduction.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.time.LocalDateTime;

/**
 * http://dominisz.pl
 * 06.06.2018
 */
@Entity
public class ChargeResult {

    @Id
    @GeneratedValue
    private Long id;

    private final LocalDateTime chargeDateTime;
    private final boolean successful;
    private final String declineMessage;

    public ChargeResult(boolean successful, String declineMessage) {
        this.chargeDateTime = LocalDateTime.now();
        this.successful = successful;
        this.declineMessage = declineMessage;
    }

    public LocalDateTime getChargeDateTime() {
        return chargeDateTime;
    }

    public boolean isSuccessful() {
        return successful;
    }

    public String getDeclineMessage() {
        return declineMessage;
    }

}
