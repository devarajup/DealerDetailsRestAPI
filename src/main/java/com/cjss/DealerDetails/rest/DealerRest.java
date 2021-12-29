package com.cjss.DealerDetails.rest;

import com.cjss.DealerDetails.model.Dealer;
import com.cjss.DealerDetails.service.DealerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DealerRest {
    @Autowired
    private DealerService service;

    @PostMapping("/add")
    public void addDealer(@RequestBody Dealer dealer){
    service.addDealer(dealer);
    }
    @GetMapping("/getone")
    public  Dealer  getDealerOne(@RequestParam Integer id){
        return   service.getDealerOne(id);
    }
    @GetMapping("/getall")
    public List<Dealer>  getDealerAll(){
        return  service.getDealerAll();
    }
    @DeleteMapping("/removeone")
    public Integer removeOneDealer(@RequestParam  Integer id) {
        return service.removeOneDealer(id);
    }

    @DeleteMapping("/removeall")
    public String removeAllDealers() {
        return service.removeAllDealers();
    }

    @PatchMapping("/update")
    public String updateDealer(@RequestParam Integer id,
                               @RequestBody Dealer dealer) {

        return service.updateDealerDeatails(id, dealer);
    }
}
