package id.co.bsi.hello_spring.controller;

import id.co.bsi.hello_spring.dto.request.TransferRequest;
import id.co.bsi.hello_spring.dto.response.TransferResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/transfer")
public class TransferController {

    @PostMapping
    public ResponseEntity<TransferResponse> transfer(@RequestBody TransferRequest request) {
        int senderBalance = 10000;

        if (request.getAmount() > senderBalance) {
            TransferResponse failedResponse = new TransferResponse();
            failedResponse.setMessage("Transfer failed: insufficient balance");
            failedResponse.setFromUserId(request.getFromUserId());
            failedResponse.setToUserId(request.getToUserId());
            failedResponse.setTransferredAmount(0);
            failedResponse.setRemainingBalance(senderBalance);

            return new ResponseEntity<>(failedResponse, HttpStatus.BAD_REQUEST);
        }

        int newSenderBalance = senderBalance - request.getAmount();

        TransferResponse response = new TransferResponse();
        response.setMessage("Transfer successful");
        response.setFromUserId(request.getFromUserId());
        response.setToUserId(request.getToUserId());
        response.setTransferredAmount(request.getAmount());
        response.setRemainingBalance(newSenderBalance);

        return new ResponseEntity<>(response, HttpStatus.OK);
    }
}
