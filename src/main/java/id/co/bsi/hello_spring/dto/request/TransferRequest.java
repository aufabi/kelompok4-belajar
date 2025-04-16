package id.co.bsi.hello_spring.dto.request;

import lombok.Data;

@Data
public class TransferRequest {
    private String fromUserId;
    private String toUserId;
    private int amount;
    private String notes;
}
