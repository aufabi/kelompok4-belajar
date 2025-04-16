package id.co.bsi.hello_spring.dto.response;

import lombok.Data;

@Data
public class TopUpResponse {
    private int amount;
    private String notes;
    private String from;
    private String status;
}
