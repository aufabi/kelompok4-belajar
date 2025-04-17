package id.co.bsi.hello_spring.service;

import id.co.bsi.hello_spring.model.User;
import id.co.bsi.hello_spring.repository.ProfileRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ProfileService {

    @Autowired
    private ProfileRepository checkRepository;

    public User getCheck(Long id) {
        Optional<User> profile = this.checkRepository.findById(id);

        if (profile.isEmpty()) {
            throw new RuntimeException("profile not found");
        }

        return profile.get();
    }

    public User addCheck(User check) {
//         || check.getId().isEmpty()
        if (check.getId() == null) {
            throw new IllegalArgumentException("Id cannot be empty");
        }
        return this.checkRepository.save(check);
    }

}
