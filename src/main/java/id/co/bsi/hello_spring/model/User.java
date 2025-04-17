package id.co.bsi.hello_spring.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Table
@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String username;
    private String password;
    private String email;
    private String fullname;
    private String avatarUrl;
}