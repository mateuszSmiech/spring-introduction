package pl.dominisz.springintroduction.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pl.dominisz.springintroduction.model.PizzaOrder;
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

    @Autowired
    public PizzaOrderController(PizzaOrderService pizzaOrderService) {
        this.pizzaOrderService = pizzaOrderService;
    }

    @RequestMapping(path = "/", method = RequestMethod.GET)
    public List<PizzaOrder> getAllOrders() {
        return pizzaOrderService.findAll();
    }

    @GetMapping(path = "/{id}")
    public PizzaOrder getOrder(@PathVariable Long id) {
        return pizzaOrderService.findById(id);
    }

    @RequestMapping(path = "/", method = RequestMethod.POST)
    public PizzaOrder createOrder(@RequestBody PizzaOrder pizzaOrder) {
        return pizzaOrderService.create(pizzaOrder);
    }
}
