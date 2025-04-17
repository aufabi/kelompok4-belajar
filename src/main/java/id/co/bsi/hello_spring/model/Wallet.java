package id.co.bsi.hello_spring.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Data
@Table
@Entity

public class Wallet {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long user_id;
    private String account_number;
    private Long balance;
    private Date created_at;
    private Date updated_at;
}
