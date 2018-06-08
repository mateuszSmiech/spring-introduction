package pl.dominisz.springintroduction.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 * http://dominisz.pl
 * 06.06.2018
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PizzaOrder {

    private Long id;
    private LocalDateTime orderDateTime;
    private boolean completed;
    private LocalDateTime completeDateTime;
    private String description;
    private BigDecimal amount;

}
