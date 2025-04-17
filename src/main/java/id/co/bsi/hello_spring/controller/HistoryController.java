package id.co.bsi.hello_spring.controller;

import id.co.bsi.hello_spring.dto.response.HistoryResponse;
import id.co.bsi.hello_spring.service.HistoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/history")
public class HistoryController {

    @Autowired
    private HistoryService historyService;

    @GetMapping
    public ResponseEntity<List<HistoryResponse>> getHistory() {
        List<HistoryResponse> historyList = historyService.getAllHistory();
        return ResponseEntity.ok(historyList);
    }
}
