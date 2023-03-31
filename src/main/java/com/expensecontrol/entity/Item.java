package com.expensecontrol.entity;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import com.expensecontrol.enums.ShabbyType;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Item {
    @Id
    private Long id;
    private String name;
    private BigDecimal value;
    private ShabbyType type;
    private LocalDateTime dateTime;
    
}
