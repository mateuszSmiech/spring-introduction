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
    LocalDateTime orderDateTime;
    private String description;
    private BigDecimal amount;

}
