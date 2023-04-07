package com.expensecontrol.entity;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import com.expensecontrol.enums.ShabbyType;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;
import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
@Entity
public class FinancialMovement {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;
    @Column(name="NAME")
    private String name;
    @Column(name="VALUE")
    private BigDecimal value;
    private ShabbyType type;
    @Column(name="DATE_HOUR")
    private LocalDateTime dateHour;
    @ManyToOne
    @JoinColumn(name = "RF_CLIENT", referencedColumnName = "ID")
    private AuthenticatedUser authenticatedUser;
}
