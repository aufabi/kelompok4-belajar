package id.co.bsi.hello_spring.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Table
@Entity
public class User {
    private Long id;
    private String username;
    private String password;
    private String email;
    private String fullname;
    private String avatarUrl;
}