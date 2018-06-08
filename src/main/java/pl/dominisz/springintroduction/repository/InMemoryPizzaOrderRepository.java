package pl.dominisz.springintroduction.repository;

import org.springframework.stereotype.Repository;
import pl.dominisz.springintroduction.exception.PizzaOrderNotFoundException;
import pl.dominisz.springintroduction.model.PizzaOrder;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

/**
 * http://dominisz.pl
 * 07.06.2018
 */
@Repository
public class InMemoryPizzaOrderRepository implements PizzaOrderRepository {

    private List<PizzaOrder> pizzaOrders;

    public InMemoryPizzaOrderRepository() {
        pizzaOrders = new ArrayList<>();
        pizzaOrders.add(new PizzaOrder(1L, LocalDateTime.now(), "Pizza Margherita", new BigDecimal(25)));
        pizzaOrders.add(new PizzaOrder(2L, LocalDateTime.now(), "Pizza Hawajska", new BigDecimal(25)));
        pizzaOrders.add(new PizzaOrder(3L, LocalDateTime.now(), "Pizza Diablo", new BigDecimal(25)));
    }

    public List<PizzaOrder> findAll() {
        return pizzaOrders;
    }

    public PizzaOrder findById(Long id) {
        return pizzaOrders.stream()
                .filter(pizzaOrder -> pizzaOrder.getId().equals(id))
                .findFirst()
                .orElseThrow(() -> new PizzaOrderNotFoundException());
    }

    public PizzaOrder save(PizzaOrder pizzaOrder) {
        Long maxId = pizzaOrders.stream()
                .mapToLong(PizzaOrder::getId)
                .max()
                .orElse(1);
        pizzaOrder.setId(maxId + 1);
        pizzaOrders.add(pizzaOrder);
        return pizzaOrder;
    }
}
