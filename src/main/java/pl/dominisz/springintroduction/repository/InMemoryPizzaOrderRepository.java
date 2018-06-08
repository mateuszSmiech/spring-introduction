package pl.dominisz.springintroduction.repository;

import org.springframework.stereotype.Repository;
import pl.dominisz.springintroduction.exception.PizzaOrderNotFoundException;
import pl.dominisz.springintroduction.model.PizzaOrder;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

/**
 * http://dominisz.pl
 * 07.06.2018
 */
@Repository
public class InMemoryPizzaOrderRepository implements PizzaOrderRepository {

    private List<PizzaOrder> pizzaOrders;

    public InMemoryPizzaOrderRepository() {
        pizzaOrders = new ArrayList<>();

        PizzaOrder order = PizzaOrder.builder()
                .id(1L)
                .orderDateTime(LocalDateTime.now())
                .item("Pizza Margherita")
                .item("Pepsi")
                .item("Beer")
                .amount(new BigDecimal(25))
                .build();

        pizzaOrders.add(order);

        order = PizzaOrder.builder()
                .id(2L)
                .orderDateTime(LocalDateTime.now())
                .item("Pizza Hawajska")
                .item("Herbata")
                .amount(new BigDecimal(20))
                .build();

        pizzaOrders.add(order);

        order = PizzaOrder.builder()
                .id(3L)
                .orderDateTime(LocalDateTime.now())
                .item("Pizza z czosnkiem")
                .item("Woda czosnkowa")
                .amount(new BigDecimal(40))
                .build();

        pizzaOrders.add(order);
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
        if (pizzaOrder.getId() == null) {
            Long maxId = pizzaOrders.stream()
                    .mapToLong(PizzaOrder::getId)
                    .max()
                    .orElse(1);
            pizzaOrder.setId(maxId + 1);
            pizzaOrders.add(pizzaOrder);
        }
        return pizzaOrder;
    }

    @Override
    public List<PizzaOrder> searchByCompleted(boolean completed) {
        return pizzaOrders.stream()
                .filter(pizzaOrder -> pizzaOrder.isCompleted() == completed)
                .collect(Collectors.toList());
    }

    @Override
    public void deleteById(Long id) {
        pizzaOrders.stream()
                .filter(pizzaOrder -> pizzaOrder.getId().equals(id))
                .findFirst()
                .ifPresent(pizzaOrder -> pizzaOrders.remove(pizzaOrder));
    }
}
