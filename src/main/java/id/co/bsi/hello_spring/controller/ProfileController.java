package id.co.bsi.hello_spring.controller;

import id.co.bsi.hello_spring.model.User;
import id.co.bsi.hello_spring.service.ProfileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class ProfileController {

    @Autowired
    private ProfileService profileService;

    @GetMapping("api/profile/{id}")
    public ResponseEntity<?> getProfile(@PathVariable Long id) {
        try {
            User profile = this.profileService.getCheck(id);

            User user = new User();
            user.setId(user.getId());
            user.setEmail(user.getEmail());
            user.setUsername(user.getUsername());
            user.setFullname(user.getFullname());
            user.setAvatarUrl(user.getAvatarUrl());

            return ResponseEntity.ok(profile);
        } catch (Exception e) {
            return ResponseEntity.ok(e.getMessage());
        }

    }

}
