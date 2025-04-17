package id.co.bsi.hello_spring.repository;

import id.co.bsi.hello_spring.model.Topup;
import jakarta.persistence.criteria.From;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TopUpRepository extends JpaRepository<Topup, String> {
    List<Topup> findTopUpByFrom (String From);

}
