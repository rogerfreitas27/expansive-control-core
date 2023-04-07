package com.expensecontrol.enums;

public enum Profile {

    REVENUE("Client")
    , EXPENSE("User");
    private String description;
    Profile(String description){this.description = description;}
}
