package pl.dominisz.springintroduction.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.dominisz.springintroduction.model.PizzaOrder;

import java.util.List;

/**
 * http://dominisz.pl
 * 07.06.2018
 */
public interface PizzaOrderRepository extends JpaRepository<PizzaOrder, Long> {

    List<PizzaOrder> findByCompleted(boolean completed);

}
