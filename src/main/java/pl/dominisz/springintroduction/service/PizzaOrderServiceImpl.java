package pl.dominisz.springintroduction.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.dominisz.springintroduction.model.PizzaOrder;
import pl.dominisz.springintroduction.repository.PizzaOrderRepository;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

/**
 * http://dominisz.pl
 * 07.06.2018
 */
@Service
public class PizzaOrderServiceImpl implements PizzaOrderService {

    @Autowired
    private PizzaOrderRepository pizzaOrderRepository;

    @Override
    public List<PizzaOrder> findAll() {
        return pizzaOrderRepository.findAll();
    }

    @Override
    public PizzaOrder findById(Long id) {
        return pizzaOrderRepository.findById(id);
    }

    @Override
    public PizzaOrder create(PizzaOrder pizzaOrder) {
        pizzaOrder.setOrderDateTime(LocalDateTime.now());
        return pizzaOrderRepository.save(pizzaOrder);
    }

    @Override
    public PizzaOrder completeOrder(Long id) {
        PizzaOrder pizzaOrder = pizzaOrderRepository.findById(id);
        pizzaOrder.setCompleted(true);
        pizzaOrder.setCompleteDateTime(LocalDateTime.now());
        return pizzaOrderRepository.save(pizzaOrder);
    }

    @Override
    public List<PizzaOrder> searchPizzaOrders(boolean completed) {
        return pizzaOrderRepository.searchByCompleted(completed);
    }

    @Override
    public void deleteById(Long id) {
        pizzaOrderRepository.deleteById(id);
    }
}
