package pl.dominisz.springintroduction.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

/**
 * http://dominisz.pl
 * 06.06.2018
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PizzaOrder {

    private Long id;
    private String description;
    private BigDecimal amount;

}
