package com.expensecontrol.controller;


import com.expensecontrol.entity.FinancialMovement;
import com.expensecontrol.service.FinancialMovementService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequestMapping("api/financialMovement")
public class FinancialMovementController {

    @Autowired
    private FinancialMovementService service;

    @PostMapping
    @Operation(summary = "Endpoint para cadastro de carro")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "201", description = "Carro cadastrado com sucesso "),
            @ApiResponse(responseCode = "400", description = "Falha ao cadastrar"),

    })
    public ResponseEntity<?> save(@RequestBody List<FinancialMovement> financialMovement) {
        service.create(financialMovement);
        return ResponseEntity.status(HttpStatus.OK).body("Cadastro realizado");

    }



    @GetMapping
    public ResponseEntity<?> teste() {

        return ResponseEntity.status(HttpStatus.OK).body("Teste retorno");

    }
    
}
