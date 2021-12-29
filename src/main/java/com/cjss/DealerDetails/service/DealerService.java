package com.cjss.DealerDetails.service;

import com.cjss.DealerDetails.model.Dealer;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Service
public class DealerService {
    Map<Integer, Dealer> dealerMap = new HashMap<Integer, Dealer>();

    public void addDealer(Dealer dealer) {
        dealerMap.put(dealer.getId(), dealer);
    }

    public Dealer getDealerOne(Integer id) {
        return dealerMap.get(id);
    }

    public List<Dealer> getDealerAll() {
        return dealerMap.entrySet().stream().map(integerDealerEntry -> integerDealerEntry.getValue()).collect(Collectors.toList());
    }


    public Integer removeOneDealer(Integer id) {
        dealerMap.remove(id);
        return id;
    }

    public String removeAllDealers() {
        dealerMap.clear();
        return "remove all";
    }

    public String updateDealerDeatails(Integer id, Dealer dealer) {
        if (dealer.getId() != null)
            dealerMap.remove(dealer.getId());

        dealerMap.remove(dealer.getId());
        dealerMap.put(id, dealer);
        return id + " upadated";
    }
}
