package pl.dominisz.springintroduction.service;

import org.springframework.stereotype.Service;
import pl.dominisz.springintroduction.model.PizzaOrder;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * http://dominisz.pl
 * 07.06.2018
 */
@Service
public class PizzaOrderServiceImpl implements PizzaOrderService {
    @Override
    public List<PizzaOrder> findAll() {
        List<PizzaOrder> pizzaOrders = new ArrayList<>();
        pizzaOrders.add(new PizzaOrder("Pizza Margherita", new BigDecimal(25)));
        pizzaOrders.add(new PizzaOrder("Pizza Hawajska", new BigDecimal(25)));
        pizzaOrders.add(new PizzaOrder("Pizza Diablo", new BigDecimal(25)));
        return pizzaOrders;
    }

    @Override
    public PizzaOrder findById(Long id) {
        return new PizzaOrder("Pizza Margherita", new BigDecimal(25));
    }

    @Override
    public PizzaOrder create(PizzaOrder pizzaOrder) {
        return null;
    }
}
