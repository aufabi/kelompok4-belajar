package id.co.bsi.hello_spring.repository;

import id.co.bsi.hello_spring.model.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HistoryRepository extends JpaRepository<Transaction, Long> {
}
