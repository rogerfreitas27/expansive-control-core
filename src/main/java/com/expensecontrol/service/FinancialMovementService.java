package com.expensecontrol.service;

import com.expensecontrol.entity.FinancialMovement;
import com.expensecontrol.repository.FinancialMovementRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FinancialMovementService {

    @Autowired
    FinancialMovementRepository repository;
    @Transactional
    public void create(List<FinancialMovement> movementList){

        repository.saveAll(movementList);
    }

}
