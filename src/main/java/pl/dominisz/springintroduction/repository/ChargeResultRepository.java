package pl.dominisz.springintroduction.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.dominisz.springintroduction.model.ChargeResult;

/**
 * http://dominisz.pl
 * 11.06.2018
 */
public interface ChargeResultRepository extends JpaRepository<ChargeResult, Long> {
}
