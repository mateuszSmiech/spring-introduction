package pl.dominisz.springintroduction.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * http://dominisz.pl
 * 07.06.2018
 */
@ResponseStatus(HttpStatus.NOT_FOUND)
public class PizzaOrderNotFoundException extends RuntimeException {
}
