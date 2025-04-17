package id.co.bsi.hello_spring.model;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Table
@Entity
public class Topup {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int amount;
    private String from;
    private String notes;
}
