package id.co.bsi.hello_spring.service;

import id.co.bsi.hello_spring.dto.response.HistoryResponse;
import id.co.bsi.hello_spring.model.Transaction;
import id.co.bsi.hello_spring.repository.HistoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class HistoryService {

    @Autowired
    private HistoryRepository historyRepository;

    public List<HistoryResponse> getAllHistory() {
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");

        return historyRepository.findAll().stream().map(transaction -> {
            HistoryResponse response = new HistoryResponse();
            response.setDate(formatter.format(transaction.getTransactionDate()));
            response.setType(transaction.getTransactionType());
            response.setFromto("Wallet " + transaction.getRecipientWalletId());
            response.setDescription(transaction.getDescription());
            response.setAmount("Rp " + transaction.getAmount().toString());
            return response;
        }).collect(Collectors.toList());
    }
}
