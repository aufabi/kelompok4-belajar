package id.co.bsi.hello_spring.controller;

import id.co.bsi.hello_spring.dto.response.HistoryResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

public class HistoryController {
    @GetMapping("api/history")
    public ResponseEntity<HistoryResponse> getHistory (){
        HistoryResponse historyResponse = new HistoryResponse();
        historyResponse.setDate("16/04/2025");
        historyResponse.setType("Transfer");
        historyResponse.setFromto("Ikbal");
        historyResponse.setDescription("Bayar hutang");
        historyResponse.setAmount("Rp 1.500.000");

        return ResponseEntity.ok(historyResponse);
    }
}
