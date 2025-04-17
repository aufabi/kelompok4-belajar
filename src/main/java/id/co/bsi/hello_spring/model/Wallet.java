package id.co.bsi.hello_spring.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;

import java.util.Date;

@Data
@Table
@Entity

public class Wallet {
    private Long id;
    private Long user_id;
    private String account_number;
    private Long balance;
    private Date created_at;
    private Date updated_at;
}
