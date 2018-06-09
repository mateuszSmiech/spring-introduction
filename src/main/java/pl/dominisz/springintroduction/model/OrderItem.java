package pl.dominisz.springintroduction.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

/**
 * http://dominisz.pl
 * 08.06.2018
 */
@Entity
public class OrderItem {

    @Id
    @GeneratedValue
    private Long id;

    @ManyToOne
    private PizzaOrder pizzaOrder;

    private String description;

    public OrderItem(String s) {
        description = s;
    }
}
