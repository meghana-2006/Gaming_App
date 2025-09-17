package com.Meghana.Gaming_app.controller;

import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Meghana.Gaming_app.entity.Recharge;
import com.Meghana.Gaming_app.service.RechargeService;

@RestController
@RequestMapping("/api/recharges")
public class RechargeController {

    private final RechargeService rechargeService;

    public RechargeController(RechargeService rechargeService) {
        this.rechargeService = rechargeService;
    }

    @GetMapping
    public List<Recharge> getAllRecharges() {
        return rechargeService.getAllRecharges();
    }

    @GetMapping("/{id}")
    public Recharge getRechargeById(@PathVariable String id) {
        return rechargeService.getRechargeById(id);
    }

    @PostMapping
    public Recharge createRecharge(@RequestBody Recharge recharge) {
        return rechargeService.saveRecharge(recharge);
    }

    @DeleteMapping("/{id}")
    public void deleteRecharge(@PathVariable String id) {
        rechargeService.deleteRecharge(id);
    }
}
