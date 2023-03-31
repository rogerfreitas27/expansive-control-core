package com.expensecontrol.enums;

public enum ShabbyType {
     REVENUE("Receita")
     , EXPENSE("Despesa");  
     private String description;
     
     ShabbyType(String description){
     this.description = description;
     }

     
}
