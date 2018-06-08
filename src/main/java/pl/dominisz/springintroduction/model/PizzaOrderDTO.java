package pl.dominisz.springintroduction.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.List;

/**
 * http://dominisz.pl
 * 08.06.2018
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PizzaOrderDTO {

    private List<String> items;
    private BigDecimal amount;

}
