package com.expensecontrol.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class AuthenticatedUser {
    @Id
    private Long id;
    private String name;
    private String email;
    private String profile;

}
