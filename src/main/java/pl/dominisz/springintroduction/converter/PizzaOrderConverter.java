package pl.dominisz.springintroduction.converter;

import org.springframework.stereotype.Component;
import pl.dominisz.springintroduction.model.OrderItem;
import pl.dominisz.springintroduction.model.PizzaOrder;
import pl.dominisz.springintroduction.model.PizzaOrderDTO;

import java.util.List;
import java.util.stream.Collectors;

/**
 * http://dominisz.pl
 * 08.06.2018
 */
@Component
public class PizzaOrderConverter {

    public PizzaOrder convert(PizzaOrderDTO pizzaOrderDTO) {
        PizzaOrder pizzaOrder = new PizzaOrder();

        List<OrderItem> orderItemList = pizzaOrderDTO.getItems().stream()
                .map(description -> new OrderItem(pizzaOrder, description))
                .collect(Collectors.toList());

        pizzaOrder.setItems(orderItemList);
        pizzaOrder.setAmount(pizzaOrderDTO.getAmount());

        return pizzaOrder;
    }

}
