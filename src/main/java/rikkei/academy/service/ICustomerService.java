package rikkei.academy.service;

import org.springframework.context.annotation.Bean;
import rikkei.academy.model.Customer;

import java.util.List;
public interface ICustomerService {
    List<Customer> findAll();

    Customer findById(Long id);

    void deleteById(Long id);

    void save(Customer customer);
}
