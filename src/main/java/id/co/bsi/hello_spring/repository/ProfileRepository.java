package id.co.bsi.hello_spring.repository;

import id.co.bsi.hello_spring.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProfileRepository extends JpaRepository<User, Long> {

}


