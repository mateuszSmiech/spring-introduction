package pl.dominisz.springintroduction.repository;

import pl.dominisz.springintroduction.model.PizzaOrder;

import java.util.List;

/**
 * http://dominisz.pl
 * 07.06.2018
 */
public interface PizzaOrderRepository {

    List<PizzaOrder> findAll();
    PizzaOrder findById(Long id);
    PizzaOrder save(PizzaOrder pizzaOrder);

    List<PizzaOrder> searchByCompleted(boolean completed);

    void deleteById(Long id);
}
