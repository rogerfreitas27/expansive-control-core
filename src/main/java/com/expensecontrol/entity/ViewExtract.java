package com.expensecontrol.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Getter
@RequiredArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "VIEW_EXTRACT")
public class ViewExtract {

    @Id
    @Column(name = "ID_FINANCIAL")
    private Long idFinancial;

    @Column(name = "NAME")
    private String name;

    @Column(name = "ID_CLIENT")
    private Long idClient;

    @Column(name = "TRANSACTIONS")
    private BigDecimal value;

    @Column(name = "TYPE_TRANSACTION")
    private char acronym;
    @Column(name = "DATE_HOUR")
    private LocalDateTime dateHour;
    private BigDecimal sum;
}
