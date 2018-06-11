package pl.dominisz.springintroduction.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.dominisz.springintroduction.model.Receipt;

/**
 * http://dominisz.pl
 * 11.06.2018
 */
@Repository
public interface ReceiptRepository extends JpaRepository<Receipt, Long> {
}
