package pl.dominisz.springintroduction.service;

import pl.dominisz.springintroduction.model.PizzaOrder;

import java.util.List;

/**
 * http://dominisz.pl
 * 07.06.2018
 */
public interface PizzaOrderService {
    List<PizzaOrder> findAll();

    PizzaOrder findById(Long id);

    PizzaOrder create(PizzaOrder pizzaOrder);

    PizzaOrder completeOrder(Long id);

    List<PizzaOrder> searchPizzaOrders(boolean completed);

    void deleteById(Long id);
}
