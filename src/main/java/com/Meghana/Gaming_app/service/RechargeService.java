package com.Meghana.Gaming_app.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.Meghana.Gaming_app.entity.Recharge;
import com.Meghana.Gaming_app.repository.RechargeRepository;

@Service
public class RechargeService {

    private final RechargeRepository rechargeRepository;

    public RechargeService(RechargeRepository rechargeRepository) {
        this.rechargeRepository = rechargeRepository;
    }

    public List<Recharge> getAllRecharges() {
        return rechargeRepository.findAll();
    }

    public Recharge getRechargeById(String id) {
        return rechargeRepository.findById(id).orElse(null);
    }

    public Recharge saveRecharge(Recharge recharge) {
        return rechargeRepository.save(recharge);
    }

    public void deleteRecharge(String id) {
        rechargeRepository.deleteById(id);
    }
}
