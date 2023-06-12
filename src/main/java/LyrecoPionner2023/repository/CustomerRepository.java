package LyrecoPionner2023.repository;

import LyrecoPionner2023.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface CustomerRepository extends JpaRepository <Customer,Long> {


    Optional<Customer> findById(Long id);

}
