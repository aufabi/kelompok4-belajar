package id.co.bsi.hello_spring.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Table
@Entity
public class Topup {
    private int amount;
    private String from;
    private String notes;
}
