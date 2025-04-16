package id.co.bsi.hello_spring.dto.request;

import lombok.Data;

@Data
public class TopUpRequest {
    private int amount;
    private String notes;
    private String from;
}
