package id.co.bsi.hello_spring.controller;

import id.co.bsi.hello_spring.dto.request.TopUpRequest;
import id.co.bsi.hello_spring.dto.response.TopUpResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TopUpController {
    @PostMapping("/api/topup")
    public ResponseEntity<TopUpResponse> topUp(@RequestBody TopUpRequest topUpRequest) {

        TopUpResponse topUpResponse = new TopUpResponse();
        if (topUpRequest.getAmount() <= 0 || topUpRequest.getFrom() == null || topUpRequest.getFrom().isEmpty()) {
            topUpResponse.setStatus("failed");
            topUpResponse.setNotes("Invalid request: amount must be > 0 and 'from' must not be empty");
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(topUpResponse);
        }

        topUpResponse.setAmount(topUpRequest.getAmount());
        topUpResponse.setFrom(topUpRequest.getFrom());
        topUpResponse.setNotes(topUpRequest.getNotes());
        topUpResponse.setStatus("success");
        return ResponseEntity.ok(topUpResponse);
    }
}