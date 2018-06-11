package pl.dominisz.springintroduction.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

/**
 * http://dominisz.pl
 * 08.06.2018
 */
@Entity
@Data
@NoArgsConstructor
public class OrderItem {

    @Id
    @GeneratedValue
    private Long id;

    @ManyToOne
    @JsonIgnore
    private PizzaOrder pizzaOrder;

    private String description;

    public OrderItem(PizzaOrder pizzaOrder, String description) {
        this.pizzaOrder = pizzaOrder;
        this.description = description;
    }
}
