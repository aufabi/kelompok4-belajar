package id.co.bsi.hello_spring.controller;

import id.co.bsi.hello_spring.model.User;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String hello() {
        return "Hello world!";
    }

    @GetMapping("/users")
    public ResponseEntity<User> getUser() {
        User user = new User();
        user.setId(1);
        user.setEmail("admin@gmail.com");
        user.setUsername("admin");
        return ResponseEntity.ok(user);
    }

    @PostMapping("/users")
    public ResponseEntity<User> createUser(@RequestBody User userRequestBody){
        return ResponseEntity.ok(userRequestBody);
    }
}
