package com.expensecontrol.entity.dto;

import com.expensecontrol.enums.ShabbyType;
import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.Column;
import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class FinancialMovementDto {

    private Long id;

    @NotBlank(message="Campo Obrigatório")
    @Size(min = 3, max=255, message="campo com no mínimo 3 e no máximo de 255 caracteres.")
    private String name;

    @NotNull(message = "Campo Obrigatório")
    @DecimalMin(value = "0.99", inclusive = false, message = "Valor minimo 0.99")
    private BigDecimal value;
    private ShabbyType type;

    @JsonFormat(pattern = "yyyy/MM/dd HH:mm:ss", locale = "pt-BR", timezone = "Brazil/East")
    private LocalDateTime dateHour;
}
