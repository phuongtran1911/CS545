package com.phoenix.ecommerce.domain;

import lombok.Data;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Data
@Entity
public class User {
    @Id
    @GeneratedValue
    private Long id;
    @Column(nullable=false, unique=true)
    @NotBlank
    private String username;
    @Column(nullable=false, unique=true)
    @NotBlank
    @Email(message="{errors.invalid_email}")
    private String email;
    @Column(nullable=false)
    @NotBlank
    @Size(min=4)
    private String password;
//    private String passwordResetToken;
    @Enumerated(EnumType.STRING)
    private Role role;
}
