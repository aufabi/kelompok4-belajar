package id.co.bsi.hello_spring.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Data
@Entity
@Table(name = "transaction")
public class Transaction {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long walletId;
    private String transactionType;
    private Long amount;
    private Long recipientWalletId;
    private Date transactionDate;
    private String description;
}
