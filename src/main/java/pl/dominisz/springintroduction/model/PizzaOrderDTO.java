package pl.dominisz.springintroduction.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

/**
 * http://dominisz.pl
 * 08.06.2018
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PizzaOrderDTO {

    private String description;
    private BigDecimal amount;

}
