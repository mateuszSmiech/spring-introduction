package pl.dominisz.springintroduction.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.dominisz.springintroduction.exception.PizzaOrderNotFoundException;
import pl.dominisz.springintroduction.model.CreditCard;
import pl.dominisz.springintroduction.model.PizzaOrder;
import pl.dominisz.springintroduction.model.Receipt;
import pl.dominisz.springintroduction.repository.PizzaOrderRepository;
import pl.dominisz.springintroduction.repository.ReceiptRepository;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 * http://dominisz.pl
 * 07.06.2018
 */
@Service
public class PizzaOrderServiceImpl implements PizzaOrderService {

    @Autowired
    private PizzaOrderRepository pizzaOrderRepository;

    @Autowired
    private CreditCardBillingService creditCardBillingService;

    @Autowired
    private ReceiptRepository receiptRepository;

    @Override
    public List<PizzaOrder> findAll() {
        return pizzaOrderRepository.findAll();
    }

    @Override
    public PizzaOrder findById(Long id) {
        return pizzaOrderRepository.findById(id)
                .orElseThrow(() -> new PizzaOrderNotFoundException());
    }

    @Override
    public PizzaOrder create(PizzaOrder pizzaOrder) {
        pizzaOrder.setOrderDateTime(LocalDateTime.now());
        return pizzaOrderRepository.save(pizzaOrder);
    }

    @Override
    public PizzaOrder completeOrder(Long id) {
        PizzaOrder pizzaOrder = pizzaOrderRepository.findById(id)
                .orElseThrow(() -> new PizzaOrderNotFoundException());
        pizzaOrder.setCompleted(true);
        pizzaOrder.setCompleteDateTime(LocalDateTime.now());
        return pizzaOrderRepository.save(pizzaOrder);
    }

    @Override
    public List<PizzaOrder> searchPizzaOrders(boolean completed) {
        return pizzaOrderRepository.findByCompleted(completed);
    }

    @Override
    public void deleteById(Long id) {
        pizzaOrderRepository.deleteById(id);
    }

    @Override
    public Receipt chargeOrder(Long id, CreditCard creditCard) {
        PizzaOrder pizzaOrder = pizzaOrderRepository.findById(id)
                .orElseThrow(() -> new PizzaOrderNotFoundException());
        Receipt receipt = creditCardBillingService.chargeOrder(pizzaOrder, creditCard);
        receiptRepository.save(receipt);
        return receipt;
    }
}
