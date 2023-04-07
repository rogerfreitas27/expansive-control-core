package com.expensecontrol.entity;

import com.expensecontrol.enums.Profile;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class AuthenticatedUser {
    @Id
    private Long id;
    private String name;
    private String email;
    private Profile profile;

}
