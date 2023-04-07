package com.expensecontrol.entity;


import com.expensecontrol.enums.ShabbyType;
import jakarta.persistence.*;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Data
public class Simulation {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;
    @Column(name = "NAME")
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
