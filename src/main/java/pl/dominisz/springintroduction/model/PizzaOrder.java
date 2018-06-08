package pl.dominisz.springintroduction.model;

import lombok.*;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

/**
 * http://dominisz.pl
 * 06.06.2018
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class PizzaOrder {

    private Long id;
    private LocalDateTime orderDateTime;
    private boolean completed;
    private LocalDateTime completeDateTime;
    @Singular
    private List<String> items;
    private BigDecimal amount;

}
