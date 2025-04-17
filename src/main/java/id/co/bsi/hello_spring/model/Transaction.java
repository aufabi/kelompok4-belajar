package id.co.bsi.hello_spring.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;

import java.util.Date;

@Data
@Table
@Entity
public class Transaction {
    private Long id;
    private Long walletId;
    private String transactionType;
    private Long amount;
    private Long recepientWalletId;
    private Date transactionDate;
    private String description;
}