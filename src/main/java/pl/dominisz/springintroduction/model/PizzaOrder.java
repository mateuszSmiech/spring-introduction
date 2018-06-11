package pl.dominisz.springintroduction.model;

import lombok.*;

import javax.persistence.*;
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
@Entity
public class PizzaOrder {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private LocalDateTime orderDateTime;

    private boolean completed;

    private LocalDateTime completeDateTime;

    @Singular
    @OneToMany(mappedBy = "pizzaOrder", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<OrderItem> items;

    private BigDecimal amount;

}
