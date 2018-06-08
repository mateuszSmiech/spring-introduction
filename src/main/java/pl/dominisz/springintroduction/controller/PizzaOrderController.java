package pl.dominisz.springintroduction.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pl.dominisz.springintroduction.converter.PizzaOrderConverter;
import pl.dominisz.springintroduction.model.PizzaOrder;
import pl.dominisz.springintroduction.model.PizzaOrderDTO;
import pl.dominisz.springintroduction.service.PizzaOrderService;

import java.util.List;

/**
 * http://dominisz.pl
 * 07.06.2018
 */
@RestController
@RequestMapping(path = "/pizzaorders")
public class PizzaOrderController {

    private final PizzaOrderService pizzaOrderService;
    private final PizzaOrderConverter pizzaOrderConverter;

    @Autowired
    public PizzaOrderController(PizzaOrderService pizzaOrderService, PizzaOrderConverter pizzaOrderConverter) {
        this.pizzaOrderService = pizzaOrderService;
        this.pizzaOrderConverter = pizzaOrderConverter;
    }

    @GetMapping(path = "/")
    public List<PizzaOrder> getAllOrders() {
        return pizzaOrderService.findAll();
    }

    @GetMapping(path = "/{id}")
    public PizzaOrder getOrder(@PathVariable Long id) {
        return pizzaOrderService.findById(id);
    }

    @PutMapping(path = "/{id}/completed")
    public PizzaOrder completeOrder(@PathVariable Long id) {
        return pizzaOrderService.completeOrder(id);
    }

    @PostMapping(path = "/")
    public PizzaOrder createOrder(@RequestBody PizzaOrderDTO pizzaOrderDTO) {
        PizzaOrder pizzaOrder = pizzaOrderConverter.convert(pizzaOrderDTO);
        return pizzaOrderService.create(pizzaOrder);
    }

    @GetMapping("/search")
    public List<PizzaOrder> searchPizzaOrders(@RequestParam boolean completed) {
        return pizzaOrderService.searchPizzaOrders(completed);
    }

    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Long id) {
        pizzaOrderService.deleteById(id);
    }

}
