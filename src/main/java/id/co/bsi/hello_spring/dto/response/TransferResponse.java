package id.co.bsi.hello_spring.dto.response;

import lombok.Data;

@Data
public class TransferResponse {
    private String message;
    private String fromUserId;
    private String toUserId;
    private int transferredAmount;
    private int remainingBalance;
}
