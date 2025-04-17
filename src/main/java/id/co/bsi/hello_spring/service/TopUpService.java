package id.co.bsi.hello_spring.service;

import id.co.bsi.hello_spring.model.Topup;
import id.co.bsi.hello_spring.repository.TopUpRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class TopUpService {

    private TopUpRepository topUpRepository;

    public List<Topup> getTopUp() {
        return this.topUpRepository.findAll();
    }


}
