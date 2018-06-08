package pl.dominisz.springintroduction.converter;

import org.springframework.stereotype.Component;
import pl.dominisz.springintroduction.model.PizzaOrder;
import pl.dominisz.springintroduction.model.PizzaOrderDTO;

/**
 * http://dominisz.pl
 * 08.06.2018
 */
@Component
public class PizzaOrderConverter {

    public PizzaOrder convert(PizzaOrderDTO pizzaOrderDTO) {
        PizzaOrder pizzaOrder = new PizzaOrder();

        pizzaOrder.setItems(pizzaOrderDTO.getItems());
        pizzaOrder.setAmount(pizzaOrderDTO.getAmount());

        return pizzaOrder;
    }

}
