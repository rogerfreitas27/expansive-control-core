package com.expensecontrol.repository;

import com.expensecontrol.entity.FinancialMovement;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FinancialMovementRepository extends JpaRepository<FinancialMovement,Long> {
}
