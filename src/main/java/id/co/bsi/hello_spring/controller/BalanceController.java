package id.co.bsi.hello_spring.controller;

import id.co.bsi.hello_spring.dto.response.BalanceResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

public class BalanceController {
    @GetMapping("api/balance")
    public ResponseEntity<BalanceResponse> getBalance (){
        BalanceResponse balanceResponse = new BalanceResponse();
        balanceResponse.setAmount(100000000);

        return ResponseEntity.ok(balanceResponse);
    }
}
